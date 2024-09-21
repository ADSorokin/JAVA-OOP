package entity;

public class Teacher extends User implements Comparable<Teacher>{

    private Long teacherId;
    private String subject;

    public Teacher(String firstName, String lastName, String middleName, String subject) {
        super(firstName, lastName, middleName);
        this.subject = subject;
    }


    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }

    @Override
    public String toString() {
        return " Учитель {" +
                " Имя= " + getFirstName() +
                " Отчество= " + getMiddleName() +
                " Фамилия= " + getLastName() +
                ", преподаваемый предмет= '" + subject + '\'' +
                '}';
    }
}
