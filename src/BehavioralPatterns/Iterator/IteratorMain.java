package BehavioralPatterns.Iterator;

// ������ ��� �������� ����
public class IteratorMain {
    public static void main(String[] args) {
        ConcreteAggregate ca = new ConcreteAggregate();// ������� ���������
        // ������� ��������, ������ ����� getIterator() � ����� ���������
        Iterator iterator = ca.getIterator();
        // ������ ����� ���� while "��������" ��� �������� ��������
        while (iterator.hasNext()){// ���� � ��������� ���� ��������� ��������...
            System.out.println(iterator.next());//������� �� �� �����, ��������� ����� next() ���������
        }
    }
}

