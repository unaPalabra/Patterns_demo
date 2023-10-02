package BehavioralPatterns.Iterator;

// ������� "���������", ������� ����� ������ ����������
// ��������� �������� � ���� �������
// ������ ���������������� ��������� Aggregate
class ConcreteAggregate implements Aggregate {
    private String[] patterns = {"Singleton", "Factory", "Interpreter", "Decorator", "Facade", "Prototype"};

    @Override
    public Iterator getIterator() {// �������������� ����� getIterator() ���������� Aggregate
        return new PatternsIterator(patterns);// �������� ����������� ��������� � �������� ������ �� ������
    }
}
