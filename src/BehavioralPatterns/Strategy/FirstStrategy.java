package BehavioralPatterns.Strategy;

//������ ���������
class FirstStrategy implements Strategy {
    @Override
    public void run(String string) {
        // �������������� ����� run()
        System.out.println("������ ������� ������� " + string);
        // ����� ��� ��� � ����������...
    }
}
