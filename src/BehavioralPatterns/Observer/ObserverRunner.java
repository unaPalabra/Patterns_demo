package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverRunner {
    public static void main(String[] args) {
        NewsSite newsSite = new NewsSite();// ������� ���� ��������
        NewsListener listenerOne = new NewsListener("firstListener");//������� ����������
        NewsListener listenerTwo = new NewsListener("secondListener");//������� ����������
        newsSite.addObserver(listenerOne);//��������� ���������� � ������
        newsSite.addObserver(listenerTwo);//��������� ���������� � ������
        //��������� ��� �������
        newsSite.addNews("First news");
        newsSite.addNews("Second news");
        //������� �������
        newsSite.removeNews("First news");
    }
}

