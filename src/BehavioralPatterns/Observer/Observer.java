package BehavioralPatterns.Observer;

import java.util.List;

// Интерфейс подписчика
interface Observer {
    // метод обработки события издателя
    void handleEvent(List<String> news);// в качестве аргумента принимает список строк news
}
