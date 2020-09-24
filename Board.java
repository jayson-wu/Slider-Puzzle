/*******************************************************************************
 *  Name:    Jayson Wu
 *  NetID:   jnwu
 *  Precept: P07
 *
 *  Partner Name:    Joy Quan
 *  Partner NetID:
 *  Partner Precept:
 *
 *  Description: Models an n by n board with sliding tile
 *
 **************************************************************************** */

public class Board {
    // contains the board
    int[][] board;
    // size of the board
    int n;
    // contains the hamming distance
    int hamming;
    // contains the manhattan distance
    int manhattan;

    // create a board from an n-by-n array of tiles,
    // where tiles[row][col] = tile at (row, col)
    public Board(int[][] tiles) {
        n = tiles.length;
        board = new int[n][n];
        hamming = 0;
        manhattan = 0;
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[0].length; j++) {
                board[i][j] = tiles[i][j];
                if (board[i][j] != i * board.length + j) {
                    hamming++;
                }
            }
        }
    }

    // string representation of this board
    public String toString() {
        String rtn = board.length + "\n";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                rtn += board[i][j] + " ";
            }
            rtn += "\n";
        }
        return rtn;
    }

    // tile at (row, col) or 0 if blank
    public int tileAt(int row, int col) {
        if (row < 0 || row > board.length - 1 ||
                col < 0 || col > board.length - 1)
            throw new IllegalArgumentException("Invalid parameters!");
        return board[row][col];
    }

    // board size n
    public int size() {
        return board.length;
    }

    // number of tiles out of place
    public int hamming() {
        return hamming;
    }

    // sum of Manhattan distances between tiles and goal
    public int manhattan() {
        return manhattan;
    }

    // is this board the goal board?
    public boolean isGoal() {
        return hamming == 0;
    }

    // does this board equal y?
    public boolean equals(Object y) {
        if (board.length != y.)
    }

    // all neighboring boards
    public Iterable<Board> neighbors()

    // is this board solvable?
    public boolean isSolvable()

    // unit testing (required)
    public static void main(String[] args)

}
