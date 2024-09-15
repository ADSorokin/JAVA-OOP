package controller;
import model.*;
import service.DataService;
import service.StudentGroupService;
import view.StudentGroupView;
import view.StudentView;
import view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView= new StudentView();

    private final TeacherView teacherView= new TeacherView();

    private final StudentGroupView studentGroupView = new StudentGroupView();

    public  void  createStudent(String firstName, String lastName , String middleName){
        service.create(firstName,lastName,middleName, Type.STUDENT);
    }

    public void  getAllStudent(){
        List<User> userList =service.getAllStudent();
        for (User user : userList){
            Student student = (Student) user;
            studentView.printOnConsole(student);

        }


    }

    public StudentGroup  createStudentGroup(int teacherId, List<Integer> studentIdList){
        Teacher teacher = (Teacher) service.getUserById(Type.TEACHER, teacherId);
        List<Student> studentList = new ArrayList<>();
        for (Integer id:studentIdList) {
            studentList.add((Student) service.getUserById(Type.STUDENT, id));
        }
        return(studentGroupService.createStudentGroup(teacher,studentList));
    }

    public void addToStudentGroupList(StudentGroup studentGroup){
        studentGroupService.AddStudentGroupList(studentGroup);
    }


    public void  getAllTeacher(){
        List<User> userList =service.getAllTeacher();
        for (User user : userList){
            Teacher teacher = (Teacher) user;
            teacherView.printOnConsole(teacher);

        }
    }

    public void  getAllStudentGroup(){
        List<StudentGroup> studentGroupList =studentGroupService.getAllStudentGroup();
        for (StudentGroup s : studentGroupList){

            studentGroupView.sendOnConsole(s);

        }
    }
}
