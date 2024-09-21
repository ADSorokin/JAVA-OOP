package service;

import entity.User;

public interface Update<T extends User> {
    void updateItem(int index, T t);
}
