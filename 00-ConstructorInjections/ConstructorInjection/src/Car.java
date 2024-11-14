public class Car {


    private Engine engine;
    //constructor dependency injections
//    public Car(Engine engine){
//        this.engine = engine;
//    }

    public void drive(){
        engine.start();
        System.out.println("Starts driving....");
    }

    //setter injections
    public void setEngine(Engine engine){
        this.engine = engine;
    }

}
