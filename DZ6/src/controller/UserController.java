package controller;

import entity.User;

public interface UserController <T extends User> extends UserAdd, UserUpdateItem, UserDisplayAll {
    /**
     *
     * ��������� ������ ISP
     * �� � ������ ��������� ����������� ���� ���������� ���������� ������ controller.UserCreate()��
     * ������� ��������� � ������� ������� �������� ��������� ������� ��� ���������� ISP
     */
}

