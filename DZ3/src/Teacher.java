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

    public Teacher(String firstName, String lastName, String middleName, String subject) {
        super(firstName, lastName, middleName);
        this.subject = subject;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}
