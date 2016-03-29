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
    private int count;
    
    public void main(int n) {
        t1 = new Tower();
        t2 = new Tower();
        t3 = new Tower();
        
        numDiscs = n;
        count = 0;
        t1.fillTower(numDiscs);
    }
    
    public void sort1(int n) {
        if (n % 2 == 0) {
            t2.addDisc(t1.removeDisc());
            t3.addDisc(t1.removeDisc());
            t3.addDisc(t2.removeDisc());
            count += 3;
        }
        else {
            t2.addDisc(t1.removeDisc());
            t1.addDisc(t3.removeDisc());
            t2.addDisc(t3.removeDisc());
            count += 3;
        }
        sort1(n-1);
    }
    
    public void sort2(int n) {
        if (n % 2 != 0) {
            t3.addDisc(t1.removeDisc());
            t2.addDisc(t1.removeDisc());
            t2.addDisc(t3.removeDisc());
            count += 3;
        }
        else {
            t3.addDisc(t1.removeDisc());
            t1.addDisc(t2.removeDisc());
            t3.addDisc(t2.removeDisc());
            count += 3;
        }
        sort2(n-1);
    }
}
