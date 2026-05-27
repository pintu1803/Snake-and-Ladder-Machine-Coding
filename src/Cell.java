
class Cell {
    private int position;
    private boolean snakeHead;
    private boolean ladderStart;
    private boolean snakeTail;
    private boolean ladderEnd;

    // Both player can exist in the same cell, so we can have multiple players in the same cell
    // priavate boolean isOccupied;

    public Cell(int position) {
        this.position = position;
    }

    // SETTERS
    
    public boolean setSnakeHead() {
        return snakeHead = true;
    }

    public boolean setLadderStart() {
        return ladderStart = true;
    }

    public boolean setSnakeTail() {
        return snakeTail = true;
    }

    public boolean setLadderEnd() {
        return ladderEnd = true;
    }

    // GETTERS

    public boolean isSnakeHead() {
        return snakeHead;
    }

    public boolean isLadderStart() {
        return ladderStart;
    }

    public boolean isSnakeTail() {
        return snakeTail;
    }

    public boolean isLadderEnd() {
        return ladderEnd;
    }

}