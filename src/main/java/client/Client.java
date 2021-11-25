package client;


public class Client {
    private static int idCounter = 0;
    private int uniqueId;
    private Sex sex;
    private int age;
    private String name;
    private String email;

    public Client(String name, int age, Sex sex, String email) {
        this.uniqueId = idCounter;
        idCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}