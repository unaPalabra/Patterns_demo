package BehavioralPatterns.State;

// Состояние Публикация
class Publication implements State {
    @Override
    public void changeState(Article article) {// Не изменяет состояние статьи после публикации.
        System.out.println("Publication State: Nothing happens...");
    }
}
