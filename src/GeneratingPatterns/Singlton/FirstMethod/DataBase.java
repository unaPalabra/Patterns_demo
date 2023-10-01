package GeneratingPatterns.Singlton.FirstMethod;

public class DataBase {
    private static int count = 0;

    // Приватный конструктор не позволяет создавать новые экземпляры за пределами текущего класса.
    //При каждом вызове конструктора переменная count будет увеличиваться на 1
    private DataBase() {
        count++;
    }

    // Сразу создаем объект, который будет единственным экземпляром класса
    private static DataBase dataBase = new DataBase();

    // getInstance() является глобальной точкой доступа к объекту Singleton. Вызывать одиночку мы сможем так: DataBase.getInstance().
    public static DataBase getInstance() {
        return dataBase;
    }

    //  Метод getCount() выведет информацию о количестве созданных экземпляров
    public void getCount() {
        System.out.println(count);
    }
}
