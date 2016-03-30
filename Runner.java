import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class Runner here.
 * 
 * @author Adam Eichhorn
 * @version 3/15/16
 */
public class Runner {
    private Tower t1, t2, t3;
    private int numDiscs;
    private int count;
    private double moves;
    
    public void main(int n) {
        t1 = new Tower();
        t2 = new Tower();
        t3 = new Tower();
        
        numDiscs = n;
        count = 0;
        moves = (Math.pow(2, numDiscs))-1;
        
        t1.fillTower(numDiscs);
        
        sort(numDiscs, "Tower 1", "Tower 2", "Tower 3");
        System.out.println(moves);
    }
    
    public void sort(int topDisc, String tower1, String tower2, String tower3) {
        if (topDisc == 1) {
            System.out.println("Disc 1 from " + tower1 + " to " + tower3);
        }
        else {
            sort(topDisc-1, tower1, tower3, tower2);
            System.out.println("Disc " + topDisc + " from " + tower1 + " to " + tower3);
            sort(topDisc-1, tower2, tower1, tower3);
        }
        
    }
}
