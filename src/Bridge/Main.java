package Bridge;

// ������ ���������, ��� ��� ��������
public class Main {
    public static void main(String[] args) {
        //������� ������� � ����������
        Fastfood ckf = new CKF(new NfcTerminal());
        ckf.saleFood(50);
        ckf.setTerminal(new TouchTerminal());// ������ ��������
        ckf.saleFood(570);

        Fastfood donald = new DonaldDuck(new TouchTerminal());
        donald.saleFood(300);
    }
}
