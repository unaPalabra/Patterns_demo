package BehavioralPatterns.Strategy;

//����� ���������, �������� �� ����������� ����� ����� ���������
class Context {
    private Strategy strategy; // ������ �� ����� ���������

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;// ������ ���������
    }

    void executeStrategy(String string) {
        strategy.run(string);// �������� ���������
    }
}
