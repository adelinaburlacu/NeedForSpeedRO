public class Main {

    public static void main(String[] args) {
        //NeedForSpeed car1 = new NeedForSpeed(2,3);
        int distantaTraseu = 900;
        RaceTrack track = new RaceTrack(distantaTraseu);
        //  RaceTrack track2Default = new RaceTrack(); // apelam constructorul default
//        car1.drive();
//        car1.drive();
//        System.out.println("Distanta: " + car1.distantaParcursa + " m");
//        System.out.println("Baterie: " + car1.baterie + " %");
//        System.out.println("Baterie descarcata? " + car1.batteryDrained());
        NeedForSpeed nitroCar = NeedForSpeed.nitro(); // facem o masinuta nitro
//        nitroCar.drive();
//        nitroCar.drive();
//        nitroCar.drive();
//        nitroCar.drive();
        while(nitroCar.baterie > 0) {
            nitroCar.drive();
            System.out.println("Distanta: " + nitroCar.distantaParcursa + " m");
            System.out.println("Baterie: " + nitroCar.baterie + " %");
            System.out.println("Baterie descarcata? " + nitroCar.batteryDrained());
            System.out.println("Poate sa termine masinuta cursa? " +track.carCanFinish(nitroCar));
            System.out.println("===========================");
        }
    }
}
