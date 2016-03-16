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
    
    public int removeDisc() {
        if (tower.size() > 0) {
            return tower.remove(tower.size()-1).getR();
        }
        else {
            return 0;
        }
    }
    
    public void addDisc(Disc d) {
        tower.add(d);
    }
    
    public Disc topDisc() {
        if (tower.size() > 0) {
            return tower.get(tower.size()-1);
        }
        else {
            return null;
        }
    }
    
    public int getNumOfDiscs() {
        return tower.size();
    }
}
