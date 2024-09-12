public class Teacher extends User implements Comparable<Teacher>{

    private Long teacherId;

    private String subject;


    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String firstName, String lastName, String middleName, String subject, Long teacherId) {
        super(firstName, lastName, middleName);
        this.subject = subject;
        this.teacherId=teacherId;



    }



    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }

    @Override
    public String toString() {
        return " Учитель {" +
                " Идентификационный номер Id= " + teacherId +
                " Имя= " + getFirstName() +
                " Отчество= " + getMiddleName() +
                " Фамилия= " + getLastName() +
                ", преподаваемый предмет= '" + subject + '\'' +
                '}';
    }
}
