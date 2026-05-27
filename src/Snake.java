
class Snake {
    private int head;
    private int tail;

    Snake(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }

    public Boolean isSnake(int position) {
        return head == position;
    }

    public int getSnakeTail() {
        return tail;
    }

    public int getSnakeHead() {
        return head;
    }
}