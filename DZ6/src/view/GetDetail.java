package view;

import entity.User;

public interface GetDetail<T extends User> {
    T getDetailsFromUser();
}
