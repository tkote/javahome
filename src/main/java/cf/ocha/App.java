package cf.ocha;

import java.io.File;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Options options = new Options();
        Option vOpt = Option.builder("v")
            .longOpt("verbose")
            .hasArg(false)
            .desc("verbose mode")
            .build();
        options.addOption(vOpt);
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
            HelpFormatter hf = new HelpFormatter();
            hf.printHelp("[options]", options);
            System.exit(1);
        }

        final boolean verbose = cmd.hasOption("v");

        final String javaHome = System.getProperty("java.home").replaceAll(File.separator + "jre$", "");
        if(verbose) System.err.println(String.format("java.home=%s", javaHome));
        System.out.print(javaHome);
        if(verbose) System.err.println();
    }
}
