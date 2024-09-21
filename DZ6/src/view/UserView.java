package view;

import entity.User;

public interface UserView <T extends User> extends GetDetail<T>, SendOnConsole<T> {
    /**
     * Применяем прицип ISP
     * */

}

