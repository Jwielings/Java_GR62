package Class9thOfMay;

public class Student {
    String ID;
    String name;

    public Student (String ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    void printDetails() {
        System.out.println("Student-name: " + this.name + " id" + this.ID);
    }
}

