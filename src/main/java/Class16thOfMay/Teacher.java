package Class16thOfMay;

public class Teacher {
    private String name;
    private String mail;

    public Teacher(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {

        if (mail.endsWith("@school.nl")) {
            this.mail = mail;

        }
    }
}


