package Singlton.SecondMethod;

public class DataBase {

    //  ��������� ����������� ������
    private DataBase() {
    }

    // ������ �������� ����� ��������� ����� ������� ������ ������ getInstance()
    private static DataBase dataBase;

    // ���������, ���� ������ dataBase �� ����������, ������ ����� �� ��� ��������, �.�. ���������� ������� ������������� ���������.
    public static DataBase getInstance() {
        if (dataBase == null)
            return new DataBase();
        return null;
    }
}
