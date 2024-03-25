
# printjavahome

## Prerequisites

``` bash
$ sudo alternatives --install /usr/bin/java java /home/opc/opt/jdk-11.0.6/bin/java 11

$ sudo alternatives --install /usr/bin/java java /home/opc/opt/jdk1.8.0_241/bin/java 8

$ sudo alternatives --config java

There are 2 programs which provide 'java'.

  Selection    Command
-----------------------------------------------
*+ 1           /home/opc/opt/jdk-11.0.6/bin/java
   2           /home/opc/opt/jdk1.8.0_241/bin/java
```

## How to use

switch both java path and JAVA_HOME env at once

``` bash

# switch java path
sudo alternatives --config java

# set JAVA_HOME
JAVA_HOME=$(java -jar printjavahome.jar)
export JAVA_HOME

echo "JAVA_HOME=${JAVA_HOME}"
echo ""
```

or set an alias in .bashrc

```
alias setjavahome="JAVA_HOME=$(java -jar printjavahome.jar);export JAVA_HOME"
```

You can run App.java without compilation with JDK 11+

```
$ java src/main/java/com/github/tkote/javahome/PrintJavaHome.java
```

There is a jshell version

```
$ $JAVA_HOME/bin/jshell printjavahome.jsh
```
