public class car {
     
     int wheels;
     float fuel;
     int price;

     
    car(){
        wheels=4;
        price=100000;
          
    }
     
     public static void main(String[] args) {
        car myCar = new car();
        myCar.fuel = 10.0f; 
        driver myDriver = myCar.new driver();
        fuelPrice myPrice = myCar.new fuelPrice();
        vehicle myvehicle = myCar.new vehicle();
        myvehicle.start();
        myDriver.drive();
        myPrice.fuel();
        
        System.out.println(myCar.wheels);
         
     }
     
     public class vehicle{
      public void start() {
        System.out.println("Vehicle is starting");
      }
    }
     public class driver {
        public void drive() {
            System.out.println("The driver is driving");
            fuel--;
            System.out.println("The current full level is " + fuel);
        }
     }
    public class fuelPrice {

        public void fuel() {
            System.out.println("The price of running the car is increasing as fuel is being used.");
            price++;
            System.out.println("The fuel is "+ price);
        }
    }
}
