//package codingDrills.strings;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Test3 {


    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(5);

        int i = 0;
        Increment increment = new Increment(i);
        increment.run();
        executor.execute(increment);
        System.out.println(increment.iCounter);

        ServiceA service = new ServiceAImpl();
        service.whoami();


    }
}

class Increment implements Runnable {
    int iCounter ;
    public Increment(int i){
        iCounter = i;
    }

    @Override
    public void run(){

        for (int i = 0; i < 4; i++) {
            iCounter+=1;
        }
//        System.out.println(iCounter);
    }
}

//@Service
interface ServiceA{
    public void whoami();
}
class ServiceAImpl implements ServiceA{
    public void whoami(){
        System.out.println("Service A Implements");
    }
}

class ServiceBImpl implements ServiceA{
    public void whoami(){
        System.out.println("Service B Implements");
    }
}


//@RequiredAllArgument
class RestAontrollerA{
//    @Autowired
//    @Qualify("ServiceAImpl")
    final ServiceA serviceA;
    public RestAontrollerA(ServiceA serviceA){
        this.serviceA = serviceA;
    }

}

class RestAontrollerB{
    ServiceBImpl serviceB;
    public RestAontrollerB(ServiceBImpl serviceB){
        this.serviceB = serviceB;
    }

}
