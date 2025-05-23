package Class16thOfMay;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Henk", "Henk@school.nl");
        Student s1 = new Student("Josh", 123);

        System.out.println("Student name " +  s1.getName());
        System.out.println("Student id " + s1.getId());

        System.out.println("Teacher name " +  t1.getName());
        System.out.println("Teacher mail " + t1.getMail());

       s1.setName("Joshua");
       s1.setId(12345);

       t1.setName("Pieter");
       t1.setMail("Pieter@school.nl");

        System.out.println(t1.getName());
        System.out.println(t1.getMail());

        System.out.println(s1.getName());
        System.out.println(s1.getId());
    }





}

