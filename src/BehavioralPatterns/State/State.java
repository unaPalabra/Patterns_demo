package BehavioralPatterns.State;

// ����� ��������� ���� ��������� ������
interface State {
    //�����, ������� ����� �������� ��������� ������ (���������) � ����������� �� �������� ���������. � �������� ��������� ��������� ������ ������ Article.
    void changeState(Article article);
}
