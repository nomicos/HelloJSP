xcopy /E /I /Y etc "%CATALINA_HOME%\webapps\HelloJSP\WEB-INF"
xcopy /E /I /Y classes "%CATALINA_HOME%\webapps\HelloJSP\WEB-INF\classes"
xcopy /E /I /Y web "%CATALINA_HOME%\webapps\HelloJSP"

REM Touch the web.xml prompting Tomcat to auto-deploy the new version.
type nul>>"%CATALINA_HOME%\webapps\HelloJSP\WEB-INF\web.xml"
