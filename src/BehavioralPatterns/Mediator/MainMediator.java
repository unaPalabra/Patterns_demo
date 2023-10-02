package BehavioralPatterns.Mediator;

// ���������� �����
public class MainMediator {
    public static void main(String[] args) {
        Admin admin = new Admin();// ������� ����������� ������� admin
        Editor editor = new Editor();// ������� ����������� ������� editor
        // ������� ����������� ���������� � �������� � ����������� ���������� ������
        ConcreteMediator mediator = new ConcreteMediator(admin, editor);

        System.out.println("\nAdmin send message: Hello");
        admin.send("Hello I'm admin");// admin ���������� ��������� ����������
        System.out.println("\nEditor send message: Hello");
        editor.send("Hello I'm editor"); // editor ���������� ��������� ����������
    }
}

