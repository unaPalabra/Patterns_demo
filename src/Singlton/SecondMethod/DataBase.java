package Singlton.SecondMethod;

public class DataBase {

    //  Приватный конструктор класса
    private DataBase() {
    }

    // Теперь синглтон будем создавать после первого вызова метода getInstance()
    private static DataBase dataBase;

    // Проверяем, если объект dataBase не существует, только тогда мы его создадим, т.е. производим ленивую инициализацию синглтона.
    public static DataBase getInstance() {
        if (dataBase == null)
            return new DataBase();
        return null;
    }
}
