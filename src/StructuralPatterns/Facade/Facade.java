package StructuralPatterns.Facade;

// Ёто и есть класс фасад
public class Facade {
    // создаем экземпл€ры наших классов-ингредиентов
    private FlourDispenser flourDispenser = new FlourDispenser();
    private SugarDispenser sugarDispenser = new SugarDispenser();
    private MilkDispenser milkDispenser = new MilkDispenser();
    private EggDispenser eggDispenser = new EggDispenser();
    private Mixer mixer = new Mixer();

    // создаем метод getDough(), который выполн€ет необходимые методы в нужной последовательности
    public void getDough(int flour, int sugar, int milk, int egg) {
        flourDispenser.getFlour(flour);
        sugarDispenser.getSugar(sugar);
        milkDispenser.getMilk(milk);
        eggDispenser.getEgg(egg);
        mixer.toMix();
    }
}
