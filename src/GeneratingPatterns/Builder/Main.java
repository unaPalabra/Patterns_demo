package GeneratingPatterns.Builder;

public class Main {
    //  ����� ��� ����� �������
    enum Sauce{
        MUSTARD, CHEESE
    }
    /*
        �����, ������� �������� ����� ����������� ��� ������ �������� GeneratingPatterns.AbstractFactory.Singlton.AbstractFactory.Builder. ������� �� �����, �������� � ����������������� ������ toString(). �� ����� �������� ��������� ��� Product.
    */
    static class Salad{
        private String vegetables;
        private String fruits;
        private String meat;
        private Sauce sauce;

        //  ������� ������� ��� ��������������� ������ � �������������� ����� toString()
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


    //  ����������� ����� ��������� �������
    static abstract class SaladBuilder{
        Salad salad;
        //  ���� ����� ������� ����� ������ Salad � ������� ������.
        void createSalad(){
            salad = new Salad();
        }
        /*
            ��� ������� ���� ������������ ������ ��������� �����, ������� ������� ��� ����.
        */
        abstract void buildVegetables();
        abstract void buildFruits();
        abstract void buildMeat();
        abstract void buildSauce();

        //���� ����� ���������� ������� ������ Salad � ������������ ������.
        Salad getSalad(){
            return salad;
        }
    }
    /*
        SunSaladBuilder � CesarSaladBuilder - ���������� ���������� ������������ ���������� SaladBuilder.
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
        SaladDirector - ������� ������� �� ������ ������������ ���������� GeneratingPatterns.AbstractFactory.Singlton.AbstractFactory.Builder.
    */
    static class SaladDirector{
        SaladBuilder builder;
        //  ����� �� �������� ������ ��������� ����������� �������, �� ��������� �������� ����� ����������� �� ��� ���� ������.
        public void setBuilder(SaladBuilder builder) {
            this.builder = builder;
        }
        //  ����� �� �� ������ ������� ������� �����, ������� � ����� � ����������.
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
        SaladDirector saladDirector = new SaladDirector(); // ������� ������ ���������
        saladDirector.setBuilder(new SunSaladBuilder());// �������� ��������� ����������� ���������.
        Salad salad = saladDirector.buildSalad();// �������� ������� �����.

        System.out.println(salad);// ������� toString() �������� ������ "��������"
        System.out.println("==================================");
        saladDirector.setBuilder(new CesarSaladBuilder());// �������� ��������� ��������� ������ "������".
        salad = saladDirector.buildSalad();// �������� ������ �����.
        System.out.println(salad);// ������� toString() �������� ������ "������"
    }
}