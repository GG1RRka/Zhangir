package service;

public class ServiceD {
    private ServiceC serviceC;

    public ServiceD(ServiceC serviceC) {
        this.serviceC = serviceC;
    }

    public void methodD() {
        System.out.println("class (ServiceD) method called");
        serviceC.methodC();
    }
}
