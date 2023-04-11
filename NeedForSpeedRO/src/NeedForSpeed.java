public class NeedForSpeed {

    protected int baterie = 100;
    protected int batteryDrain;
    protected int speed;
    protected int distantaParcursa;


    public static NeedForSpeed nitro() {
        return new NeedForSpeed(4, 50);
    }

    public NeedForSpeed(int batteryDrain, int speed) {
        this.batteryDrain = batteryDrain;
        this.speed = speed;
    }

    public int distanceDriven() {
        return distantaParcursa;
    }

    public void drive() {
        if (baterie > 0) {
            distantaParcursa += speed;
            baterie -= batteryDrain;
        }
        return; // daca baterie = 0 iesi din metoda drive()
    }


    // 1; -2; => -1
    public boolean batteryDrained() {
        if (baterie <= 0) {
            return true;
        }
        return false;
        //return baterie <= 0;
    }

}