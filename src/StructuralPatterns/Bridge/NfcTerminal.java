package StructuralPatterns.Bridge;

// ���������� ������������� ���������� Terminal
public class NfcTerminal implements Terminal {
    @Override
    public void bill(int cost) {
        System.out.println("NFC Terminal billing " + cost);
    }
}
