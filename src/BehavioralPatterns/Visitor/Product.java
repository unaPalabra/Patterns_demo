package BehavioralPatterns.Visitor;

// ��������� Product ��������� ����� getCost() ��� ���� �������. ������������� Element �� ��������� �������.
interface Product {
    // ��������� ����� ��������� ��������� ���� �������
    // ������������� ������ accept() �� ���������, ��������� ��������� ���������� � �������� ���������
    double getCost(Visitor visitor);
}
