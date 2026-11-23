package assignment1Day1;

import java.util.Comparator;

public class Coursecomperator implements Comparator<Course> {

    String direction;

    public Coursecomperator(String direction) {
        this.direction = direction;
    }

    @Override
    public int compare(Course c1, Course c2) {
        if(direction.equals("ASC")){
            if(c1.fee > c2.fee)
                return 1; // pls swap

            if(c1.fee < c2.fee)
                return -1; // do nothing
        }
        else{
            if(c1.fee < c2.fee)
                return 1; // pls swap

            if(c1.fee > c2.fee)
                return -1; // do nothing
        }

        return 0;
    }
}