package BehavioralPatterns.TemplateMethode;

//Подклассы реализуют атомарные методы, не трогая шаблонный метод.  Для PDF и CSV будет работать по-разному.
class PDF extends DocWork {
    @Override
    protected void rework() {
        System.out.println("Обработка PDF");
    }

    @Override
    protected void exit() {
        System.out.println("Конец PDF");
    }
}
