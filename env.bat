@echo off
echo Setting JAVA_HOME
set JAVA_HOME=C:\Users\Legend\.jdks\graalvm-ce-17
echo setting PATH
set PATH=%JAVA_HOME%\bin;%PATH%
echo Display java version
java -version
"C:\Program Files\Microsoft Visual Studio\2022\Community\VC\Auxiliary\Build\vcvars64.bat"