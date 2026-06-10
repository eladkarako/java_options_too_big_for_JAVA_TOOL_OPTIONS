import java.lang.management.ManagementFactory;
import java.util.Properties;

public class ShowOptions {
    public static void main(String[] args) {
        
        System.out.println("java command line (as seen by the process):");
        for (int i = 0; i < args.length; i++) {
            System.out.printf("  [%d] %s%n", i, args[i]);
        }
        
        System.out.println( System.lineSeparator() );

        //
        System.out.println("JVM input arguments (flags passed to the JVM):");
        for (String s : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
            System.out.println("  " + s);
        }
        
        System.out.println( System.lineSeparator() );

        System.out.println("\nSystem properties (filtered):");
        Properties p = System.getProperties();
        String[] keys = p.stringPropertyNames().stream().sorted().toArray(String[]::new);
        for (String k : keys) {
            System.out.printf("  %s=%s%n", k, p.getProperty(k));
        }

        System.out.println( System.lineSeparator() );

        System.out.println("\nEffective classpath:");
        System.out.println("  " + System.getProperty("java.class.path"));
    }
}
