package service;

import entity.User;

public interface Add<T extends User> {
    void addItem(T t);
}
