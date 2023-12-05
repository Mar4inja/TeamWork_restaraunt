package restaraunt.services;

import restaraunt.domain.interfaces.Dishes;
import restaraunt.repositories.interfaces.DishesRepository;
import restaraunt.services.interfaces.DishesService;

import java.util.List;
import java.util.stream.Collectors;

public class CommonDishesService implements DishesService {

    private DishesRepository repository;

    public CommonDishesService(DishesRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addDish(String name, double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can't be null");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price can't be negative");
        }
        repository.addDish(name, price);
    }

    @Override
    public List<Dishes> getAllActiveDishes() {
        return repository.getAllDishes()
                .stream()
                .filter(x -> x.isActive())
                .collect(Collectors.toList());
    }
}
