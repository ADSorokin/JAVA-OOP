// TODO: 📌 Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable
// TODO: 📌 Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток
// TODO:  📌 Создать класс ПотокСервис, добавив в него метод сортировки списки потоков,
//          используя созданный StreamComparator
// TODO:  📌 Модифицировать класс Контроллер, добавив в него созданный сервис
// TODO:  📌 Модифицировать класс Контроллер, добавив в него метод сортирующий
//          список потоков, путем вызова созданного сервис


import java.util.List;

public class Controller {

    private List<StudentStream> studentStreams;
    private  final StudentGroupService studentGroupService = new StudentGroupService();
    private  final StudentStreamService studentStreamService= new StudentStreamService();



    public Controller(List<StudentStream> studentStreams) {
        this.studentStreams = studentStreams;
    }

    public void  removeStudentByFIO(String firstName, String lastName, String middleName){
         studentGroupService.removeStudentByFIO(firstName,lastName,middleName);

    }

    public List<Student>getSortedStudentByFIO() {
        return studentGroupService.getSortedStudentByFIO();
    }

    public List<StudentStream> getSortedStream(List<StudentStream> studentStreams){
       return studentStreamService.getSortedStreamList(this.studentStreams);
    }




    }






