package restaraunt.controllers;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    private DishController dishController;

    public MainController(DishController dishController) {
        this.dishController = dishController;
    }

    public List<Object> sendRequest(String query) {


        try {


            String[] parts = query.split(" ");
            int objectNumber = Integer.parseInt(parts[0]);
            int operationNumber = Integer.parseInt(parts[1]);

            List<Object> result = new ArrayList<>();

            switch (objectNumber) {
                case 1:
                    switch (operationNumber) {
                        case 1:
                            dishController.addProduct();

                        case 2:
                            result.addAll(dishController.getAllDishes());
                            break;
                        default:
                            System.err.println("Incorect input");
                            break;
                    }
                case 2: // working with clients
                    // there we call client controller
                    break;
            }

            return result;
        } catch (Exception e) {
            System.err.println("Error on Main Controller!");
            throw new RuntimeException(e);
        }
    }
}

