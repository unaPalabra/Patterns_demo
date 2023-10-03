package BehavioralPatterns.State;

// ��������� ��������
class Draft implements State {
    @Override
    public void changeState(Article article) {
        article.setState(new Moderation());// ������������� ������ � ��������� ���������.
        System.out.println("Draft State: Article waiting for moderation...");
    }
}
