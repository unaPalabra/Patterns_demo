package BehavioralPatterns.TemplateMethode;

public class TemplateMethodeRunner {
    public static void main(String[] args) {
        // Переменную docWork назначаем объектом CSV
        DocWork docWork = new CSV();
        docWork.handleDoc();// Вызываем  шаблонный метод
        System.out.println("\n=============================\n");
        // Переменную docWork назначаем объектом PDF
        docWork = new PDF();
        docWork.handleDoc();// Вызываем  шаблонный метод
    }
}

