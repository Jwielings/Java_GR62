package Class9thOfMay;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student ("1", "Mike");

        Teacher t1 = new Teacher ("Henk", "henk@mail.com");


        Course course = new Course(t1, s1);
        course.printDetails();






    }
}
