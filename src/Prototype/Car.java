package Prototype;

import java.util.Objects;

//  ������� ����� Car � ��������� � ��� ��������� Prototype.
//  ������� ����� ������ �� ����� �����������.
//  ������ ����� ������ ����� ��������� � �������� ���� ������ Car.
//  ���� �� ����� ������ �������� ������ Tyre.
class Car implements Prototype {
    private int id;
    private String name;
    private Tyre tyre;

    //  ������� ������� � ������� ��� ��������� �����
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    //  ������� �����������
    public Car(int id, String name, Tyre tyre) {
        this.id = id;
        this.name = name;
        this.tyre = tyre;
    }

    //  �������������� toString()
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tyre=" + tyre +
                '}';
    }

    //  �������������� ����� getClone()
    @Override
    public Object getClone() {
        //  ������� ���� ������� Car � ���������� ��� � ���� ������� Object.
        //  ��� ��������� ���� �������� ������������ Object � ���� Car.
        //  ����������� ������� ����� ��� � ������ Tyre.
        //  � ��� ������� ����������� ���� Tyre �������� � ����������� ������ �� ������ Tyre.
        //  ��� ������������ ������� Tyre �� �������� � ���� ����� getClone().
        return new Car(id, name, (Tyre) tyre.getClone());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(name, car.name) && Objects.equals(tyre, car.tyre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tyre);
    }
}
