package BehavioralPatterns.Observer;

import java.util.List;

// ���������� ����� ����������. ��������� ��������� Observer.
class NewsListener implements Observer {
    private String name;// ��� ���������� ��� �����������

    public NewsListener(String name) {
        this.name = name;
    }// ����������� ����������

    // �������������� ����� ��������� ����������� �������
    @Override
    public void handleEvent(List<String> news) {
        System.out.println("I'm " + name + " I get news");
        System.out.println(news);// ������� �������
    }
}
