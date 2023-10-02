package BehavioralPatterns.ChainOfResponsibility;

// ������� ����������� ����� Handler, ������� ����� ��������� ���� ������������. �� ����� - "Interface" Handler
public abstract class Handler {
    private int priority;// ����� ��� ��������� ������� � ������ �����������
    private Handler nextHandler; // ������ �� ��������� ���������� � ����, ����� ���� null.
    // ������� �����������, ����������� ���������
    public Handler(int priority) {
        this.priority = priority;
    }
    // ������ ��� ��������� ���������� � ������� ����������� �������
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    // ����� ������ ��������� ����������� ������� � �������� � ������������ ������ ���, ���� �������� ��� �� �������. ���������� condition �������� ������, ������� ����� �������� � ����� �����������.
    public void handlerManager(String message, int condition){
        if (condition >= priority){// ���� ������� �������� �����������
            write(message);// ������� ���������
        }
        // ���� �����, ����� ���������� ������ ���� ���������� - ���������������� ��������� ������ � ���������� else

        // else

        // ����� ��������� ������� ���������� � ���� �����������
        if (nextHandler != null){// ���� ��������� ���������� ����������, �������� ��� � �������� ��� ���������� message � condition
            nextHandler.handlerManager(message, condition);
        }
        else {
            System.out.println("\n=======================\n");// ��� ������ ���� ��� �����������
        }
    }
    public abstract void write(String message);// ������� ��������� message, �������������� ��� ������� �����������
}

// ��������� �������, � �������� ����� ���������� ������
class Priority{
    public static final int INFO = 1;
    public static final int WARNING = 2;
    public static final int ERROR = 3;
}
// ���������� ����������
class FirstHandler extends Handler {
    public FirstHandler(int priority) {// �������� ����������� �����������
        super(priority);
    }
    @Override// �������������� ����� write()
    public void write(String message) {
        System.out.println("Event handling with FirstHandler \n\"" + message + "\"");
    }
}
// ���������� ����������
class SecondHandler extends Handler {// �������� ����������� �����������
    public SecondHandler(int priority) {
        super(priority);
    }
    @Override //�������������� ����� write()
    public void write(String message) {
        System.out.println("Event handling with SecondHandler \n\"" + message + "\"");
    }
}
// ���������� ����������
class ThirdHandler extends Handler {// �������� ����������� �����������
    public ThirdHandler(int priority) {
        super(priority);
    }
    @Override //�������������� ����� write()
    public void write(String message) {
        System.out.println("Event handling with ThirdHandler \n\"" + message + "\"");
    }
}

class Client{
    public static void main(String[] args) {
        // ������� ������� ������������ � ������� �������� ���������, � ������� ����� ������������ ������
        Handler firstHandler = new FirstHandler(Priority.INFO);
        Handler secondHandler = new SecondHandler(Priority.WARNING);
        Handler thirdHandler = new ThirdHandler(Priority.ERROR);

        firstHandler.setNextHandler(secondHandler);// ������� ����������� ��������� ����������
        secondHandler.setNextHandler(thirdHandler);// ������� ����������� ��������� ����������
        // �������� handlerManager() � ������� ����������� � �������� ��� ��������� � ��������, ������� ����� ����������
        firstHandler.handlerManager("We are fine...", Priority.INFO);
        firstHandler.handlerManager("There is a reason to think...", Priority.WARNING);
        firstHandler.handlerManager("Help me please!!!", Priority.ERROR);
    }
}
