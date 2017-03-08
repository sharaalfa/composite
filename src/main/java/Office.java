import java.util.List;

/**
 * Created by tatar on 08.03.17.
 */
public class Office implements Military, Cloneable {
    private Integer value;
    private Integer bak;
    private Integer weapon;

    @Override
    protected Office clone() throws CloneNotSupportedException {
        return (Office) super.clone();
    }

    public Office(Integer value, Integer bak, Integer weapon) {
        this.value=value;
        this.bak=bak;
        this.weapon=weapon;
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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getBak() {
        return bak;
    }

    public void setBak(Integer bak) {
        this.bak = bak;
    }

    public Integer getWeapon() {
        return weapon;
    }

    public void setWeapon(Integer weapon) {
        this.weapon = weapon;
    }
}
