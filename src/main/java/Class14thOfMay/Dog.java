package Class14thOfMay;

import java.sql.SQLOutput;

public class Dog {
    String breed; //instance variable, referencable throughout the class
    static int amountOfDogs = 0;

    Dog(String breed) { // instance variables, these have a scope i.e. are referencable throughout the class
        this.breed = breed;
        amountOfDogs++;
    }

    int a;

    void bark(boolean isScared) { // method parameter -> local variable.
        // the variable isScared only exists in this scope, meaning:
        // from the first accolade, to the last
        if (isScared) {
            a = 10;  // works, since we've declared it a scope block earlier
           // int a = 10; doesn't work, since it's a local variable that exists only within this scope block
            System.out.println("BARK");
        } else {
            // int a = 15; doesn't work, since it's a local variable that exists only within this scope block
            a = 15; // works, since we've declared it a scope block earlier
            System.out.println("Bark");
        }
    }

    void eat() {

        //System.out.println(isScared); // isScared = outside of scope!
        //System.out.println(amount); doesn't work, since amount is defined after this print command

        int amount = 0; // local variable
        for (int i = 0; i < 10; i++) {
            System.out.println(amount); // works, since amount is declared in this scope
            int age = 10; // = block scope variable!
            amount++; // works, since it is declared earlier in the scope

            // int amount = 10; isn't allowed, since the variable is already declared earlier in the block
        }
        //System.out.println(age); // doesn't work, outside of scope. Local variable!
        //System.out.println(i); // also doesn't work. Local variable!
    }
    int amount = 11; // works again, since it doesn't 'exist' outside of the above block scope :)
}
