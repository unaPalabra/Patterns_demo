package BehavioralPatterns.State;

// ��������� ����������
class Publication implements State {
    @Override
    public void changeState(Article article) {// �� �������� ��������� ������ ����� ����������.
        System.out.println("Publication State: Nothing happens...");
    }
}
