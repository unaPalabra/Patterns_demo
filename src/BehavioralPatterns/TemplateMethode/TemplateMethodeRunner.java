package BehavioralPatterns.TemplateMethode;

public class TemplateMethodeRunner {
    public static void main(String[] args) {
        // ���������� docWork ��������� �������� CSV
        DocWork docWork = new CSV();
        docWork.handleDoc();// ��������  ��������� �����
        System.out.println("\n=============================\n");
        // ���������� docWork ��������� �������� PDF
        docWork = new PDF();
        docWork.handleDoc();// ��������  ��������� �����
    }
}

