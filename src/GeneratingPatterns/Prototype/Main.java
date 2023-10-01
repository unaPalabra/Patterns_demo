package GeneratingPatterns.Prototype;

//Проверим создание клонов
class Main{
    public static void main(String[] args) {
        //  Создадим автомобиль
        Car car = new Car(1, "Mercedes", (Tyre) new Tyre("Pirelli", 19));
        System.out.println(car);

        //  Теперь создадим копию автомобиля, вызвав метод getClone().
        //  Т.к. метод getClone() возвращает  Object, на нужно произвести приведение к типу Car
        Car car2 = (Car) car.getClone();
        System.out.println(car2);

        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());

        System.out.println(car.equals(car2));


        System.out.println("\nЗаменим резину у оригинального автомобиля");
        //Убедимся, что мы получили независимую копию нашего автомобиля. Для этого у оригинала заменим колеса на другие.
        car.getTyre().setName("Dunlop");
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car.equals(car2));
    }
}
