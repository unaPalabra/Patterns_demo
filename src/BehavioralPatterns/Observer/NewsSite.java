package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

//����� ����������� ��������. ��������� ��������� Observable, ������ ������ ���� �����������.
class NewsSite implements Observable {
    private List<Observer> listeners = new ArrayList<>();// ������ ���� �����������.
    private List<String> news = new ArrayList<>();// ������ ��������, �� ��������� �������� ����� ����������� ����������.

    // �������������� ������ ��������, ������� � ��������� �����������.
    @Override
    public void addObserver(Observer observer) {
        listeners.add(observer);
    }// ��������� ����������� ���������� � ������

    @Override
    public void removeObserver(Observer observer) {
        listeners.remove(observer);
    }// ������� ����������� ���������� �� ������

    @Override
    public void notifyObserver() {
        // ��������� ������� ����������� ���������� �� ������ � �������, ��������� ���� forEach
        for (Observer observer : listeners) {
            observer.handleEvent(news);
        }
    }

    // ��������� ������� � ������ news
    public void addNews(String news) {
        this.news.add(news);// ��������� ��������������� �������
        this.notifyObserver();// �������� ���� ����������� ����������� ��������
    }

    // ������� ������� �� ������
    public void removeNews(String news) {
        this.news.remove(news);// ������� �������
        this.notifyObserver();// �������� �����������
    }
}
