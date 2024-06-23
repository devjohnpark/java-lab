package objectoriented.polymorphism.abstracts.player;

class CDPlayer extends Player {
    @Override
    void play(int pos) {
        currentPos = pos; // 현재 위치 갱신
    }

    @Override
    void stop() {

    }

    int currentTrack;

    void nextTrack() {
        currentTrack++;
    }

    void prevTrack() {
        if (currentTrack > 1) {
            currentTrack--;
        }
    }
}
