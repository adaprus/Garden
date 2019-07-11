public class Garden {
    Plant plant1;
    Plant plant2;
    Plant plant3;

    Garden (Plant pl1, Plant pl2, Plant pl3){
        plant1 = pl1;
        plant2 = pl2;
        plant3 = pl3;
    }

    String gardenDescription (){
        String gardenDes = plant1.plantInfo() + plant2.plantInfo() + plant3.plantInfo();

        return gardenDes;
    }

    int calculateWaterAmountPerMonth (int amount1, int amount2, int amount3){
        int waterMonthly = (amount1 + amount2 + amount3) * 30;

        return waterMonthly;
    }

    int calculateWaterAmountPerYear (int amount1, int amount2, int amount3){
        int waterPerYear = (amount1 + amount2 + amount3) * 365;

        return waterPerYear;
    }
}
