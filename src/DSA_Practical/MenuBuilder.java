package DSA_Practical;

import java.util.ArrayList;

public class MenuBuilder {
    public static void main(String[] args) {

   
        String menuTitle="My Dream Menu";
        System.out.println(menuTitle);
        ArrayList<String> menu=new ArrayList<>();
        String starter="Buffalo Sauce Wings";
        menu.add(starter);
        String mainCourse="Smash Burger";
        menu.add(mainCourse);
        String dessert="Chocolate Lava Cake";
        menu.add(dessert);
        System.out.println(menu);
    }

}
