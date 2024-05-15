
# printjavahome

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
alias setjavahome='JAVA_HOME=$(java -jar printjavahome.jar);export JAVA_HOME'
```

You can run PrintJavaHome.java without compilation with JDK 11+

```
$ java src/main/java/com/github/tkote/javahome/PrintJavaHome.java
```

There is a jshell version

```
$ $JAVA_HOME/bin/jshell printjavahome.jsh
```
