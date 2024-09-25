
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        ICalculator c1 = new Summator();
        System.out.println(c1.calc(x, y));
        c1 = new Substractor();
        System.out.println(c1.calc(x, y));
        ICalculator c2 = new Multiplier();
        System.out.println(c2.calc(x, y));
    }
}
