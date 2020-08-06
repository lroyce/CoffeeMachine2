// package machine;
import java.util.Scanner;

public class CoffeeMachine {
    
    //Coffee machine starts out with set values
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cupsOfCoffee = 9;
    static int money = 550;
        
    public static String coffeeBuy(String choice) {
        String response = "none";

        switch (choice) {
            case "1":
                if (getWater() >= 250 && getBeans() >= 16) {
                    setWater(-250);
                    setBeans(-16);
                    setMoney(4);
                    setCups(-1);
                    response = "I have enough resources, making you a coffee!";
                } else if (getWater() < 250) {
                    response = "Sorry, not enough water!";
                } else if (getBeans() < 16) {
                    response = "Sorry, not enough coffee beans!";
                }
                break;
            case "2":
                if (getWater() >= 350 && getMilk() >= 75 && getBeans() >= 20) {
                    setWater(-350);
                    setMilk(-75);
                    setBeans(-75);
                    setMoney(7);
                    setCups(-1);
                    response = "I have enough resources, making you a coffee!";
                } else if (getWater() < 350) {
                    response = "Sorry, not enough water!";
                } else if (getMilk() < 75) {
                    response = "Sorry, not enough milk!";
                } else if (getBeans() < 20) {
                    response = "Sorry, not enough beans!";
                }
                break;
            case "3":
                if (getWater() >= 200 && getMilk() >= 100 && getBeans() >= 12) {
                    setWater(-200);
                    setMilk(-100);
                    setBeans(-12);
                    setMoney(6);
                    setCups(-1);
                    response = "I have enough resources, making you a coffee!";
                } else if (getWater() < 200) {
                    response = "Sorry, not enough water!";
                } else if (getMilk() < 100) {
                    response = "Sorry, not enough milk!";
                } else if (getBeans() < 12) {
                    response = "Sorry, not enough beans!";
                }
                break;
            default:
                response = "Incorrect input, please choose again.";
        }
        return response;
    }
        
    public static int coffeeTake() {
        int temp = money;
        money = 0;
        return temp;
    }
    
    static void setWater(int argWater) {
        water += argWater;
    }

    static int getWater() {
        return water;
    }
    
    
    static void setMilk(int argMilk) {
        milk += argMilk;
    }

    static int getMilk() {
        return milk;
    }
    
    
    static void setBeans(int argBeans) {
        beans += argBeans;
    }

    static int getBeans() {
        return beans;
    }
    
    
    static void setCups(int argCups) {
        cupsOfCoffee += argCups;
    }

    static int getCups() {
        return cupsOfCoffee;
    }
    
    
    static void setMoney(int argMoney) {
        money += argMoney;
    }

    static int getMoney() {
        return money;
    }
    
    public static void coffeeDescribe() {
        System.out.println("The coffee machine has: ");
        System.out.println(CoffeeMachine.getWater() + " of water");
        System.out.println(CoffeeMachine.getMilk() + " of milk");
        System.out.println(CoffeeMachine.getBeans() + " of coffee beans");
        System.out.println(CoffeeMachine.getCups() + " of disposable cups");
        System.out.println(CoffeeMachine.getMoney() + " of money");
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String action = "none";
        
        String response = "none";
        
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
                    if (choice == "back") {
                        break;
                    } else {
                        response = CoffeeMachine.coffeeBuy(choice);
                        System.out.println(response);
                    }
                    continue;
                case "take":
                    System.out.println("I gave you $" + CoffeeMachine.coffeeTake());
                    continue;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    CoffeeMachine.setWater(scanner.nextInt());
                    System.out.println("Write how many ml of milk do you want to add: ");
                    CoffeeMachine.setMilk(scanner.nextInt());
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    CoffeeMachine.setBeans(scanner.nextInt());
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    CoffeeMachine.setCups(scanner.nextInt());
                    continue;
                case "remaining":
                    coffeeDescribe();
                    continue;
                default:
                    System.out.println("Incorrect input.");
                    continue;
            }
        }
    }
}
