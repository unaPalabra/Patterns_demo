package BehavioralPatterns.State;

// ����� ������. �������� ���������� ���������. �������� ������ �� ������ ���������.
class Article {
    private State state;// ������ �� ������ ����������� ���������

    // ������ ���������
    public void setState(State state) {
        this.state = state;
    }

    // ����������� ������
    public Article() {
        this.state = new Draft();// ��� �������� ������ ������������� ��������� � ��������.
        System.out.println("Create Article...");// ��������� � �������� ������ ��� �����������.
    }

    // ����� "������������" � ����������� �� �������� ��������� ������ ����� ��������� ������ ����������.
    public void publish() {
        state.changeState(this);// � �������� ��������� ��������� ������ ������.
    }
}
