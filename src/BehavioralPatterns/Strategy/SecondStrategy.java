package BehavioralPatterns.Strategy;

//������ ���������
class SecondStrategy implements Strategy {
    @Override
    public void run(String string) {
        // �������������� ����� run()
        System.out.println("������ ������� ������� " + string);
        // ����� ��� ��� � ����������...
    }
}
