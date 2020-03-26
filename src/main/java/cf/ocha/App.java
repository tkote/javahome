package cf.ocha;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final String javaHome = System.getProperty("java.home").replaceAll("/jre$", "");
        System.err.println(String.format("java.home=%s", javaHome));
        System.out.print(javaHome);
        System.err.println();
    }
}
