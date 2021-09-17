package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdate;

    private ArrayList<MenuItem> testMenu;

    public Menu(ArrayList<MenuItem> testMenu, Date lastUpdate) {
        this.testMenu = testMenu;
        this.lastUpdate = lastUpdate;
    }

    public Menu(ArrayList<MenuItem> testMenu) {
        this.testMenu = testMenu;
    }

    //Get Date
    public Date getLastUpdate() {
        return lastUpdate;
    }

    //Get menu
    public ArrayList<MenuItem> getTestMenu() {
        return testMenu;
    }

    //Set Date
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    //Set menu
    public void setTestMenu(ArrayList<MenuItem> testMenu) {
        this.testMenu = testMenu;
    }

    public void printMenu() {

        System.out.println("Last Updated: " + this.lastUpdate);

        for (int i = 0; i < this.testMenu.size(); i++) {
            MenuItem food = this.testMenu.get(i);
            if (food.getIsNew()) {
                System.out.println("\n**NEW**");
            } else {
                System.out.println("\n*****");
            }
            System.out.println(food.getName());
            System.out.println(food.getDescription());
            System.out.println("$" + food.getPrice() + "0");
            System.out.println("*****");
        }
    }

    public void printMenuItem(MenuItem food) {
        if (food.getIsNew()) {
            System.out.println("\n**NEW**");
        } else {
            System.out.println("\n*****");
        }
        System.out.println(food.getName());
        System.out.println(food.getDescription());
        System.out.println(food.getPrice());
        System.out.println("*****");
    }

    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.testMenu.add(item);
        return this.testMenu;
    }

    public ArrayList<MenuItem> removeItem(MenuItem removeItem) {
        int indexOfRemoved = -1;

        for (int i = 0; i < this.testMenu.size(); i++) {
            if (testMenu.get(i).equals(removeItem)) {
                indexOfRemoved = i;
            }
        }

        this.testMenu.remove(indexOfRemoved);
        return testMenu;
    }
}
