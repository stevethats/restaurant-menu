package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Restaurant {
    public static void main(String[] args) {

        ArrayList<MenuItem> showMenu = new ArrayList<>();

        MenuItem ribs = new MenuItem("main course","Ribs","Half rack of BBQ ribs",6.00,false);
        MenuItem steak = new MenuItem("main course","Steak","Big, juicy, and hot",8.00,false);
        MenuItem chickenNuggets = new MenuItem("appetizer","Chicken Nuggets","10 pieces of white meat fried in a crispy breading",5.00,false);
        MenuItem quesadilla = new MenuItem("appetizer","Quesadilla","Three regular cheese quesadilla",4.00,false);
        MenuItem cake = new MenuItem("dessert","Cake","Your choice of a chocolate, vanilla, or marble slice of cake",5.00,false);
        MenuItem cookie = new MenuItem("dessert","Cookie","Your choice of 3 chocolate chip or 3 snickerdoodles",1.00,true);

        showMenu.add(ribs);
        showMenu.add(steak);
        showMenu.add(chickenNuggets);
        showMenu.add(quesadilla);
        showMenu.add(cake);
        showMenu.add(cookie);

        Date newDate = Calendar.getInstance().getTime();

        Menu fullMenu = new Menu(showMenu, newDate);

        fullMenu.printMenu();
    }
}
