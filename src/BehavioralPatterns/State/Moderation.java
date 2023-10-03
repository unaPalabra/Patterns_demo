package BehavioralPatterns.State;

// ��������� ���������
class Moderation implements State {
    @Override
    public void changeState(Article article) {
        article.setState(new Publication());// ������������� ������ � ��������� ����������.
        System.out.println("Moderation State: Publishing Article...");
    }
}
