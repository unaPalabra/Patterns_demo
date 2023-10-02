package BehavioralPatterns.Memento;

import java.util.Date;

// �����-��������� ��������� ����� �����, �������� ����, ����������� ������ Map
class Snapshot {
    private final String name;
    private final Date date;

    // ����������� ��������� name � �������� ���������, ���� ������������� �������
    public Snapshot(String name) {
        this.name = name;
        this.date = new Date();
    }

    // ������� ����� � ����
    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
