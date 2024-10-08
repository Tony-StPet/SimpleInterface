
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
//Сделайте интерфейс , в котором будет 1 метод "вычислить" с двумя целочисленными параметрами и целочисленным результатом
interface ICalculator{
    int calc(int a, int b);
}
//Сделайте 4 класса, реализующих этот интерфейс:
class Summator implements ICalculator{
    public int calc(int a, int b) { return a+b; }
}

class Substractor implements ICalculator{
    public int calc(int a, int b) { return a-b; }
}

class Multiplier implements ICalculator{
    public int calc(int a, int b) { return a*b; }
}

class Divider implements ICalculator{
    public int calc(int a, int b) { return a/b; }
}

//Сделайте основной класс, где будет main, в котором
//пользователь введет пару чисел, и будут применены разные реализации интерфейса
public class Demonstration {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("введите 2 числа");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//
//        ICalculator c1 = new Summator();
//        System.out.println(c1.calc(x, y));
//        c1 = new Substractor();
//        System.out.println(c1.calc(x, y));
//        ICalculator c2 = new Multiplier();
//        System.out.println(c2.calc(x, y));
        solarSystem();


    }

    private static void solarSystem() {
        List<Planet> planetList = new ArrayList<>();
        planetList.add(new Planet("Меркурий", 0.055));
        planetList.add(new Planet("Венера", 0.815));
        planetList.add(new Planet("Земля", 1));
        planetList.add(new Planet("Марс", 0.107));
        planetList.add(new Planet("Юпитер", 318));
        planetList.add(new Planet("Сатурн", 95));
        planetList.add(new Planet("Уран", 14));
        planetList.add(new Planet("Нептун", 17));
        //System.out.println(planrtList);
        planetList.stream().forEach(x -> System.out.println(x));
        planetList.sort((x, y) -> Double.compare(x.koeff, y.koeff));
        System.out.println("После сортировки");
        planetList.stream().forEach(x -> System.out.println(x));

        planetList.sort(new StarLord());
        System.out.println("После сортировки");
        planetList.stream().forEach(x -> System.out.println(x));

        // добавляю спутники планетам
        Planet earth = planetList.get(2);
        earth.addMoon(new Moon("Луна", (1/81), "серый"));

        Planet mars = planetList.get(3);
        mars.addMoon(new Moon("Фобос", 1.072e16, ""));

    }


}
class AstronomRadgesh implements Comparator<Planet> {
    @Override
    public  int compare(Planet p1, Planet p2){
        return Double.compare(p1.koeff,p2.koeff);
    }
}

class StarLord implements Comparator<Planet> {
    @Override
    public int compare(Planet p1, Planet p2){
        return p1.name.compareTo(p2.name);
    }
}