package GeneratingPatterns.FactoryMetod;

public class Main {

    //Паттерн применим, только когда есть иерархия продуктов
   /*
       Интерфейс Delivery на схеме соответствует интерфейсу Product
       и описывает общее поведение различных видов доставки
   */
    interface Delivery{
        void supply();
    }


    /*
        Классы Human и Bike на схеме соответствуют ConcreteProduct
        и оба переопределяют метод supply
    */
    //Человек доставляет
    static class Human implements Delivery{
        @Override
        public void supply() {
            System.out.println("Human supply");
        }
    }

    //Или велосипед
    static class Bike implements Delivery{
        @Override
        public void supply() {
            System.out.println("Bike supply");
        }
    }

    /*
        Теперь создадим интерфейс для фабричных методов, которые
        будут возвращать нам объекты конкретных видов доставки.
        На схеме соответствует объекту Creator/
    */
    interface DeliveryFactory{
        Delivery createDelivery();
    }

    // Фабрика, возвращающая объект велодоставки
    static class BikeDeliveryFactory implements DeliveryFactory{
        public Delivery createDelivery(){
            return new Bike();
        }
    }

    // Фабрика, возвращающая объект пешеходной доставки
    static class HumanDeliveryFactory implements DeliveryFactory{
        public Delivery createDelivery(){
            return new Human();
        }
    }

    public static void main(String[] args) {
        DeliveryFactory deliveryFactory = supplyDelivery(1);
        Delivery delivery = deliveryFactory.createDelivery();
        delivery.supply();
    }

    // Подставляя в переменную "а" различные числа, получим различные типы доставки
    static DeliveryFactory supplyDelivery(int a){
        switch (a){
            case 1 : return new BikeDeliveryFactory();
            case 2 : return new HumanDeliveryFactory();
            default: throw new RuntimeException("Such a factory does not exist ");
        }
    }
}
