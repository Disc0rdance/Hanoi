import java.util.ArrayList;
/**
 * Write a description of class Tower here.
 * 
 * @author Adam Eichhorn
 * @version 3/14/16
 */
public class Tower {
    private ArrayList<Disc> tower;
    
    public Tower() {
        tower = new ArrayList<Disc>();
    }
    
    public ArrayList<Disc> fillTower(int n) {
        if (n < 1) {
            return tower;
        }
        else {
            tower.add(new Disc(n));
            return fillTower(n-1);
        }
    }
    
    public void removeDisc() {
        if (tower.size() > 0) {
            tower.remove(tower.size()-1);
        }
    }
    
    public void addDisc(Disc d) {
        tower.add(d);
    }
    
    public Disc topDisc(ArrayList<Disc> t) {
        if (t.size() > 0) {
            return t.get(t.size()-1);
        }
        else {
            return null;
        }
    }
    
    //Returns whether or not t2 has a larger disc at its top than t1 (null will be largest)
    public boolean hasLargerDisc(ArrayList<Disc> t1, ArrayList<Disc> t2) {
        if (topDisc(t2) == null && topDisc(t1) != null) {
            return true;
        }
        else if (topDisc(t1) == null) {
            return false;
        }
        else {
            return (topDisc(t1).getR() < topDisc(t2).getR());
        }
    }
    
    
    
    public Tower sortStack(int n) {
        if (n < 1) {
            return this;
        }
        else {
            return sortStack(n-1);
        }
    }
}
