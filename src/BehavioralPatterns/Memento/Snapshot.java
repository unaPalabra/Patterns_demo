package BehavioralPatterns.Memento;

import java.util.Date;

// класс-хранитель состояния нашей карты, содержит поля, аналогичные классу Map
class Snapshot {
    private final String name;
    private final Date date;

    // конструктор принимает name в качестве аргумента, дату устанавливает текущую
    public Snapshot(String name) {
        this.name = name;
        this.date = new Date();
    }

    // геттеры имени и даты
    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
