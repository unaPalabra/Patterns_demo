package BehavioralPatterns.State;

// Состояние Модерация
class Moderation implements State {
    @Override
    public void changeState(Article article) {
        article.setState(new Publication());// Устанавливает статью в состояние Публикация.
        System.out.println("Moderation State: Publishing Article...");
    }
}
