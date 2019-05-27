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