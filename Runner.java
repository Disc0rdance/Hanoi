import java.util.ArrayList;
/**
 * Write a description of class Runner here.
 * 
 * @author Adam Eichhorn
 * @version 3/15/16
 */
public class Runner {
    private Tower t1, t2, t3;
    private int numDiscs;
    
    public void main(int n) {
        t1 = new Tower();
        t2 = new Tower();
        t3 = new Tower();
        
        numDiscs = n;
        t1.fillTower(numDiscs);
    }
    
    public void run() {
        if (numDiscs % 2 == 0) {
            sort1(numDiscs);
        }
        else {
            sort2(numDiscs);
        }
    }
    
    public void sort1(int n) {
        
        if (n < 1) {
            
        }
    }
    
    public void sort2(int n) {
        
    }
}
