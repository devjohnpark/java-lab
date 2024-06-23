package objectoriented.polymorphism.abstracts.player;

abstract class Player {
    boolean pause;  // 일시 정지 상태를 저장하기 위한 변수
    protected int currentPos; // 현재 play 되고 있는 위치를 저장하기 위한 변수

    // 추상 클래스도 멤버 변수가 존재하기 때문에 생성자 필요
    Player() {
        pause = false;
        currentPos = 0;
    }

    /* 지정된 위치인 pos에서 재생을 시작하는 기능이 수행되도록 작성 필요  */
    abstract void play(int pos);

    /* 재생을 즉시 멈추는 기능을 수행하도록 작성 필요 */
    abstract void stop();

    void play() {
        play(currentPos); // 메서드 내에 추상 메서드를 사용할 수 있다.
    }

    void pause() {
        if (pause) {
            pause = false;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }
    }

}
