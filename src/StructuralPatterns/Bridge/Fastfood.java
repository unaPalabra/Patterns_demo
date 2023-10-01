package StructuralPatterns.Bridge;

//  �������� ����������� ����� Fastfood, �� � ����� ����� �����������
public abstract class Fastfood {
    private Terminal terminal;//    ����� Fastfood �������� ������ �� ��������� Terminal
    // (�� ����� Implementor).
    //  ������ ��� ���������, ����� �� ����� �� ���� �������� ���������� ��������
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }
    //  �����������, ������� ��������� � �������� ��������� ��������� Terminal,
    //  ��� ��������� ��� �� ����������� ��� � ����������� �����������.
    Fastfood(Terminal terminal){
        this.terminal = terminal;
    }
    //  ����� saleFood(int cost) ������� ��� �� ���� cost
    public void saleFood(int cost){
        getInfo();
        terminal.bill(cost);
    }
    abstract void getInfo();//  ����������� �����, ������� ������� ���������� � ���������� ����������
}

