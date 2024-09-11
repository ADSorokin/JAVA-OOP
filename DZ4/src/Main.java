public class Main {
    public static void main(String[] args) {
        TeacherService service = new TeacherService();
        TeacherView view = new TeacherView();
        TeacherController controller = new TeacherController(service, view);

        controller.addTeacher();
        controller.displayAllTeachers();
        controller.updateTeacher(1);
        controller.displayAllTeachers();
    }
}