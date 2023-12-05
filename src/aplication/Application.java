package aplication;

import restaraunt.controllers.DishController;
import restaraunt.controllers.MainController;
import restaraunt.repositories.CommonDishesRepository;
import restaraunt.repositories.interfaces.DishesRepository;
import restaraunt.services.CommonDishesService;
import restaraunt.services.interfaces.DishesService;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        DishesRepository repository = new CommonDishesRepository();
        DishesService service = new CommonDishesService(repository);
        DishController dishController = new DishController(service);
        MainController mainController = new MainController(dishController);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Choose option:\n" +
                    "1. Dishes.\n" +
                    "2. Clients.\n" +
                    "0. Exit.");
            try {


                int objectNumber = Integer.parseInt(scanner.nextLine());

                switch (objectNumber) {
                    case 1:
                        System.out.println("Choose option:\n" +
                                "1. Save new dish.\n" +
                                "2. Show all dishes.");
                        int operaionNumber = Integer.parseInt(scanner.nextLine());

                        mainController.sendRequest(objectNumber + " " + operaionNumber)
                                .forEach(System.out::println);
                        break;
                    case 2:
                        // work with client
                        break;
                    case 0:
                        System.out.println("You have successfully exited the program");
                        return;

                    default:
                        System.err.println("Incorect input.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Incorect input");
            }
        }
    }
}