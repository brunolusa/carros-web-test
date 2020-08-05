package envoriment;

public class EnvironmentInfo {

    public static boolean isRunningOnCI() {
        return System.getenv("CI") != null;
    }
}
