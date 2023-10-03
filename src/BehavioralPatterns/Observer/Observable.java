package BehavioralPatterns.Observer;

// ��������� ��������
interface Observable {
    void addObserver(Observer observer);// ����� �������� �� �������, � �������� ��������� ��������� ����������� ���������� (���������) �������.

    void removeObserver(Observer observer);// ����� ������� �� �������, � �������� ��������� ��������� ����������� ���������� (���������) �������.

    void notifyObserver();// ����� ���������� ���� �����������
}
