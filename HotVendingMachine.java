import java.util.LinkedList;
import java.util.List;

public class HotVendingMachine implements VendingMachine {
    private List<HotDrinks> drinks = new LinkedList<>();

    public HotVendingMachine(List<HotDrinks> drinks) {
        this.drinks = drinks;
    }

    public void setDrinks(List<HotDrinks> drinks) {
        this.drinks = drinks;
    }

    @Override
    public void getDrink(Integer id, Integer volume, Integer temperature) {

        for (HotDrinks drink : drinks) {
            if (drink.getId().equals(id)) {

                if (drink.getVolume().equals(volume)) {

                    if (drink.getTemperature().equals(temperature)) {
                        System.out.println("Возьмите ваш напиток " + drink);
                    }

                }

            }
        }

    }

}