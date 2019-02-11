public class WaterBottle {
    private int volume;
    public WaterBottle(){
        this.volume = 100;
    }

    public String drink(){
        if (this.volume > 0) {
            this.volume -= 10;
            return "Slurp!";
        }
            else {
                return "The bottle is already empty!";
        }

    }
    public void fill() {
        this.volume = 100;
    }
    public void empty(){
        this.volume = 0;
    }
    public String getVolume(){
        if (this.volume == 0) {
            return "The bottle is empty!";
        } else {
            return "There are " + this.volume + " litres left.";
        }
    }
}
