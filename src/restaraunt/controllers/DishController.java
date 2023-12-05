package restaraunt.controllers;

import restaraunt.domain.interfaces.Dishes;
import restaraunt.services.interfaces.DishesService;

import java.util.List;
import java.util.Scanner;

public class DishController {

    private DishesService service;

    public DishController(DishesService service) {
        this.service = service;
    }

    public void addProduct() {


        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter dish name: ");
            String name = scanner.nextLine();

            System.out.println("Enter dish price: ");
            double price = scanner.nextDouble();

            service.addDish(name, price);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Dishes> getAllDishes() {
        return service.getAllActiveDishes();
    }
}
