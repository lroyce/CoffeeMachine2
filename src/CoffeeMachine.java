import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cupsOfCoffee = 9;
        int money = 550;

        String action = "none";

        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            action = scanner.next();
            if ("exit".equals(action)) {
                break;
            }
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String choice = scanner.next();
                    switch (choice) {
                        case "1":
                            if (water >= 250 && beans >= 16) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                beans -= 16;
                                money += 4;
                                cupsOfCoffee -= 1;
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            break;
                        case "2":
                            if (water >= 350 && milk >= 75 && beans >= 20) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                money += 7;
                                cupsOfCoffee -= 1;
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beans < 20) {
                                System.out.println("Sorry, not enough beans!");
                            }
                            break;
                        case "3":
                            if (water >= 200 && milk >= 100 && beans >= 12) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                money += 6;
                                cupsOfCoffee -= 1;
                            } else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beans < 12) {
                                System.out.println("Sorry, not enough beans!");
                            }
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Incorrect input, please choose again.");
                            break;
                    }
                    continue;
                case "take":
//                    getMoney(water, milk, beans, cupsOfCoffee, money);
                    System.out.println("I gave you $" + money);
                    money = 0;
                    continue;
                case "fill":
//                    fillCoffee(water, milk, beans, cupsOfCoffee, money);
                    System.out.println("Write how many ml of water do you want to add: ");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    cupsOfCoffee += scanner.nextInt();
                    continue;
                case "remaining":
                    coffeeDescribe(water, milk, beans, cupsOfCoffee, money);
                    continue;
                default:
                    System.out.println("Incorrect input.");
                    continue;
            }
        }

    }

//    public static void buyCoffee(int water, int milk, int beans, int cupsOfCoffee, int money) {
//
//        int morWater = water, morMilk = milk, morBeans = beans, morCups = cupsOfCoffee, morMoney = money;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
//        // if(morWater > ) {
//        // }
//        int choice = scanner.nextInt();
//        switch (choice) {
//            case 1:
//                if (morWater >= 250 && morBeans >= 16) {
//                    System.out.println("I have enough resources, making you a coffee!");
//                    morWater -= 250;
//                    morBeans -= 16;
//                    morMoney += 4;
//                } else {
//                    System.out.println("Sorry, not enough water!");
//                }
//                break;
//            case 2:
//                morWater -= 350;
//                morMilk -= 75;
//                morBeans -= 20;
//                morMoney += 7;
//                break;
//            case 3:
//                morWater -= 200;
//                morMilk -= 100;
//                morBeans -= 12;
//                morMoney += 6;
//            default:
//                System.out.println("Incorrect input, please choose again.");
//        }
//        morCups -= 1;
//        coffeeDescribe(morWater, morMilk, morBeans, morCups, morMoney);
//
//    }
//
//    public static void getMoney(int water, int milk, int beans, int cupsOfCoffee, int money) {
//        int moola = money;
//        System.out.println("I gave you $" + moola);
//        moola = 0;
//        coffeeDescribe(water, milk, beans, cupsOfCoffee, moola);
//    }
//
//    public static void fillCoffee(int water, int milk, int beans, int cupsOfCoffee, int money) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Write how many ml of water do you want to add: ");
//        int moreWater = water + scanner.nextInt();
//        System.out.println("Write how many ml of milk do you want to add: ");
//        int moreMilk = milk + scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans do you want to add: ");
//        int moreCoffee = beans + scanner.nextInt();
//        System.out.println("Write how many disposable cups of coffee do you want to add: ");
//        int cups = cupsOfCoffee + scanner.nextInt();
//
//        coffeeDescribe(moreWater, moreMilk, moreCoffee, cups, money);
//    }

    public static void coffeeDescribe(int water, int milk, int beans, int cupsOfCoffee, int money) {
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cupsOfCoffee + " of disposable cups");
        System.out.println(money + " of money");
    }

}
