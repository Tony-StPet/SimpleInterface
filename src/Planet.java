public class Planet {

        String name;
        double koeff;

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

}