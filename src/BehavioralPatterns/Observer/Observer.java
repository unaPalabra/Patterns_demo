package BehavioralPatterns.Observer;

import java.util.List;

// ��������� ����������
interface Observer {
    // ����� ��������� ������� ��������
    void handleEvent(List<String> news);// � �������� ��������� ��������� ������ ����� news
}
