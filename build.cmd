javac -cp "classes;." -d classes src/com/example/hellojsp/model/*.java
javac -cp "%CATALINA_HOME%/lib/servlet-api.jar;classes;." -d classes src/com/example/hellojsp/web/*.java
