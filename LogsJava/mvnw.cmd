@ECHO OFF
SETLOCAL
set BASEDIR=%~dp0
set WRAPPER_JAR=%BASEDIR%.mvn\wrapper\maven-wrapper.jar
"%JAVA_HOME%\bin\java" -classpath "%WRAPPER_JAR%" org.apache.maven.wrapper.MavenWrapperMain %*
