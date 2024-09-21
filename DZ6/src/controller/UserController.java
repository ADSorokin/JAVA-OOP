package controller;

import entity.User;

public interface UserController <T extends User> extends UserAdd, UserUpdateItem, UserDisplayAll {
    /**
     *
     * Применяем прицип ISP
     * Тк в данном интерфесе контроллера есть устаревший обьявление метода controller.UserCreate()не
     * имеющий отношения к данному заданию потомому применяем принцип его сегрегации ISP
     */
}

