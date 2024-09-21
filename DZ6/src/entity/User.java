package entity;

/**
 * Делаем класс абстрактным и  закрываем от содания экземляров и изменений тк имеет в данном контексте он имеет законченный смысл  и  абстракную сущность
 * присущую всем его наследникам
 * тем самым соблюдая SRP  и OCP принцыпы
 *
 * */

public abstract class User {
    private String firstName;
    private String lastName;
    private String middleName;

   public User(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }



}
