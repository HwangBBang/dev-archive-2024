package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레어이 시작");

        //볼륨 업
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        //볼륨 업
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        //볼륨 다운
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON | 음악 플레이어 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF | 음악 플레이어 볼륨 : " + data.volume);
        }
    }
}
