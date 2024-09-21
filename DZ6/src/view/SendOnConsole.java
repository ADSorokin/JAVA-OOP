package view;

import entity.User;

import java.util.List;

public interface SendOnConsole<T extends User> {
    void sendOnConsole(List<T> list);
}
