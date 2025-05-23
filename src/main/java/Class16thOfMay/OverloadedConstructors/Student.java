package Class16thOfMay.OverloadedConstructors;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void greet() {
        System.out.println("Hello dinges");
    }
    public void greet(String name) {
        System.out.println("Hallo " + name);
    }
    public void greet (String name, String language) {
        if (language == null) {
            System.out.println("Hola! " + name);
        } else if (language.equals("nl")) {
            System.out.println("Hallo " + name);
        } else if (language.equals("ru")) {
            System.out.println("Cyka! " + name);
        }
    }

}
