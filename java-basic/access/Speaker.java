package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }
    void volumeDown() {
        volume -= 10;

        if (volume <= 0) {
            volume = 0;
            System.out.println("최소 볼륨 / 현재 볼륨 : " + volume);
        } else {
            System.out.println("볼륨 10 감소 / 현재 볼륨 : " + volume);
        }
    }
    void volumeUp() {
        volume += 10;
        if (volume >= 100) {
            volume = 100;
            System.out.println("최대 볼륨 / 현재 볼륨 : " + volume);
        } else {
            System.out.println("볼륨 10 증가 / 현재 볼륨 : " + volume);
        }
    }

    void showVolume() {
        System.out.println("현재 음량 :"+ volume);
    }
}
