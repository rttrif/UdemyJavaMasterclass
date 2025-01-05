package OOPPart2.CompositionChallenge;

public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//
//        kitchen.getBrewMaster().brewCoffee();
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();

    }
}
