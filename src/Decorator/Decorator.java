package Decorator;

public class Decorator {
    //  ����� ��������� ��� ����

    interface Notifier {
        String sendData();
    }

    // ������� �����������.
    // ���������� ��������� �� e-mail.
    static class BaseNotifier implements Notifier {
        BaseNotifier(){}// ������� �����������
        @Override
        public String sendData() {
            return "��������� ��������� �� e-mail. ";
        }
    }

    //�������� ���� �����������.
    static class NotifierDecorator implements Notifier {
        Notifier notifier;// ������ �� ���������� ������
        NotifierDecorator(Notifier notifier){
            this.notifier = notifier;
        }
        @Override
        public String sendData() {
            // ����� sendData() �������� sendData() � ������� notifier.
            return notifier.sendData();
        }
    }

    //��������� ���������, �������� �������� ��������� � ���������.
    static class AdvencedDecorator extends NotifierDecorator {
        AdvencedDecorator(Notifier notifier) {
            super(notifier);
        }
        // �������� ��������� � ���������
        public String sendToTelegram(){
            return "��������� ��������� � ���������";
        }

        @Override
        public String sendData() {// � �������� �������� ��������� ��������� ������� � ���������
            return super.sendData() + sendToTelegram();
        }
    }
}
