import org.apache.log4j.Logger;

/**
 * Created by tatar on 08.03.17.
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class);

        Military component  = new Composite();
        Military military = new Composite(new Sold());
        Military military1 = new Composite(new Sold());
        //Military military2 = new Composite(new Office());
        component.add(new Sold());
        //component.add(new Platoon(3, 800, 1));
        //component.addBaks(new Sold());
        component.add(military);
        component.add(military1);
       //component.add(military2);
        component.add(new Platoon());

        /*Office office = new Office(100, 2000, 1);
        while(true) {
            try{
                Office office1 = office.clone();


            } catch (CloneNotSupportedException e) {
                logger.error("Объект не клонируется!");
            }

        }*/
        System.out.println("численность личного состава: " + component.value());
        System.out.println("общее денежное довольствие: " + component.bak());
        System.out.println("общее количество единиц личного оружия: " + component.weapon());



        /*Army army1 = new Army();
        Army army2 = new Army();
        Battalion battalion1 = new Battalion();
        Battalion battalion2 = new Battalion();
        Battalion battalion3 = new Battalion();
        Office offices1 = new Office();
        Office offices2 = new Office();
        Platoon platoon1 = new Platoon();
        Platoon platoon2 = new Platoon();
        Sold sold1 = new Sold(1);
        Sold sold2 = new Sold(1);
        Sold sold3 = new Sold(1);
        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        composite2.addComponent(sold1);
        composite2.addComponent(sold1);
        composite2.addComponent(sold2);
        composite2.addComponent(sold3);
        composite1.addComponent(composite2);
        composite.addComponent(offices1);
        composite.addComponent(battalion1);
        composite.addComponent(platoon1);
        composite.addComponent(army1);
        composite.addComponent(composite1);
        composite.getBudget();
        composite.getSold();
        composite.getWeapons();*/

    }
}
