package Prototype;

import java.util.Objects;

//  Создаем класс Car и реализуем в нем интерфейс Prototype.
//  Объекты этого класса мы будем клонировать.
//  Объект этого класса будет выступать в качестве поля класса Car.
//  Одно из полей класса содержит объект Tyre.
class Car implements Prototype {
    private int id;
    private String name;
    private Tyre tyre;

    //  Создаем геттеры и сеттеры для приватных полей
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

    //  Создаем конструктор
    public Car(int id, String name, Tyre tyre) {
        this.id = id;
        this.name = name;
        this.tyre = tyre;
    }

    //  Переопределяем toString()
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tyre=" + tyre +
                '}';
    }

    //  Переопределяем метод getClone()
    @Override
    public Object getClone() {
        //  Создает клон объекта Car и возвращает его в виде объекта Object.
        //  Нам останется лишь привести возвращенный Object к типу Car.
        //  Копирование простых полей как в классе Tyre.
        //  А вот простое копирование поля Tyre приведет к копированию ссылки на объект Tyre.
        //  Для клонирования объекта Tyre мы вызываем у него метод getClone().
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
