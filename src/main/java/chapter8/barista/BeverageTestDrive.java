package chapter8;

public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nmaking tea...");
        teaHook.prepareRecipe();
        System.out.println("\nmaking coffee...");
        coffeeHook.prepareRecipe();

    }
}
