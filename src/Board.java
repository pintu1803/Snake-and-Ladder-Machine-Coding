

class Board {

    //Default size of the board is 10x10, so we have 100 cells
    private static final int SIZE = 101;
    private Cell[] cells = new Cell[SIZE];

    private Snake[] snakes;
    private Ladder[] ladders;

    private int snakeCount;
    private int ladderCount;

    public Board() {
        // Initialize the cells
        for (int i = 0; i < SIZE; i++) {
            cells[i] = new Cell(i + 1);
        }
    }


    // GETTERS AND SETTERS - START
    public void setSnakeCount(int snakeCount) {
        this.snakeCount = snakeCount;
        this.snakes = new Snake[snakeCount];
    }

    public int getSnakeCount() {
        return snakeCount;
    }

    public void setLadderCount(int ladderCount) {
        this.ladderCount = ladderCount;
        this.ladders = new Ladder[ladderCount];
    }

    public int getLadderCount() {
        return ladderCount;
    }
    // GETTERS AND SETTERS - END


    int i = 0;
    public void addSnake(Snake snake) {
        if(i >= snakeCount) {
            throw new IllegalStateException("Cannot add more snakes than the specified count");
        }

        snakes[i++] = snake;

        cells[snake.getSnakeHead()].setSnakeHead();
        cells[snake.getSnakeTail()].setSnakeTail();
    }

    int j = 0;
    public void addLadder(Ladder ladder) {
        if(j >= ladderCount) {
            throw new IllegalStateException("Cannot add more ladders than the specified count");
        }

        ladders[j++] = ladder;

        cells[ladder.getLadderStart()].setLadderStart();
        cells[ladder.getLadderEnd()].setLadderEnd();
    }

    public int getWinningPosition() {
        return Board.SIZE - 1;
    }

    public static int makeMove(Board board, int position) {
        if(position >= SIZE) {
            return -1;
        }

        while(board.cells[position].isSnakeHead() || board.cells[position].isLadderStart()) {
            if(board.cells[position].isSnakeHead()) {
                for(Snake snake : board.snakes) {
                    if(snake.isSnake(position)) {
                        position = snake.getSnakeTail();
                    }
                }
            }
            
            if(board.cells[position].isLadderStart()) {
                for(Ladder ladder : board.ladders) {
                    if(ladder.isLadder(position)) {
                        position = ladder.getLadderEnd();
                    }
                }
            }
        }

        return position;
    }

}