package service;

import model.*;

import java.util.List;

public class StudentGroupService {

    private final StudentGroup studentGroup = new StudentGroup();
    private List<StudentGroup> studentGroupList;

    public  StudentGroup createStudentGroup(Teacher teacher, List<Student> studentList){
        studentGroup.setTeacher(teacher);
        studentGroup.setStudentList(studentList);
        studentGroup.setGroupId(getFreeId());


        return studentGroup;
    }

    public void AddStudentGroupList(StudentGroup studentGroup){
        studentGroupList.add(studentGroup);
    }

    public List<StudentGroup> getAllStudentGroup() {
        return studentGroupList;
    }

    private int getFreeId() {

        int lastId = 1;
        for (StudentGroup studentGroup : studentGroupList) {
            if (studentGroup instanceof StudentGroup) {
                lastId = studentGroup.getGroupId() + 1;
            }
        }
        return lastId;

    }

}
