package BehavioralPatterns.Visitor;

// ���� ����������, ����� ���� ���� - ���� � �������� (���������� ������� �� �����)
class Bike implements Product {
    private double usdPrice;// ���� � ��������

    public Bike(double usdPrice) {
        this.usdPrice = usdPrice;
    }// �����������, ��������� ����

    public double getUsdPrice() {
        return usdPrice;
    }// ������ ��� ����

    @Override //�������������� ����� getCost() ���������� ��� ������ ����������� ����������
    public double getCost(Visitor visitor) {
        return visitor.bikePriceVisitor(this);// �������� ��������� ����������� ����������, ��������� ����� ���������
    }

}
