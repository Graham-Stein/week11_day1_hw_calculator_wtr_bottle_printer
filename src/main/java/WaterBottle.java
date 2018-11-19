public class WaterBottle {

    private int volume;
    private int capacity;

    public WaterBottle(){

        this.volume = 100;
        this.capacity = 100;
    }


    public int getVolume(){
        return this.volume;
    }

    public int drink() {
        this.volume -= 10;
        return this.volume;
    }

    public int empty() {
        this.volume = 0;
        return this.volume;
    }

    public int fill() {
        this.volume = 100;
        return this.volume;
    }
}




//    Create a water bottle class with a volume property.
//        The volume should start at 100.
//        Add a drink function that takes 10 from the volume each time it is called.
//        Create an empty function that brings the volume down to 0.
//        Create a fill function that fills the volume back to 100.