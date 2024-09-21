package controller;
import entity.*;
import service.*;
import view.UserView;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    /**
     * ¬недр€ем зависимость через абстракцию-интерфейс и через конструктор тем самым ослабл€€ св€зи следу€ принципу DIP
     *
     * */
    private UserService service;
    private UserView view;
    public TeacherController(UserService service, UserView view) {
        this.service = service;
        this.view = view;
    }
    @Override
    public void addItem() {
        User teacher = view.getDetailsFromUser();
        service.addItem(teacher);
    }
    @Override
    public void updateItem(int index) {
        User teacher =  view.getDetailsFromUser();
        service.updateItem(index , teacher);
    }
    @Override
    public void displayAll() {
        List<Teacher> teachers = service.getAllItem();
        view.sendOnConsole(teachers);
    }



/**
 * данный устаревший метод не имплементируем путем использовани€ принципа ISP
 * */
//    @Override
//    public void create(String firstName, String lastName, String middleName) {
//
//    }




}
