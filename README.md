I've jammed into `JAVA_TOOL_OPTIONS`,  
almost everything I got,  
it was very convenient until I've decided to dump every module and package name,  
and include a `--add-opens=java.base/com.sun.crypto.provider=ALL-UNNAMED` lines,  
just because I can..  

..well,  
my OS (after about 50 lines of appending to a variable in `cmd`), just told me,  
naaa you can't do that, there is a length limit.  

I did managed to trim down the list but,  
as most things, as the OS and CMD are just tools to pass throught those switches to the Java Virtual Machine,  
there are other ways to let the JVM have the use list of switches,  

unlike `JAVA_TOOL_OPTIONS` though,  
it is not implicit, but you have to include it in your command-line.  

<hr/>

here is a small and useful debug tool that just outputs the effective options.  
just make sure the `javac.exe` and `jar.exe` and `java.exe` are reachable, usually this is done by including the `JAVA_HOME/bin` in your system PATH. if you only want to run the jar - `java.exe` is only thing you need.  

<hr/>

the syntax is:  

`java.exe @options.txt -jar ShowOptions.jar 1>"report.txt"` (in-case you want to output the STDOUT to a text-file).  

note that if you have `JAVA_TOOL_OPTIONS` set, it will use it as well.  

<hr/>


<hr/>
<br/>


