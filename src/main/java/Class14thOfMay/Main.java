package Class14thOfMay;

public class Main {
    public static void main(String[] args) {
        // System.out.println(dog.breed); // doesn't work since it belongs to an instance variable
        // System.out.println(Dog.amountOfDogs); // prints none, since no dog has been created yet

        Dog pipi = new Dog("Jack Russel");
        System.out.println(pipi.breed);
        System.out.println(pipi.amountOfDogs);
        System.out.println(Dog.amountOfDogs); // prints 1

        Dog sammie = new Dog("Vuilnisbak");
        System.out.println(Dog.amountOfDogs);

        // Don't do this, always reference the class, not the instance in a class
        sammie.amountOfDogs = 100;
        System.out.println(pipi.amountOfDogs);

        // Better, since you start with the Class
        Dog.amountOfDogs = 101;
        System.out.println(Dog.amountOfDogs);

        int result = exponential.exponential(5,4);

    }
}




