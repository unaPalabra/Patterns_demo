package BehavioralPatterns.Mediator;

// ���������� �����-�������, ��������� ����� �������� ��������� �� ������������ ������
class Admin extends Collegue {
    @Override
        // �������������� ����� ��������� ��������� ��� ����������� ������
    void getMessage(String message) {
        System.out.println("Admin get message: " + message);
    }
}
