package restaurant;

import java.sql.SQLOutput;

public class Restaurant {
    public static void main(String[] args) {
        String name = "The Launch Cafe";
        Menu ourMenu = new Menu();
        ourMenu.addMenuItem(4.59, "Tacos", "Appetizer", false);
        for(MenuItem item: ourMenu.getMenuItems()) {
            System.out.println(item.getDescription());
//            System.out.println(InsertHashMapHere());
        }
    }
}
