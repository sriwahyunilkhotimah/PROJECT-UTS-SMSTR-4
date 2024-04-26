import java.util.Scanner;

public class restaurantApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Order order = new Order();

        boolean addMore = true;
        while (addMore) {
            // Displaying menu options for food or drinks
            System.out.println("Choose the type of order:");
            System.out.println("1. Food");
            System.out.println("2. Drink");
            System.out.print("Choose the type of order (1/2): ");
            int menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    // Displaying food menu
                    System.out.println("Food Menu:");
                    System.out.println("1. Fried Rice - Rp20,000");
                    System.out.println("2. Fried Noodle - Rp18,000");
                    System.out.println("3. Fried Chicken - Rp25,000");

                    // Asking user to choose food item
                    System.out.print("Choose food (1/2/3): ");
                    int foodChoice = scanner.nextInt();

                    // Displaying spice level options for food
                    String spiceLevel = null;
                    System.out.println("Choose the spice level for the food:");
                    System.out.println("1. Spicy");
                    System.out.println("2. Medium");
                    System.out.println("3. Not Spicy");
                    int spiceChoice = scanner.nextInt();
                    switch (spiceChoice) {
                        case 1:
                            spiceLevel = "Spicy";
                            break;
                        case 2:
                            spiceLevel = "Medium";
                            break;
                        case 3:
                            spiceLevel = "Not Spicy";
                            break;
                        default:
                            System.out.println("Invalid choice, spice level set to default.");
                            spiceLevel = "Medium";
                    }

                    // Creating food menu object based on user choice
                    switch (foodChoice) {
                        case 1:
                            order.addItem(new Food("Fried Rice", 20000, spiceLevel));
                            break;
                        case 2:
                            order.addItem(new Food("Fried Noodle", 18000, spiceLevel));
                            break;
                        case 3:
                            order.addItem(new Food("Fried Chicken", 25000, spiceLevel));
                            break;
                        default:
                            System.out.println("Invalid food choice!");
                    }
                    break;
                case 2:
                    // Displaying drink menu
                    System.out.println("Drink Menu:");
                    System.out.println("1. Iced Tea - Rp8,000 (Small), Rp12,000 (Medium), Rp18,000 (Large)");
                    System.out.println("2. Orange Juice - Rp10,000 (Small), Rp15,000 (Medium), Rp18,000 (Large)");
                    System.out.println("3. Coffee - Rp15,000 (Small), Rp25,000 (Medium), Rp30,000 (Large)");

                    // Asking user to choose drink item
                    System.out.print("Choose drink (1/2/3): ");
                    int drinkChoice = scanner.nextInt();

                    // Displaying size options for drink
                    String drinkSize = null;
                    double drinkPrice = 0.0;
                    System.out.println("Choose size for the drink:");
                    System.out.println("1. Small");
                    System.out.println("2. Medium");
                    System.out.println("3. Large");
                    int sizeChoice = scanner.nextInt();
                    switch (sizeChoice) {
                        case 1:
                            drinkSize = "Small";
                            switch (drinkChoice) {
                                case 1:
                                    drinkPrice = 8000;
                                    break;
                                case 2:
                                    drinkPrice = 10000;
                                    break;
                                case 3:
                                    drinkPrice = 15000;
                                    break;
                                default:
                                    System.out.println("Invalid drink choice!");
                                    break;
                            }
                            break;
                        case 2:
                            drinkSize = "Medium";
                            switch (drinkChoice) {
                                case 1:
                                    drinkPrice = 12000;
                                    break;
                                case 2:
                                    drinkPrice = 15000;
                                    break;
                                case 3:
                                    drinkPrice = 25000;
                                    break;
                                default:
                                    System.out.println("Invalid drink choice!");
                                    break;
                            }
                            break;
                        case 3:
                            drinkSize = "Large";
                            switch (drinkChoice) {
                                case 1:
                                    drinkPrice = 18000;
                                    break;
                                case 2:
                                    drinkPrice = 18000;
                                    break;
                                case 3:
                                    drinkPrice = 30000;
                                    break;
                                default:
                                    System.out.println("Invalid drink choice!");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid choice, size set to default (Medium).");
                            drinkSize = "Medium";
                            drinkPrice = 15000;
                            break;
                    }

                    String drinkTemperature = null;
                    System.out.println("Choose temperature for the drink:");
                    System.out.println("1. Cold (Ice)");
                    System.out.println("2. Hot");
                    int temperatureChoice = scanner.nextInt();
                    switch (temperatureChoice) {
                        case 1:
                            drinkTemperature = "Ice";
                            break;
                        case 2:
                            drinkTemperature = "Hot";
                            break;
                        default:
                            System.out.println("Invalid choice, temperature set to default (Ice).");
                            drinkTemperature = "Ice";
                    }

                    // Creating drink menu object based on user choice
                    switch (drinkChoice) {
                        case 1:
                            order.addItem(new Drink("Iced Tea", drinkPrice, drinkSize, drinkTemperature));
                            break;
                        case 2:
                            order.addItem(new Drink("Orange Juice", drinkPrice, drinkSize, drinkTemperature));
                            break;
                        case 3:
                            order.addItem(new Drink("Coffee", drinkPrice, drinkSize, drinkTemperature));
                            break;
                        default:
                            System.out.println("Invalid drink choice!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            // Asking user if they want to add more items to the order
            System.out.print("Do you want to add more items to the order? (yes/no): ");
            String addMoreChoice = scanner.next();
            if (addMoreChoice.equalsIgnoreCase("no")) {
                addMore = false;
                break; // Exiting the loop if user doesn't want to add more
            }
        }

        // Displaying the user's order
        order.displayOrder();

        scanner.close();
    }
}
