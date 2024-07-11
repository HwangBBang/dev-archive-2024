package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void off() {
        isOn = false;
        System.out.println("음악 플레어이 종료");
    }
    void on() {

        isOn = true;
        System.out.println("음악 플레어이 시작");
    }
    void showStatus( ) {
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON | 음악 플레이어 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF | 음악 플레이어 볼륨 : " + volume);
        }
    }

    void volumeUp( ) {
        //볼륨 업
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void volumeDown( ) {
        //볼륨 업
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

}
