package StructuralPatterns.Facade;

// ��� � ���� ����� �����
public class Facade {
    // ������� ���������� ����� �������-������������
    private FlourDispenser flourDispenser = new FlourDispenser();
    private SugarDispenser sugarDispenser = new SugarDispenser();
    private MilkDispenser milkDispenser = new MilkDispenser();
    private EggDispenser eggDispenser = new EggDispenser();
    private Mixer mixer = new Mixer();

    // ������� ����� getDough(), ������� ��������� ����������� ������ � ������ ������������������
    public void getDough(int flour, int sugar, int milk, int egg) {
        flourDispenser.getFlour(flour);
        sugarDispenser.getSugar(sugar);
        milkDispenser.getMilk(milk);
        eggDispenser.getEgg(egg);
        mixer.toMix();
    }
}
