package BehavioralPatterns.Mediator;

// ������� ����� ��������� ��� ���� �����������
interface Mediator {
    // ��� ������� ����� ��������� ���� �������� ���������
    // � �������� ���������� ��������� ���� ��������� � ������-�������, ������� �������� ��� ���������
    void sendMessage(String message, Collegue collegue);
}
