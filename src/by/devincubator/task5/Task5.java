package by.devincubator.task5;

public class Task5 {
    public static void main(String[] args) {
        GeneralIndicatorsMonitoringModule monitoringModule = new GeneralIndicatorsMonitoringModule() {
            public void startMonitoring() {
                System.out.println("Monitoring of general indicators has started!");
            }
        };
        ErrorMonitoringModule errorMonitoringModule = new ErrorMonitoringModule() {
            public void startMonitoring() {
                System.out.println("Bug tracking monitoring has started!");
            }
        };
        SecurityModule securityModule = new SecurityModule() {
            public void startMonitoring() {
                System.out.println("Security monitoring has started!");
            }
        };

        monitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
