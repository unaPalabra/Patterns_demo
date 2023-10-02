package BehavioralPatterns.Memento;

import java.util.Date;

//Класс карты. Соответствует на схеме Originator-у. Его состояние будем сохранять.
class Map {
    //Внутреннее состояние объекта, которое нужно сохранить
    private String name;
    private Date date;

    // конструктор не создаем, будем использовать по умолчанию
    // метод setNameAndDate() устанавливает имя из аргумента, а дату создает текущую
    public void setNameAndDate(String name) {
        this.name = name;
        this.date = new Date();
    }

    @Override // toString переопределяем для наглядности
    public String toString() {
        return "Map" +
                "\nname=" + name +
                "\ndate=" + date + "\n";
    }

    // создает снимок состояния объекта Map (создает резервную копию)
    public Snapshot createSnapshot() {
        return new Snapshot(name);
    }

    // восстанавливает прежнее состояние Map из резервной копии
    public void loadSnapshot(Snapshot snapshot) {
        this.name = snapshot.getName();
        this.date = snapshot.getDate();
    }
}
