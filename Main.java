import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<HotDrinks> drinks = new LinkedList<>(List.of(new HotDrinks(1, "Coffee", 100, 70),
                new HotDrinks(1, "Coffee", 100, 80),
                new HotDrinks(1, "Coffee", 100, 90),
                new HotDrinks(1, "Coffee", 200, 70),
                new HotDrinks(1, "Coffee", 200, 80),
                new HotDrinks(1, "Coffee", 200, 90),
                new HotDrinks(1, "Coffee", 400, 70),
                new HotDrinks(1, "Coffee", 400, 80),
                new HotDrinks(1, "Coffee", 400, 90),
                new HotDrinks(2, "Cappuccino", 100, 70),
                new HotDrinks(2, "Cappuccino", 100, 80),
                new HotDrinks(2, "Cappuccino", 100, 90),
                new HotDrinks(2, "Cappuccino", 200, 70),
                new HotDrinks(2, "Cappuccino", 200, 80),
                new HotDrinks(2, "Cappuccino", 200, 90),
                new HotDrinks(2, "Cappuccino", 400, 70),
                new HotDrinks(2, "Cappuccino", 400, 80),
                new HotDrinks(2, "Cappuccino", 400, 90),
                new HotDrinks(3, "Latte", 100, 80),
                new HotDrinks(3, "Latte", 100, 90),
                new HotDrinks(3, "Latte", 200, 70),
                new HotDrinks(3, "Latte", 200, 80),
                new HotDrinks(3, "Latte", 200, 90),
                new HotDrinks(3, "Latte", 400, 70),
                new HotDrinks(3, "Latte", 400, 80),
                new HotDrinks(3, "Latte", 400, 90)));
        HotVendingMachine machine = new HotVendingMachine(drinks);

        machine.getDrink(getId(), getVolume(), getTemperature());

    }

    public static Integer getId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер напитка от 1 до 3: ");
        Integer drinkId = scanner.nextInt();

        return drinkId;

    }

    public static Integer getVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите обьем напитка(100мл, 200мл, 400мл): ");
        Integer drinkVolume = scanner.nextInt();

        return drinkVolume;
    }

    public static Integer getTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру напитка(70°, 80°, 90°): ");
        Integer drinkTemperature = scanner.nextInt();

        return drinkTemperature;
    }
}