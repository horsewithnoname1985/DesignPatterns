package chapter9;

import chapter9.allmenus.Waitress;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        ArrayList<Menu> menus =new ArrayList<Menu>();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());
        menus.add(new CafeMenu());

//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        DinerMenu dinerMenu = new DinerMenu();
//        CafeMenu cafeMenu = new CafeMenu();

//        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
