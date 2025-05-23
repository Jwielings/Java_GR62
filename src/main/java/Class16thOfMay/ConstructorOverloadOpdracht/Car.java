package Class16thOfMay.ConstructorOverloadOpdracht;

public class Car {
    private String make;
    private String model;
    private int year;
    private Engine engine;

    public Car(String make, String model, int year, Engine engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.setEngine(engine);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        if (engine.getHorsepower() < 50) {
            System.out.println("Error: Engine too weak!");
        } else {
            System.out.println("The engine is powerful enough!");

        }
    }

        public String getMake () {
            return make;
        }

        public void setMake (String make){
            this.make = make;
        }

        public String getModel () {
            return model;
        }

        public void setModel (String model){
            this.model = model;
        }

        public int getYear () {
            return year;
        }

        public void setYear ( int year){
            this.year = year;
        }
    }
