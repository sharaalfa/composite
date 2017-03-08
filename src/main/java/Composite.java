import java.util.ArrayList;
import java.util.List;

/**
 * Created by tatar on 08.03.17.
 */
public class Composite implements Military{
    private List<Military> components;

    public Composite(Military... components) {
        this.components = new ArrayList<Military>();
        for(Military component: components){
            this.components.add(component);
        }
    }

    public Number value() {
        Number result = new Integer(0);
        for (Military component: components){
            result = result.intValue() + component.value().intValue();
        }
        return result;
    }

    public Number weapon() {
        Number result = new Integer(0);
        for (Military component: components){
            result = result.intValue() + component.weapon().intValue();
        }
        return result;
    }

    public Number bak() {
        Number result = new Integer(0);
        for (Military component: components){
            result = result.intValue() + component.bak().intValue();
        }
        return result;
    }

    public void addBaks(Military military) {
        components.add(military);

    }

    public void addWeapons(Military military) {
        components.add(military);

    }

    public void add(Military military) {
        components.add(military);

    }

    public Military getWeapons(int weapons) {
        return components.get(weapons);
    }

    public Military getSold(int sold) {
        return components.get(sold);
    }

    public Military getBudget(int bak) {
        return components.get(bak);
    }
}
