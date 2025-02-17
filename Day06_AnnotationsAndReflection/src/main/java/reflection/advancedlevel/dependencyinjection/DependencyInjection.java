package reflection.advancedlevel.dependencyinjection;

public class DependencyInjection {
    public static void main(String[] args) {
        // Create the DI container
        SimpleDIContainer diContainer = new SimpleDIContainer();

        // Register ServiceA in the DI container
        ServiceA serviceA = new ServiceA();
        diContainer.register(ServiceA.class, serviceA);

        // Register ServiceB in the DI container
        ServiceB serviceB = new ServiceB();
        diContainer.register(ServiceB.class, serviceB);

        try {
            // Inject dependencies into ServiceB
            diContainer.inject(serviceB);

            // Now we can call methods on ServiceB which uses injected ServiceA
            serviceB.execute();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
