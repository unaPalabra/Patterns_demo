package BehavioralPatterns.Visitor;

// ������� ��������� (��������� �� �����)
class ProductCollection {
    Product[] products;// �������� ������ ���������� ���������

    // ��� ��������� ������� �������� ��������� �������� ��� ��������
    public ProductCollection() {
        this.products = new Product[]{
                new Bike(128),
                new Bike(223),
                new TV(414),
                new TV(214),
                new TV(164),
                new Bike(1134)
        };
    }

    // ��������� ���� � ���������� ��� ����������� ����� � ���������� ��������� ������� � �������
    public double getCost(Visitor visitor) {
        double price = 0;// ��������� ������� � ������ �������
        for (Product product : products) {// ���������� ��� �������� �������
            price += product.getCost(visitor); // ��������� � ���������� ��� ����������� ����� � ������������ ����� ����� ������� � �������
        }
        return price;// ���������� ��������� ������� � ������� � ���������� ��� ����������� ������
    }
}
