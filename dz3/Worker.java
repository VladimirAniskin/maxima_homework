package dz3;

public class Worker {
    private String name;
    private String lastName;
    private String pofession;

    public Worker(String name, String lastName, String pofession) {
        this.name = name;
        this.lastName = lastName;
        this.pofession = pofession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPofession() {
        return pofession;
    }

    public void setPofession(String pofession) {
        this.pofession = pofession;
    }

    public void goToWork() {
        System.out.println("Этот метод выводит кто работает и какая у него профессия");
    }

    public void goToVacation(int days) {
        System.out.println("Этот метод выводит сколько дне у кого отпуск");


    }

}
