package BehavioralPatterns.Memento;

import java.util.Date;

//����� �����. ������������� �� ����� Originator-�. ��� ��������� ����� ���������.
class Map {
    //���������� ��������� �������, ������� ����� ���������
    private String name;
    private Date date;

    // ����������� �� �������, ����� ������������ �� ���������
    // ����� setNameAndDate() ������������� ��� �� ���������, � ���� ������� �������
    public void setNameAndDate(String name) {
        this.name = name;
        this.date = new Date();
    }

    @Override // toString �������������� ��� �����������
    public String toString() {
        return "Map" +
                "\nname=" + name +
                "\ndate=" + date + "\n";
    }

    // ������� ������ ��������� ������� Map (������� ��������� �����)
    public Snapshot createSnapshot() {
        return new Snapshot(name);
    }

    // ��������������� ������� ��������� Map �� ��������� �����
    public void loadSnapshot(Snapshot snapshot) {
        this.name = snapshot.getName();
        this.date = snapshot.getDate();
    }
}
