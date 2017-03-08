/**
 * Created by tatar on 08.03.17.
 */
public class Sold implements Military{
    private Integer value;
    private Integer bak;
    private Integer weapon;

    public Sold() {
        this.value=1;
        this.bak=2000;
        this.weapon=1;
    }


    public Number value() {
        return value;
    }

    public Number weapon() {
        return weapon;
    }

    public Number bak() {
        return bak;
    }

    public void add(Military military) {

    }

    public void addBaks(Military military) {
    }

    public void addWeapons(Military military) {


    }

    public Military getWeapons(int weapons) {
        return null;
    }

    public Military getSold(int sold) {
        return null;
    }

    public Military getBudget(int bak) {
        return null;
    }
}
