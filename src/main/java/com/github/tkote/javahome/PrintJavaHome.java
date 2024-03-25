package com.github.tkote.javahome;

import java.io.File;

/**
 * print java.home
 *
 */
public class PrintJavaHome 
{

    private static Boolean checkFlag(String[] args, String fShort, String fLong){
        for(String arg : args){
            if(arg.equals("-".concat(fShort)) || arg.equals("--".concat(fLong))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {

        final boolean verbose = checkFlag(args, "v", "verbose");

        final String javaHome = System.getProperty("java.home").replaceAll(File.separator + "jre$", "");
        System.out.print(javaHome);
        if(verbose) System.err.println(String.format("\njava.home=%s", javaHome));
    }
}
