package StructuralPatterns.Bridge;

//  Конкретная абстракция. В конструктор в качестве параметра принимает интерфейс Terminal
public class DonaldDuck extends Fastfood {
    DonaldDuck(Terminal terminal) {
        super(terminal);
    }

    @Override
    void getInfo() {
        System.out.println("Donald Duck");
    }
}
