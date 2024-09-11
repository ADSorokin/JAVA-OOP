

import java.util.List;

public class StudentController implements UserController<Student> {

    private List<StudentStream> studentStreams;
    private  final StudentGroupService studentGroupService = new StudentGroupService();
    private  final StudentStreamService studentStreamService= new StudentStreamService();


    private final  StudentView studentView = new StudentView();

    public StudentController(List<StudentStream> studentStreams) {
        this.studentStreams = studentStreams;
    }
    public List<Student> getSortedStudentList(){
        List<Student> studentList= studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);

        return studentList;
    }
    public void  removeStudentByFIO(String firstName, String lastName, String middleName){
         studentGroupService.removeStudentByFIO(firstName,lastName,middleName);

    }

    public List<Student>getSortedStudentByFIO() {
        List<Student> studentList= studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<StudentStream> getSortedStream(List<StudentStream> studentStreams){
       return studentStreamService.getSortedStreamList(this.studentStreams);
    }


    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);


    }

    @Override
    public void addItem() {

    }



    @Override
    public void updateItem(int index) {

    }

    @Override
    public void displayAll() {

    }
}






