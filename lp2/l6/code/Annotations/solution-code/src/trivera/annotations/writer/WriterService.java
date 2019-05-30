package trivera.annotations.writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2019 Trivera Technologies, LLC http://www.triveratech.com
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
public class WriterService {

	/**
	 * Write object instance to file	
	 * @param obj the object to Serialize
	 */
	public void writeObject(Serializable obj) {
		//CODE3:Implement the reflection logic required to write object to disk
		Class<? extends Serializable> clazz = obj.getClass();

		if (!clazz.isAnnotationPresent(Persist.class)) {
			throw new RuntimeException(clazz.getName() + " does not contain the Persist annotation");
		}

		Persist persistAnnotation = clazz.getAnnotation(Persist.class);
		String filename = persistAnnotation.filename();
		Object identifier = null;

		for (Method method : clazz.getMethods()) {

			if (method.isAnnotationPresent(Identifier.class)) {

				try {
					identifier = method.invoke(obj);
				} catch (IllegalAccessException | InvocationTargetException e) {
					System.out.println("Error while trying to invoke identifier method: " + method.getName());
				}
			}

		}

		writeObject(obj, filename, identifier);
	}

	/**
	 * Write object instance to file	
	 * @param obj the object to Serialize
	 * @param filename The filename (without extension!)
	 */
	private void writeObject(Serializable obj, String filename) {
		writeObject(obj, filename, null);
	}

	/**
	 * Write object instance to file	
	 * @param obj the object to Serialize
	 * @param filename The filename (without extension!)
	 * @param identifier the identifier value of this instance
	 */
	private void writeObject(Serializable obj, String filename, Object identifier) {

		StringBuilder sb = new StringBuilder(filename);
		if (identifier != null) {
			sb.append("-").append(identifier.toString());
		}
		sb.append(".ser");
		File outputFile = new File(sb.toString());
		try (FileOutputStream fos = new FileOutputStream(outputFile);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(obj);

			System.out.println("Created " + outputFile.getAbsolutePath());

		} catch (IOException ioe) {
			System.out.println(String.format("Error writing %s : %s", outputFile, ioe.getMessage()));
			ioe.printStackTrace();
		}
	}
}
