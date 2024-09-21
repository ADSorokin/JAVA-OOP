package controller;

public interface UserAdd {
    /**
     * Тк в данном интерфесе контроллера есть устаревший обьявление метода controller.UserCreate()не
     * имеющий отношения к данному заданию потомому применяем принцип его сегрегации ISP
     */
    void addItem();
}
