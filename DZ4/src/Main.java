public class Main {
    public static void main(String[] args) {
        TeacherService service = new TeacherService();
        TeacherView view = new TeacherView();
        TeacherController controller = new TeacherController(service, view);


        controller.addItem();
        controller.addItem();
        controller.addItem();
        controller.displayAll();
        controller.updateItem(2);
        controller.displayAll();
    }
}