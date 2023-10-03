package BehavioralPatterns.Strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        // ������� ��������
        Context context = new Context();

        context.setStrategy(new FirstStrategy());//��������� ��������� ���������� ���������
        context.executeStrategy("��������� ���������");// �������� ���������

        context.setStrategy(new SecondStrategy());//��������� ��������� ������ ���������� ���������
        context.executeStrategy("��������� ���������");// �������� ���������
    }
}

