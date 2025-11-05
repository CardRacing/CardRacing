package main.java.com.race.model;

public final class Track {

    private final int length;

    public Track(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Track 길이는 반드시 1이상입니다.");
        }

        this.length = length;
    }

    public int length() {
        return length;
        }
}
