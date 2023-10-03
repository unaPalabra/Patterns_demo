package BehavioralPatterns.Visitor;

// ���������� � ����� � �������� (���������� ������� �� �����)
class TV implements Product {
    private double usdPrice;// ����

    public TV(double usdPrice) {
        this.usdPrice = usdPrice;
    }// �����������

    public double getUsdPrice() {
        return usdPrice;
    }// ������ ��� ����

    @Override //�������������� ����� getCost() ���������� ��� ������ ����������� ����������
    public double getCost(Visitor visitor) {
        return visitor.tvPriceVisitor(this);// �������� ��������� ����������� ����������, ��������� ����� ���������
    }
}
