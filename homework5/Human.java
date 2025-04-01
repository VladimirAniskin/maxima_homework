package homework5;

public class Human {

    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private int age;

    public Human( String firstName,
                 String lastName,
                 String patronymic,
                 int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Фамилия - " + lastName);
        System.out.println("Имя - " + firstName);
        System.out.println("Отчество - " + patronymic);
        System.out.println("Возраст - " + age);
        System.out.println("*****************************");
    }

    //1|Igonin|Oleg|Leopoldovich|28
    public String toString() {
        return getId() + "/" + getLastName() + "/"
                + getFirstName() + "/" + getPatronymic() + "/" + getAge();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
