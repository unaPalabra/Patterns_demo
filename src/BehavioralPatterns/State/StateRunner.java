package BehavioralPatterns.State;

// ���������� �����
public class StateRunner {
    public static void main(String[] args) {
        Article article = new Article();// ������� ����� ������.
        article.publish(); //�������� ����� ������������
        article.publish(); //�������� ����� ������������
        article.publish(); //�������� ����� ������������
    }
}

