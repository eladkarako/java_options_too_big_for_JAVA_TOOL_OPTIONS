::@echo off
chcp 65001 1>nul 2>nul
pushd "%~sdp0"

::-------------------------------------------- compile to class

"javac.exe" ShowOptions.java
echo.
echo.
echo.

::-------------------------------------------- make into jar with runnable class

"jar.exe" cfm ShowOptions.jar manifest.txt ShowOptions.class
echo.
echo.
echo.

::-------------------------------------------- make into jar with runnable class

"java.exe" @options.txt -jar ShowOptions.jar 1>"report.txt"
echo.
echo.
echo.


