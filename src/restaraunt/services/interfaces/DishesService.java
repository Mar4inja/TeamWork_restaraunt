package restaraunt.services.interfaces;

import restaraunt.domain.interfaces.Dishes;

import java.util.List;

public interface DishesService {

    void addDish(String name, double price);
    List<Dishes> getAllActiveDishes();
}
