package service;

import entity.User;

public interface UserService <T extends User> extends Add<T>, GetAll<T>, Update<T> {

    /**
     * ��������� ������ ISP ��� ������� �������� � ������������� �������� �� ����������� ������� ��� �� ����� ������������
     * � ��������� Delete()
     * */

}
