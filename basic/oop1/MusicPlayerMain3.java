package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);
        //볼륨 업
        volumeUp(data);
        //볼륨 업
        volumeUp(data);
        //볼륨 다운
        volumeDown(data);
        // 상태 확인
        showStatus(data);
        // 음악 플레이어 끄기
        off(data);
        // 상태 확인
        showStatus(data);
    }

    static void off(MusicPlayerData data) {

        data.isOn = false;
        System.out.println("음악 플레어이 종료");
    }
    static void on(MusicPlayerData data) {

        data.isOn = true;
        System.out.println("음악 플레어이 시작");
    }
    static void showStatus(MusicPlayerData data) {
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON | 음악 플레이어 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF | 음악 플레이어 볼륨 : " + data.volume);
        }
    }

    static void volumeUp(MusicPlayerData data) {
        //볼륨 업
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        //볼륨 업
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
}
