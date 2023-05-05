public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//
//        kitchen.pourMilk();
//        kitchen.loadDishwasher();
//        kitchen.addWater();

        kitchen.setKitchenState(false,true,false);
        kitchen.doKitchenWork();
    }
}