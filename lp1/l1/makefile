find . -name .DS_Store -type f -delete
find . -name .project -type f -delete
find . -name .classpath -type f -delete
rm -rf `find . -name .settings -type d`
rm -rf `find . -name target -type d`

find . -type f -exec sed -i 's/<string1>/<string2>/g' {} +

zip -r code.zip code

javac -d bin -sourcepath src $(find ./ -name "*.java")
jar cvf program.jar -C path/to/classes .
java -cp program.jar trivera.update.lambda.compare.LambdaCompare

javac -d bin -sourcepath src -cp ../junit-platform-console-standalone-1.4.2.jar src/trivera/storage/StringArrayTest.java
javac -d bin -cp ../junit-platform-console-standalone-1.4.2.jar `find -name "*.java"`
java -jar ../junit-platform-console-standalone-1.4.2.jar -cp bin/ -c trivera.storage.StringArrayTest


theia@f02aa1b9a77d:/home/project/lp2/l2/code/DynamicArray/lab-code$ java -jar ../junit-platform-console-standalone-1.4.2.jar -cp target/classes/ -c trivera.storage.StringArrayTest

pushd /opt && \
sudo curl -O https://www-us.apache.org/dist/maven/maven-3/3.6.1/binaries/apache-maven-3.6.1-bin.tar.gz  && \
sudo tar -xvf apache-maven-3.6.1-bin.tar.gz  && \
export PATH=/opt/apache-maven-3.6.1/bin:$PATH && \
popd

mvn -version

sudo add-apt-repository ppa:openjdk-r/ppa
sudo apt-get update
sudo apt install -y openjdk-11-jdk
java -version

/usr/libexec/java_home -V
export JAVA_HOME=`/usr/libexec/java_home -v 11.0.2`


java -cp Module_MovieClient/target/module.movie.client-1.0-RELEASE.jar:Module_MovieService/target/module.movie.service-1.0-RELEASE.jar:Module_MovieData/target/module.movie.data-1.0-RELEASE.jar trivera.movie.client.MovieClient

==========================

javalab/lp2/l6/code/JDBC/Database $ DERBY_HOME=./Derby
javalab/lp2/l6/code/JDBC/Database $ java -jar $DERBY_HOME/lib/derbyrun.jar server start -p 50505

javalab/lp2/l6/code/JDBC/solution-code/target $ java -cp jdbc.intro-1.0-RELEASE.jar:../../lib/derbyclient.jar trivera.jdbc.Client
javalab/lp2/l6/code/JDBC/Database/Derby/lib $ java -cp derbytools.jar:derbyclient.jar org.apache.derby.tools.ij
connect 'jdbc:derby://localhost:50505/MovieDB';
SELECT MOVIE_ID, MOVIE_TITLE,STUDIO, PRICE, RATING, GENRE, RELEASE_DATE FROM MOVIES WHERE RATING = 'R';

==========================

javalab/lp2/l6/code/JPA/solution-code/target $ java -cp jpa.overview-0.0.1-SNAPSHOT.jar:../../lib/* trivera.jpa.client.Application

javalab/lp2/l6/code/JPA/Database/Derby/lib java -cp derbytools.jar:derbyclient.jar org.apache.derby.tools.ij

ij version 10.9
ij> connect 'jdbc:derby://localhost:50505/ReservationDB';
ij> select * from T001_RESERVATION;
ERROR 42X05: Table/View 'T001_RESERVATION' does not exist.
ij> show tables;
TABLE_SCHEM         |TABLE_NAME                    |REMARKS
------------------------------------------------------------------------
SYS                 |SYSALIASES                    |
SYS                 |SYSCHECKS                     |
SYS                 |SYSCOLPERMS                   |
SYS                 |SYSCOLUMNS                    |
SYS                 |SYSCONGLOMERATES              |
SYS                 |SYSCONSTRAINTS                |
SYS                 |SYSDEPENDS                    |
SYS                 |SYSFILES                      |
SYS                 |SYSFOREIGNKEYS                |
SYS                 |SYSKEYS                       |
SYS                 |SYSPERMS                      |
SYS                 |SYSROLES                      |
SYS                 |SYSROUTINEPERMS               |
SYS                 |SYSSCHEMAS                    |
SYS                 |SYSSEQUENCES                  |
SYS                 |SYSSTATEMENTS                 |
SYS                 |SYSSTATISTICS                 |
SYS                 |SYSTABLEPERMS                 |
SYS                 |SYSTABLES                     |
SYS                 |SYSTRIGGERS                   |
SYS                 |SYSUSERS                      |
SYS                 |SYSVIEWS                      |
SYSIBM              |SYSDUMMY1                     |
DEVELOPMENT         |T001_RESERVATION              |

24 rows selected
ij>
select * from development.T001_RESERVATION;
RESERVATIO&|DATE      |MOVIETITLE                                                                                                                      |NUMBEROFSE&|TIME
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1          |2019-05-30|Ice Age                                                                                                                         |2          |19:05:00
2          |2019-05-30|Guardians of the Galaxy                                                                                                         |4          |21:15:00
3          |2019-05-30|The Avengers                                                                                                                    |2          |23:45:00
4          |2019-05-30|Ice Age                                                                                                                         |2          |19:05:00
5          |2019-05-30|Guardians of the Galaxy                                                                                                         |4          |21:15:00
6          |2019-05-30|The Avengers                                                                                                                    |2          |23:45:00
7          |2019-05-30|Ice Age                                                                                                                         |2          |19:05:00
8          |2019-05-30|Guardians of the Galaxy                                                                                                         |4          |21:15:00
9          |2019-05-30|The Avengers                                                                                                                    |2          |23:45:00

9 rows selected
ij>

==========================

javalab/lp2/l6/code/CDI/solution-code/target $ java -cp cdi.intro-1.0-RELEASE.jar:../../lib/* trivera.movie.client.MovieClient