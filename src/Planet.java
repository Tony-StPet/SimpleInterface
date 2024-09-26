import java.util.ArrayList;
import java.util.List;
public class Planet {

        String name;
        double koeff;
        private List<Moon> moons = new ArrayList<>();

        public Planet(String name, double koeff) {
            this.name = name;
            this.koeff = koeff;
        }
        public double mass (double koeff){
            return koeff*5.9726;
        }

    @Override
    public String toString() {
        return "Planet{" + " назв= '" + name+ "  масса от массы земли= '"+ " "+ mass(koeff)+'}';
    }

    public void addMoon(Moon m){
        this.moons.add(m);
    }

    public List<Moon> getMoons() {
        return moons;
    }
}