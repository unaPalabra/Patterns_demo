package BehavioralPatterns.TemplateMethode;

//��������� ��������� ��������� ������, �� ������ ��������� �����.  ��� PDF � CSV ����� �������� ��-�������.
class PDF extends DocWork {
    @Override
    protected void rework() {
        System.out.println("��������� PDF");
    }

    @Override
    protected void exit() {
        System.out.println("����� PDF");
    }
}
