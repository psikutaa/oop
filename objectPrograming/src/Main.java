public class Main {
    public static void main(String[] args) {
/*
//        Car bmw = new Car(220, 1, "BMW", true);
//
//        bmw.startEngine();
//
//        bmw.accelerate(20);
//
//        bmw.accelerate(30);
//
//        bmw.slowDown(10);
//
//        bmw.stopEngine();
//
//        bmw.setGear(11);
//
//        bmw.setLights(true);
//        System.out.println(bmw.getLights());
//
//        Car Volvo = new Car(10, 1 , "v70", false);
//        Volvo.slowDown(5);
//
//        Car opel = new Car();
//        opel.startEngine();
//
//        Car fiat = new Car(10, 2, "panda");
*/

        Fiat panda = new Fiat(2010, "panda", true, 250000, "skóra");
        panda.startEngine();

        Vehicle pojazd = new Vehicle(1999, "gaaz", false, 180000);
        pojazd.startEngine();

        Citroen xsara = new Citroen(2015, "xsara", true, 50000, Drive.RWD);
        xsara.startEngine();
    }
}
