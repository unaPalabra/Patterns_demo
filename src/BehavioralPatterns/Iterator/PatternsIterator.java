package BehavioralPatterns.Iterator;

// ��������� ����� ����������� ���������
class PatternsIterator implements Iterator {// �������������� ������ ����������
    private final String[] patterns;// ������ �� ������ ���������
    int index = 0;// ���������� index ������������� ������� �������� � �������.

    PatternsIterator(String[] patterns) {
        this.patterns = patterns;
    }

    @Override
    public boolean hasNext() {
        if (index < patterns.length) {
            return true;// ���� index ������ ����� ������� - ���������� true
        } else {
            return false;// ����� ���������� false, �.�. ��������� �����������
        }
    }

    @Override
    public Object next() {
        return patterns[index++];// ���������� ��������� ������� ���������, ����� ���� �������������� index
    }
}
