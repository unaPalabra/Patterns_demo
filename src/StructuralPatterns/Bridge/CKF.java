package StructuralPatterns.Bridge;

//  Конкретная абстракция. В конструктор в качестве параметра принимает интерфейс Terminal
public class CKF extends Fastfood {
    CKF(Terminal terminal) {
        super(terminal);
    }

    @Override
    void getInfo() {
        System.out.println("CKF");
    }
}
