package GeneratingPatterns.Prototype;

//�������� �������� ������
class Main{
    public static void main(String[] args) {
        //  �������� ����������
        Car car = new Car(1, "Mercedes", (Tyre) new Tyre("Pirelli", 19));
        System.out.println(car);

        //  ������ �������� ����� ����������, ������ ����� getClone().
        //  �.�. ����� getClone() ����������  Object, �� ����� ���������� ���������� � ���� Car
        Car car2 = (Car) car.getClone();
        System.out.println(car2);

        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());

        System.out.println(car.equals(car2));


        System.out.println("\n������� ������ � ������������� ����������");
        //��������, ��� �� �������� ����������� ����� ������ ����������. ��� ����� � ��������� ������� ������ �� ������.
        car.getTyre().setName("Dunlop");
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car.equals(car2));
    }
}
