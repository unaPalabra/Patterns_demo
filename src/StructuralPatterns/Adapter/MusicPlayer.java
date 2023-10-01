package StructuralPatterns.Adapter;

public class MusicPlayer {
    public static void main(String[] args) {
        // Здесь создаем объект адаптера, реализованного через наследование, но обращаемся к нему через интерфейс OldPlayerInterface
        OldPlayerInterface oldPlayerInterface = new NewPlayerAdapter();
        oldPlayerInterface.playMusic();
        oldPlayerInterface.stopMusic();
        // Здесь создаем объект адаптера, реализованного через композицию.
        OldPlayerInterface oldPlayerInterfaceTwo = new NewPlayerAdapterTwo();
        oldPlayerInterfaceTwo.playMusic();
        oldPlayerInterfaceTwo.stopMusic();
    }
}
//  Интерфейс старого плеера, методы которого использует клиентская часть. Позволяют начать и остановить воспроизведение. На схеме - ClientInterface.
interface OldPlayerInterface{
    void playMusic();
    void stopMusic();
}
//  Интерфейс нового музыкального плеера. Функционал аналогичен старому плееру, но методы другие.
interface NewPlayerInterface{
    void play();
    void stop();
}
//  Это класс нового плеера, реализующий интерфейс NewPlayerInterface. На схеме - Service.
class NewPlayer implements NewPlayerInterface{
    @Override
    public void play() {
        System.out.println("Playing music");
    }
    @Override
    public void stop() {
        System.out.println("Stopping music");
    }
}
//  Класс адаптер, реализованный через наследование. Чтобы адаптер работал, нужно унаследоваться от класса NewPlayer и реализовать интерфейс OldPlayerInterface.
class NewPlayerAdapter extends NewPlayer implements OldPlayerInterface{

    // Внутри метода playMusic() клиентской части мы вызываем метод play() нового плеера
    @Override
    public void playMusic() {
        play();// метод класса NewPlayer
    }
    // Внутри метода stopMusic() клиентской части мы вызываем метод play() нового плеера
    @Override
    public void stopMusic() {
        stop();// метод класса NewPlayer
    }
}
//  Класс адаптер, реализованный через наследование. Чтобы адаптер работал, нужно реализовать интерфейс OldPlayerInterface.
class NewPlayerAdapterTwo implements OldPlayerInterface{
    // Теперь мы не наследуемся от класса NewPlayer, а используем его в виде поля адаптера
    NewPlayer newPlayer = new NewPlayer();
    // Внутри метода playMusic() клиентской части мы вызываем метод play() нового плеера
    @Override
    public void playMusic() {
        newPlayer.play();// метод класса NewPlayer
    }
    // Внутри метода stopMusic() клиентской части мы вызываем метод stop() нового плеера
    @Override
    public void stopMusic() {
        newPlayer.stop();// метод класса NewPlayer
    }
}
