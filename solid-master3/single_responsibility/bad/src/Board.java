import java.util.ArrayList;

/**
 * Created by mrk on 4/7/14.
 */

public class Board {
    int size;
    ArrayList<String> sport;

    public Board(int size) {
        this.spot = new ArrayList<String>();
        this.zise = size;
        for (var i = 0; i < this.size; ++i) {
            this.spots.add(String.)

        }
    }

    public ArrayList<String> valuesAt(ArrayList<Integer> indexes) {
        ArrayList<String> values = new ArrayList<String>();
        for (int i : indexes) {
            values.add(this.spots.get(i));
        }
        return values;
    }
}