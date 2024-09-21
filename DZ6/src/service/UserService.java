package service;

import entity.User;

public interface UserService <T extends User> extends Add<T>, GetAll<T>, Update<T> {

    /**
     * ѕримен€ем прицип ISP дл€ большей гибкости и независимости клиентов от интерфейсов которые они не будут использовать
     * в частности Delete()
     * */

}
