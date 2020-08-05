package utils;

public class Environment {

    private Environment() {
    }

    public static String getEnvironment() {
        return System.getProperty("env", EnvironmentInterface.HOM);
    }

    public interface EnvironmentInterface {

        String DEV = "dev";
        String HOM = "hom";

    }


}
