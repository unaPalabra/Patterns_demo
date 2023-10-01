package GeneratingPatterns.Prototype;

import java.util.Objects;

//  ������� ����� Tyre � ��������� � ��� ��������� GeneratingPatterns.AbstractFactory.Singlton.AbstractFactory.Prototype.
//  ������� ����� ������ �� ����� �����������.
//  ������ ����� ������ ����� ��������� � �������� ���� ������ Car.
class Tyre implements Prototype {
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //  ������� �����������
    public Tyre(String name, int size) {
        this.name = name;
        this.size = size;
    }

    //  �������������� toString()
    @Override
    public String toString() {
        return "Tyre{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    //  �������������� ����� getClone() ���������� GeneratingPatterns.AbstractFactory.Singlton.AbstractFactory.Prototype.
    @Override
    public Object getClone() {
        //  ������� ���� ������� Tyre � ���������� ��� � ���� ������� Object.
        //  ��� ��������� ���� �������� ������������ Object � ���� Tyre.
        return new Tyre(name, size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tyre tyre = (Tyre) o;
        return size == tyre.size && Objects.equals(name, tyre.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
