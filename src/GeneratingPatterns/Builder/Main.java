package GeneratingPatterns.Builder;

public class Main {
    //  Соусы для наших салатов
    enum Sauce{
        MUSTARD, CHEESE
    }
    /*
        Класс, объекты которого будут создаваться при помощи паттерна GeneratingPatterns.AbstractFactory.Singlton.AbstractFactory.Builder. Состоит из полей, сеттеров и переопределенного метода toString(). На схеме паттерна обозначен как Product.
    */
    static class Salad{
        private String vegetables;
        private String fruits;
        private String meat;
        private Sauce sauce;

        //  Создаем сеттеры для конструируемого класса и переопределяем метод toString()
        public void setVegetables(String vegetables) {
            this.vegetables = vegetables;
        }
        public void setFruits(String fruits) {
            this.fruits = fruits;
        }
        public void setMeat(String meat) {
            this.meat = meat;
        }
        public void setSauce(Sauce sauce) {
            this.sauce = sauce;
        }
        @Override
        public String toString() {
            return "Salad{" +
                    "vegetables='" + vegetables + '\'' +
                    ", fruits='" + fruits + '\'' +
                    ", meat='" + meat + '\'' +
                    ", sauce=" + sauce +
                    '}';
        }
    }


    //  Абстрактный класс строителя салатов
    static abstract class SaladBuilder{
        Salad salad;
        //  Этот метод создает новый объект Salad с пустыми полями.
        void createSalad(){
            salad = new Salad();
        }
        /*
            Для каждого поля создаваемого класса добавляем метод, который создает это поле.
        */
        abstract void buildVegetables();
        abstract void buildFruits();
        abstract void buildMeat();
        abstract void buildSauce();

        //Этот метод возвращает готовый объект Salad с заполненными полями.
        Salad getSalad(){
            return salad;
        }
    }
    /*
        SunSaladBuilder и CesarSaladBuilder - конкретные реализации абстрактного интерфейса SaladBuilder.
    */
    static class SunSaladBuilder extends SaladBuilder{
        @Override
        void buildVegetables() {
            salad.setVegetables("Cucumber");
        }
        @Override
        void buildFruits() {
            salad.setFruits("Orange");
        }
        @Override
        void buildMeat() {
            salad.setMeat("Pork");
        }
        @Override
        void buildSauce() {
            salad.setSauce(Sauce.CHEESE);
        }
    }

    static class CesarSaladBuilder extends SaladBuilder{
        @Override
        void buildVegetables() {
            salad.setVegetables("Tomato");
        }
        @Override
        void buildFruits() {
            salad.setFruits("Pineapple");
        }
        @Override
        void buildMeat() {
            salad.setMeat("Chicken");
        }
        @Override
        void buildSauce() {
            salad.setSauce(Sauce.MUSTARD);
        }
    }
    /*
        SaladDirector - создает объекты на основе абстрактного интерфейса GeneratingPatterns.AbstractFactory.Singlton.AbstractFactory.Builder.
    */
    static class SaladDirector{
        SaladBuilder builder;
        //  Здесь мы передаем нашему директору конкретного билдера, на основании которого будут создаваться те или иные салаты.
        public void setBuilder(SaladBuilder builder) {
            this.builder = builder;
        }
        //  Здесь мы из частей создаем готовый салат, который в итоге и возвращаем.
        Salad buildSalad(){
            builder.createSalad();
            builder.buildVegetables();
            builder.buildFruits();
            builder.buildMeat();
            builder.buildSauce();

            Salad salad = builder.getSalad();
            return salad;
        }
    }

    public static void main(String[] args) {
        SaladDirector saladDirector = new SaladDirector(); // Создаем объект директора
        saladDirector.setBuilder(new SunSaladBuilder());// Передаем директору конкретного строителя.
        Salad salad = saladDirector.buildSalad();// Получаем готовый салат.

        System.out.println(salad);// Выводим toString() готового салата "Солнышко"
        System.out.println("==================================");
        saladDirector.setBuilder(new CesarSaladBuilder());// Передаем директору строителя салата "Цезарь".
        salad = saladDirector.buildSalad();// Получаем другой салат.
        System.out.println(salad);// Выводим toString() готового салата "Цезарь"
    }
}