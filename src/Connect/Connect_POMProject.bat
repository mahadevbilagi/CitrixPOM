set projectLocation=D:\WORK\CitrixPOM\src\Connect
cd %projectLocation%
set classpath=D:\WORK\CitrixPOM\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\Connect.TestNg.xml
pause