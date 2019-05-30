package trivera.jpa.util;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera
 * Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2019 Trivera Technologies, LLC. http://www.triveratech.com
 * 
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
@ApplicationScoped
public class JavaSEEntityManager {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	@PostConstruct
	protected void init() {
		// Create a new EntityManagerFactory for the persistence unit defined in
		// the persistence.xml
		entityManagerFactory = Persistence.createEntityManagerFactory("reservationUnit");
		// Obtain a new EntityManager instance
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Produces
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PreDestroy
	protected void close() {
		if (entityManager != null && entityManager.isOpen()) {
			entityManager.close();
		}
		if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
			entityManagerFactory.close();
		}
	}
}
