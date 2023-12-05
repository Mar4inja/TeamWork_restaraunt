package restaraunt.repositories;

import restaraunt.domain.CommonDishes;
import restaraunt.domain.interfaces.Dishes;
import restaraunt.repositories.interfaces.DishesRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonDishesRepository implements DishesRepository {

    private Map<Integer, Dishes> dishes = new HashMap<>();
    private int currentId;

    public CommonDishesRepository() {
        addDish("Pizza", 7.20);
        addDish("Burger", 5.40);
        addDish("Ramen", 3.90);
        addDish("Paella", 9.25);
        addDish("Pierogi", 4.15);
        addDish("Moussaka", 6);
        addDish("Boeuf Bourgignon", 11.10);
        addDish("Eisbein", 5.90);
        addDish("Tom Kha Gai", 7.25);
        addDish("Chicken Tikka Massala", 9.80);

    }

    @Override
    public List<Dishes> getAllDishes() {
        return new ArrayList<>(dishes.values());
    }

    @Override
    public void addDish(String name, double price) {
        CommonDishes dish = new CommonDishes(name, price);
        dish.setId(++currentId);
        dishes.put(currentId, dish);
    }

    @Override
    public void removeDish(int id) {
        dishes.entrySet().removeIf(entry -> entry.getValue().getId() == id);

    }
}
