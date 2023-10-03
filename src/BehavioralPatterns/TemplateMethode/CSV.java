package BehavioralPatterns.TemplateMethode;

class CSV extends DocWork {
    @Override
    protected void rework() {
        System.out.println("��������� CSV");
    }

    @Override
    protected void exit() {
        System.out.println("����� CSV");
    }
}
