import javafx.scene.control.SpinnerValueFactory;

/**
 * Created by tatar on 08.03.17.
 */
public class Platoon implements Military {
    private Integer value;
    private Integer bak;
    private Integer weapon;

    public Platoon() {
        this.value=100;
        this.bak=2000*100;
        this.weapon=100;
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
