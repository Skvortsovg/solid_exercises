import java.util.ArrayList;

public class BoardDisplayer {
    Board board;

    public BoardDisplayer(Board board) {
        this.board = board;
    }

    public void display() {
        String output = "";
        for(int i = 0; i < this.board.size * this.board.size; ++i) {
            output += board.spots.get(i);
            output += ((i + 1) % board.size == 0) ? "\n" : "|";
        }
        System.out.print(output);
    }
}
