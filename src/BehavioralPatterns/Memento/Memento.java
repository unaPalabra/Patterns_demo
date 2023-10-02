package BehavioralPatterns.Memento;

public class Memento {
    public static void main(String[] args) {
        Map map = new Map();// ������� ������, ��������� �������� ����� ���������
        Caretaker caretaker = new Caretaker();// ������� ������, ������� �������� ������-���������

        System.out.println("Creating new Map...");
        map.setNameAndDate("My Map");// ������������� ��� �����
        System.out.println(map);// ������� ��������� �����

        System.out.println("Saving current state...");
        /* ������� �����, ������� ����� setBackup() ������� caretaker, ������� ��������� �
        �������� ��������� ������ Snapshot, ������� � ���� ������� �������� �� ������ createSnapshot()
         ������ ������� Map. */
        caretaker.setBackup(map.createSnapshot());

        System.out.println("Updating name of Map...");
        map.setNameAndDate("My checked Map");// ������������� ����� ��� ������ ������� Map
        System.out.println(map);// ������� toString()

        System.out.println("Rolling back to oldest Name...");
        map.loadSnapshot(caretaker.getBackup());// ��������� ����� �� ����������� ���������
        System.out.println(map);// ������� ���������
    }
}

