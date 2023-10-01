package StructuralPatterns.Bridge;

//  ���������� ����������. � ����������� � �������� ��������� ��������� ��������� Terminal
public class CKF extends Fastfood {
    CKF(Terminal terminal) {
        super(terminal);
    }

    @Override
    void getInfo() {
        System.out.println("CKF");
    }
}
