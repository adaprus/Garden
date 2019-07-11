public class GardenTest {
    public static void main(String[] args) {

        Plant plant1 = new Plant("Bratek", 500);
        Plant plant2 = new Plant("Tulipan", 650);
        Plant plant3 = new Plant("Róża", 820);

        Garden garden = new Garden(plant1, plant2, plant3);
        System.out.println(garden.gardenDescription());

        int waterMonthly = garden.calculateWaterAmountPerMonth(plant1.waterAmount, plant2.waterAmount, plant3.waterAmount);
        int waterPerYear = garden.calculateWaterAmountPerYear(plant1.waterAmount, plant2.waterAmount, plant3.waterAmount);

        System.out.println("Miesięcznie wszystkie rośliny potrzebują: " + waterMonthly + " ml wody.");
        System.out.println("Rocznie wszystkie rośliny potrzebują: " + waterPerYear + " ml wody.");


    }
}
