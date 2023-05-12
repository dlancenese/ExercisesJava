public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.5);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "FRIED EGG", "LETTUCE");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();
//
//        MealOrder meal = new MealOrder("turkey", "7-up", "Chili");
//        meal.addBurgerToppings("FRIED EGG", "FRIED EGG", "FRIED EGG");
//        meal.setDrinkSize("SMALL");
//        meal.printItemizedList();

        MealOrder deluxe = new MealOrder("deluxe", "coke","mashed potatoes");
        deluxe.addBurgerToppings("FRIED EGG", "BACON", "CHEESE","MAYO","PORK BBQ");
        deluxe.setDrinkSize("LARGE");
        deluxe.printItemizedList();
    }
}