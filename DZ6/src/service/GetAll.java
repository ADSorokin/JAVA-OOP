package service;

import entity.User;

import java.util.List;

public interface GetAll<T extends User> {
    List<T> getAllItem();
}
