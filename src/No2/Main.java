package No2;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Cell> lands = Cell.createLands();
        List<Cell> wells = Cell.createWells();
        Cell newLand = new Cell(10, 10, 30, 30);

        boolean shareLand = false;
        for(Cell land : lands){
            if(newLand.hasArea(land)){
                shareLand = true;
                break;
            }
        }

        boolean hasWater = false;
        for(Cell well : wells){
            if(newLand.hasArea(well)){
                hasWater = true;
                break;
            }
        }

        if(shareLand == false && hasWater == true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
