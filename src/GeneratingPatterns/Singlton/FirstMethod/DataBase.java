package GeneratingPatterns.Singlton.FirstMethod;

public class DataBase {
    private static int count = 0;

    // ��������� ����������� �� ��������� ��������� ����� ���������� �� ��������� �������� ������.
    //��� ������ ������ ������������ ���������� count ����� ������������� �� 1
    private DataBase() {
        count++;
    }

    // ����� ������� ������, ������� ����� ������������ ����������� ������
    private static DataBase dataBase = new DataBase();

    // getInstance() �������� ���������� ������ ������� � ������� Singleton. �������� �������� �� ������ ���: DataBase.getInstance().
    public static DataBase getInstance() {
        return dataBase;
    }

    //  ����� getCount() ������� ���������� � ���������� ��������� �����������
    public void getCount() {
        System.out.println(count);
    }
}
