package BehavioralPatterns.TemplateMethode;

//�����������  �����, ������� ��������� ��������� ����� � ��������� ��������, �� ������� �� �������
abstract class DocWork {
    // ��������� ����� ������� �� ��������������� ����������� ��������� �������
    public void handleDoc() {
        loadDoc();
        rework();
        exit();
    }

    //����� ��� ���� ������� ����� ��������� �����
    void loadDoc() {
        System.out.println("Document Loading");
    }

    //���������� ������ ����� ��������� � �� �������
    abstract void rework();

    abstract void exit();
}
