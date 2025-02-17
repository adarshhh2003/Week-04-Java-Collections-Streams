package reflection.advancedlevel.dependencyinjection;

public class ServiceA {
    public void execute() {
        System.out.println("ServiceA is executing...");
    }
}

class ServiceB {
    @Inject
    private ServiceA serviceA;  // This field will be injected by the DI container

    public void execute() {
        System.out.println("ServiceB is executing...");
        serviceA.execute();  // Use the injected dependency
    }
}