package Class9thOfMay;

public class Teacher {

    String name;
    String mail;

    public Teacher(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    void printDetails () {
        System.out.println("Name: " + name + " mail: " + mail);
    }
}
