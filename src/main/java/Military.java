/**
 * Created by tatar on 08.03.17.
 */
public interface Military {
    Number value();
    Number weapon();
    Number bak();
    void add(Military military);
    //void addBaks(Military military);
    //void addWeapons(Military military);
    Military getWeapons(int weapons);
    Military getSold(int sold);
    Military getBudget(int bak);


}
