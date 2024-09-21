package service;

import entity.User;

public interface UserService <T extends User> extends Add<T>, GetAll<T>, Update<T> {

    /**
     * Применяем прицип ISP для большей гибкости и независимости клиентов от интерфейсов которые они не будут использовать
     * в частности Delete()
     * */

}
