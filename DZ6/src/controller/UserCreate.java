package controller;
/**
 * данный метод  сегрегирован и удален на уровне интерфейса сервиса тк не используется в конкретном приложении
 * */
public interface UserCreate {
    void create(String firstName, String lastName, String middleName);
}
