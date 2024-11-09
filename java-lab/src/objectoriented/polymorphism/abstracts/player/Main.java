package objectoriented.polymorphism.abstracts.player;

public class Main {
    public static void main(String[] args) {
        CDPlayer cdplayer = new CDPlayer();
        cdplayer.play(); // 현재 위치(0)에서 오디오 재생 시작
        cdplayer.play(3); // 위치 10에서 오디오 재생 시작
        cdplayer.pause(); // 오디오 일시 정지
        cdplayer.pause(); // 오디오 다시 재생
        cdplayer.stop();
    }
}
