package pizza;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by harshita on 25/8/16.
 */
class Topping {

    public static Map<String, Integer> toppingsAvailable = new HashMap();

    public static void setAvailableToppings(String nameOfTopping, Integer priceOfTopping)
    {
        if (!(toppingsAvailable.containsKey(nameOfTopping))) {
            toppingsAvailable.put(nameOfTopping, priceOfTopping);
        }
    }

    public void displayToppingsMenu()
    {
        for (Map.Entry entry:toppingsAvailable.entrySet()) {
            System.out.println(entry.getKey());

        }
    }

    public int calculateToppingsPrice(Map<String, Integer> listOfToppings)
    {
        int totalCostOfToppings = 0;
        for (Map.Entry entry : listOfToppings.entrySet()) {
            for (Map.Entry entry1 : toppingsAvailable.entrySet()) {
                //System.out.println("topping name: "+entry1.getKey()+" topping count: "+entry1.getValue()+"topping name: "+entry.getKey()+" topping count: "+entry.getValue());
                if (entry.getKey().equals(entry1.getKey()))
                {
                   // System.out.println("........."+entry.getKey()+"........."+entry1.getKey());
                    totalCostOfToppings += (((int)entry1.getValue())*((int)entry.getValue()));
                }
            }
        }
        return totalCostOfToppings;
    }
}
