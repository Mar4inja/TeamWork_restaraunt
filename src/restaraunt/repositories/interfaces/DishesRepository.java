package restaraunt.repositories.interfaces;

import restaraunt.domain.interfaces.Dishes;

import java.util.ArrayList;
import java.util.List;

public interface DishesRepository {

    List<Dishes> getAllDishes();

    void addDish(String name, double price);

    void removeDish(int id);


}
