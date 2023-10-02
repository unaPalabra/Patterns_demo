package BehavioralPatterns.Memento;

// �������� �� ���������� �������-���������, �������� ������ �� Snapshot. �������� �� ����� � �������� ���������.
class Caretaker {
    Snapshot backup;

    // ���������� ����������� ������ ������-���������
    public Snapshot getBackup() {
        return backup;
    }

    // ��������� ������ ������ ���������
    public void setBackup(Snapshot backup) {
        this.backup = backup;
    }
}
