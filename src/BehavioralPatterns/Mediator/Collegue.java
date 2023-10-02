package BehavioralPatterns.Mediator;

// ����������� ����� ��� ���� ������, �������� ������ �� ����������
abstract class Collegue {
    private Mediator mediator;// ������ �� ����������

    public void setMediator(Mediator mediator) {//������������� ���������� �������
        this.mediator = mediator;
    }

    //����� �������� ���������. ��������� ������������ ����������, � �� ���������� ����������� ����������.
    // ����������� �� ����� ������������� ��� ������� ���������.
    void send(String message) {
        mediator.sendMessage(message, this);
    }

    abstract void getMessage(String message);// ����� ��������� ��������� ��� ����������� ������ �������
}
