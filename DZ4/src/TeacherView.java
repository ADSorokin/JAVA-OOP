import java.util.List;
import java.util.Scanner;

public class TeacherView  implements UserView<Teacher> {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }

    public Teacher getTeacherDetailsFromUser() {
        System.out.print("Enter teacher's name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter teacher's last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter teacher's middle name: ");
        String middleName = scanner.nextLine();
        System.out.print("Enter teacher's subject: ");
        String subject = scanner.nextLine();


        return new Teacher(firstName,lastName,middleName,subject);

    }
}