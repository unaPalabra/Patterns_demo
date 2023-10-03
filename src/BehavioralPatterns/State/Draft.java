package BehavioralPatterns.State;

// Состояние Черновик
class Draft implements State {
    @Override
    public void changeState(Article article) {
        article.setState(new Moderation());// Устанавливает статью в состояние Модерация.
        System.out.println("Draft State: Article waiting for moderation...");
    }
}
