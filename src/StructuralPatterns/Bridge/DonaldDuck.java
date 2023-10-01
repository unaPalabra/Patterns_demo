package StructuralPatterns.Bridge;

//  ���������� ����������. � ����������� � �������� ��������� ��������� ��������� Terminal
public class DonaldDuck extends Fastfood {
    DonaldDuck(Terminal terminal) {
        super(terminal);
    }

    @Override
    void getInfo() {
        System.out.println("Donald Duck");
    }
}
