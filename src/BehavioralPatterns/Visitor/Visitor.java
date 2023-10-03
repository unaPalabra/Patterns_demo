package BehavioralPatterns.Visitor;

//��������� ����������, ��������� ����� ���������
interface Visitor {
    double bikePriceVisitor(Bike bike);// ���������� ������ �����������, ������������� ���� (������������ ����� ���������), ����� visit �� �����

    double tvPriceVisitor(TV tv);// ���������� ������ �����������, ������������� ���� (������������ ����� ���������), ����� visit �� �����
}
