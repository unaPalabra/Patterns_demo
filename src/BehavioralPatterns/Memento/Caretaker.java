package BehavioralPatterns.Memento;

// отвечает за сохранение объекта-хранителя, содержит ссылку на Snapshot. Отвечает за откат к прежнему состоянию.
class Caretaker {
    Snapshot backup;

    // возвращает сохраненный объект класса-хранителя
    public Snapshot getBackup() {
        return backup;
    }

    // сохраняет объект класса хранителя
    public void setBackup(Snapshot backup) {
        this.backup = backup;
    }
}
