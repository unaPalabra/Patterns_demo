package BehavioralPatterns.Visitor;

// ���������� ���������� ������ ��������� ���� �������� ��� ���� �������� ���������.������ ����� �������� ��� ����� ����������.
// ���������� ������� ���������, ����� ����� �������� ����������� ����� �����, � ����� �������� - �����.
// ��������� ���� � ����������� �����
class BynPriceVisitor implements Visitor {
    // ��� �����������
    @Override
    public double bikePriceVisitor(Bike bike) {
        double price = bike.getUsdPrice() * 2.53;// ��������� ���� � ����������� �����
        System.out.println("Bike costs: " + price + "BYN");//������� ���� �� �����
        return price;// ���������� ����� ����
    }

    // ��� �����������
    @Override
    public double tvPriceVisitor(TV tv) {
        double price = tv.getUsdPrice() * 2.53;// ��������� ���� � ����������� �����
        System.out.println("TV costs: " + price + "BYN");//������� ���� �� �����
        return price;// ���������� ����� ����
    }
}
