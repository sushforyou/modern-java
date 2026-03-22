
public class PlatformInfo {
    public static void main(String[] args) {
        System.out.println("JVM Version: "+ System.getProperty("java.vm.version"));
        System.out.println("JRE Version: "+ System.getProperty("java.runtime.version"));
        System.out.println("Java Home (JDK/JRE): "+ System.getProperty("java.home"));
        System.out.println("OS: "+ System.getProperty("os.name"));
    }
}
