package pizza;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by harshita on 25/8/16.
 */

public class MyPizza {

    static final int PIZZA_BASE_PRICE=60;
    Map<String,Integer> userListOfToppings=new HashMap<>();


    Topping topping=new Topping();

    public Map<String, Integer> getUserListOfToppings() {
        return userListOfToppings;
    }

    public void setUserListOfToppings(String nameOfTopping, int countOfTopping)
    {
        if (!(userListOfToppings.containsKey(nameOfTopping))) {
            userListOfToppings.put(nameOfTopping, countOfTopping);
        }
    }

    public int calculateTotalPriceOfPizza()
    {
        int totalPriceOfPizza=0;
        totalPriceOfPizza += topping.calculateToppingsPrice(userListOfToppings)+PIZZA_BASE_PRICE;
        return totalPriceOfPizza;

    }
}
