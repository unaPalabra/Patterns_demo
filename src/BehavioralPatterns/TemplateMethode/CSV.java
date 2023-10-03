package BehavioralPatterns.TemplateMethode;

class CSV extends DocWork {
    @Override
    protected void rework() {
        System.out.println("Обработка CSV");
    }

    @Override
    protected void exit() {
        System.out.println("Конец CSV");
    }
}
