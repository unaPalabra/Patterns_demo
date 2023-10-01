package GeneratingPatterns.Prototype;

import java.util.Objects;

//  Создаем класс Tyre и реализуем в нем интерфейс GeneratingPatterns.AbstractFactory.Singlton.AbstractFactory.Prototype.
//  Объекты этого класса мы будем клонировать.
//  Объект этого класса будет выступать в качестве поля класса Car.
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

    //  Создаем конструктор
    public Tyre(String name, int size) {
        this.name = name;
        this.size = size;
    }

    //  Переопределяем toString()
    @Override
    public String toString() {
        return "Tyre{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    //  Переопределяем метод getClone() интерфейса GeneratingPatterns.AbstractFactory.Singlton.AbstractFactory.Prototype.
    @Override
    public Object getClone() {
        //  Создает клон объекта Tyre и возвращает его в виде объекта Object.
        //  Нам останется лишь привести возвращенный Object к типу Tyre.
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
