

class Ladder {
    private int start;
    private int end;

    Ladder(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Boolean isLadder(int position) {
        return start == position;
    }

    public int getLadderEnd() {
        return end;
    }

    public int getLadderStart() {
        return start;
    }
}