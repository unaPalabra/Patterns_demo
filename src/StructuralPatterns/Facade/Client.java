package StructuralPatterns.Facade;

class Client{
    public static void main(String[] args) {
        // ��� �� ����� ������ ��������� ���������� ���� �������-������������, ������� � ����� ������������������ ����� ��������� ������ ���� ��������.
        Facade facade = new Facade();// ��� ����� ������ ������� ������ ������ StructuralPatterns.Facade � ������� ����� getDough().
        facade.getDough(500, 200, 200, 800);
    }
}
