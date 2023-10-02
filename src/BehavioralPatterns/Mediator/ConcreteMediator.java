package BehavioralPatterns.Mediator;

// ������� ����������� ����������, ������� �������� ������ �� ���������� ������� �������-������
class ConcreteMediator implements Mediator {
    private Admin admin;// ������ �� ������ ������ Admin
    private Editor editor;// ������ �� ������ ������ Editor

    // ����������� ����������� ��������� ��������� ���������� �������-�������
    // � ���� �������� ����������� ���������� ��������-�������� ������������� ����������
    public ConcreteMediator(Admin admin, Editor editor) {
        this.admin = admin;
        this.editor = editor;
        editor.setMediator(this);
        admin.setMediator(this);
    }

    // �������������� ����� �������� ���������
    @Override
    public void sendMessage(String message, Collegue collegue) {
        if (collegue.equals(admin)) {// ���� ��������� ���������� admin, ��� ������������ ������� editor
            editor.getMessage(message);
        } else if (collegue.equals(editor)) {// ���� ��������� ���������� editor, ��� ������������ ������� admin
            admin.getMessage(message);
        }
    }
}
