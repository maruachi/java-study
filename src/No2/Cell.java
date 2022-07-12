package No2;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private final int x1, y1;
    private final int x2, y2;

    public Cell(int x1, int y1, int x2, int y2) {
        if (x1 >= x2 || y1 >= y2) {
            throw new RuntimeException();
        }
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static List<Cell> createLands(){
        List<Cell> lands = new ArrayList<>();
        lands.add(new Cell(10,0,30,5));
        lands.add(new Cell(0, 30,20,50));
        lands.add(new Cell(30,30,40,40));
        return lands;
    }

    public static List<Cell> createWells(){
        List<Cell> wells = new ArrayList<>();
        wells.add(new Cell(15, 15, 25,25));
        wells.add(new Cell(40, 10, 50,20));
        return wells;
    }


    public boolean hasArea(Cell other) {
        if ((x1 > other.x2 || x2 < other.x1) && (y1 > other.y2 || y2 < other.y1)) {
            return false;
        }
        return true;
    }
}
