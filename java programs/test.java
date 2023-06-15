abstract class vehical {
   
    public abstract void start();
    public abstract void stop();
    public abstract void accelerate();
    public abstract void brake();

    }   

class car extends vehical 
    {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void accelerate() {
        System.out.println("Car accelerated");
    }

    public void brake() {
        System.out.println("Car braked");
    }
}

class bike extends vehical 
    {
    public void start() {
        System.out.println("Bike started");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }

    public void accelerate() {
        System.out.println("Bike accelerated");
    }

    public void brake() {
        System.out.println("Bike braked");
    }
}
public class test {
    public static void main(String[] args) {
        car c = new car();
        bike b = new bike();
        c.start();
        c.stop();
        c.accelerate();
        c.brake();
        b.start();
        b.stop();
        b.accelerate();
        b.brake();
    }
}
