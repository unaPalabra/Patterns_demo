package BehavioralPatterns.Mediator;

// ���������� �����-�������, ��������� ����� �������� ��������� �� ������������ ������
class Editor extends Collegue {
    @Override
        // �������������� ����� ��������� ��������� ��� ����������� ������
    void getMessage(String message) {
        System.out.println("Editor get message: " + message);
    }
}
