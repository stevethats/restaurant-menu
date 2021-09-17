package restaurant;

import sun.net.ext.ExtendedSocketOptions;
import sun.util.spi.CalendarProvider;

import java.util.ArrayList;
import java.util.Date;
import java.util.*;

public class MenuItem {

    private String category;
    private String name;
    private String description;
    private double price;
    private boolean isNew;

    public MenuItem(String category, String name, String description, double price, boolean isNew) {

        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isNew = isNew;
    }

    //Get category
    public String getCategory() {
        return this.category;
    }

    //Get name
    public String getName() {
        return this.name;
    }

    //Get description
    public String getDescription() {
        return this.description;
    }

    //Get price
    public double getPrice() { return this.price; }

    //Get if is new
    public boolean getIsNew() { return this.isNew; }

    //Set category
    public String setCategory(String newCategory) {
        return this.category = newCategory;
    }

    //Set name
    public String setName(String newName) {
        return this.name = newName;
    }

    //Set description
    public String setDescription(String newDescription) {
        return this.description = newDescription;
    }

    //Set price
    public double setPrice(double newPrice) {
        return this.price = newPrice;
    }

    //Set if is new
    public boolean setIsNew(boolean changeIsNew) {
        return this.isNew = changeIsNew;
    }

}
