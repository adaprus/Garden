public class Plant {
    String name;
    int waterAmount; //ml

    Plant(String na, int waAm){
        name = na;
        waterAmount = waAm;
    }

    String plantInfo(){
        String plantInfo = ("Nazwa rośliny: " + name + ". " + "Miesięcznie potrzebuje: " + waterAmount + " ml wody.\n");

        return plantInfo;
    }
}
