public interface UserController <T extends  User>{
    void create(String firstName, String lastName, String middleName);
    void show(String firstName, String lastName, String middleName);
    void edit(String firstName, String lastName, String middleName);
}
