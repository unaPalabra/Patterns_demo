package StructuralPatterns.Adapter;

public class MusicPlayer {
    public static void main(String[] args) {
        // ����� ������� ������ ��������, �������������� ����� ������������, �� ���������� � ���� ����� ��������� OldPlayerInterface
        OldPlayerInterface oldPlayerInterface = new NewPlayerAdapter();
        oldPlayerInterface.playMusic();
        oldPlayerInterface.stopMusic();
        // ����� ������� ������ ��������, �������������� ����� ����������.
        OldPlayerInterface oldPlayerInterfaceTwo = new NewPlayerAdapterTwo();
        oldPlayerInterfaceTwo.playMusic();
        oldPlayerInterfaceTwo.stopMusic();
    }
}
//  ��������� ������� ������, ������ �������� ���������� ���������� �����. ��������� ������ � ���������� ���������������. �� ����� - ClientInterface.
interface OldPlayerInterface{
    void playMusic();
    void stopMusic();
}
//  ��������� ������ ������������ ������. ���������� ���������� ������� ������, �� ������ ������.
interface NewPlayerInterface{
    void play();
    void stop();
}
//  ��� ����� ������ ������, ����������� ��������� NewPlayerInterface. �� ����� - Service.
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
//  ����� �������, ������������� ����� ������������. ����� ������� �������, ����� �������������� �� ������ NewPlayer � ����������� ��������� OldPlayerInterface.
class NewPlayerAdapter extends NewPlayer implements OldPlayerInterface{

    // ������ ������ playMusic() ���������� ����� �� �������� ����� play() ������ ������
    @Override
    public void playMusic() {
        play();// ����� ������ NewPlayer
    }
    // ������ ������ stopMusic() ���������� ����� �� �������� ����� play() ������ ������
    @Override
    public void stopMusic() {
        stop();// ����� ������ NewPlayer
    }
}
//  ����� �������, ������������� ����� ������������. ����� ������� �������, ����� ����������� ��������� OldPlayerInterface.
class NewPlayerAdapterTwo implements OldPlayerInterface{
    // ������ �� �� ����������� �� ������ NewPlayer, � ���������� ��� � ���� ���� ��������
    NewPlayer newPlayer = new NewPlayer();
    // ������ ������ playMusic() ���������� ����� �� �������� ����� play() ������ ������
    @Override
    public void playMusic() {
        newPlayer.play();// ����� ������ NewPlayer
    }
    // ������ ������ stopMusic() ���������� ����� �� �������� ����� stop() ������ ������
    @Override
    public void stopMusic() {
        newPlayer.stop();// ����� ������ NewPlayer
    }
}
