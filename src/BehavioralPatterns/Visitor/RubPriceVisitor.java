package BehavioralPatterns.Visitor;

// ��������� ���� � ���������� �����
class RubPriceVisitor implements Visitor {
    // ��� �����������
    @Override
    public double bikePriceVisitor(Bike bike) {
        double price = bike.getUsdPrice() * 72.17;// ��������� ���� � ���������� �����
        System.out.println("Bike costs: " + price + "RUB");//������� ���� �� �����
        return price;// ���������� ����� ����
    }

    // ��� �����������
    @Override
    public double tvPriceVisitor(TV tv) {
        double price = tv.getUsdPrice() * 72.17;// ��������� ���� � ���������� �����
        System.out.println("TV costs: " + price + "RUB");//������� ���� �� �����
        return price;// ���������� ����� ����
    }
}
