package AbstractFactory;

public class AbstractFactory {

    public static void main(String[] args) {
        //  Попробуйте заменить new BreakfastOne() на new BreakfastTwo()
        //  и увидите, мы получим завтрак из свинины и риса.
        BreakfastFactory breakfastFactory = new BreakfastTwo();
        Meat meat = breakfastFactory.createMeat();
        Garnish garnish = breakfastFactory.createGarnish();

        System.out.println("Creating breakfast");
        meat.print();
        garnish.print();
    }


    interface Meat{
        void print();
    }

    static class Chicken implements Meat {
        @Override
        public void print() {
            System.out.println("Create Chiken's meat");
        }
    }

    static class Pork implements Meat {

        @Override
        public void print() {
            System.out.println("Create pork");
        }
    }
    static interface Garnish{
        void print();
    }

    static class Rice implements Garnish {
        @Override
        public void print() {
            System.out.println("Create garnish with rice");
        }
    }
    static class Buckwheat implements Garnish{
        @Override
        public void print() {
            System.out.println("Create garnish with buckwheat");
        }

    }
    static interface BreakfastFactory{
        Meat createMeat();

        Garnish createGarnish();
    }
    static class BreakfastOne implements BreakfastFactory {

        @Override
       public Meat createMeat() {
           return new Chicken();
       }

        @Override
       public Garnish createGarnish() {
           return new Buckwheat();
       }
    }
    static class BreakfastTwo implements BreakfastFactory{
        @Override
        public Meat createMeat() {
            return new Pork();
        }

        @Override
        public Garnish createGarnish() {
            return new Rice();
        }
    }
}
