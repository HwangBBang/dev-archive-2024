package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        // 음악 플레이어 켜기
        musicPlayer.on();
        //볼륨 업
        musicPlayer.volumeUp();
        //볼륨 업
        musicPlayer.volumeUp();
        //볼륨 다운
        musicPlayer.volumeDown();
        // 상태 확인
        musicPlayer.showStatus();
        // 음악 플레이어 끄기
        musicPlayer.off();
        // 상태 확인
        musicPlayer.showStatus();
    }

}
