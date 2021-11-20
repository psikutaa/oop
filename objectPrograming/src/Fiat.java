public class Fiat extends Vehicle {
    private String typeOfSeats;


    public Fiat(int dateOfProduction, String model, boolean airCon, int mileage, String typeOfSeats) {
        super(dateOfProduction,model, airCon, mileage);
        this.typeOfSeats = typeOfSeats;
    }

    @Override
    public void startEngine() {
        System.out.println("silnik fiata został uruchomiony");
    }

}
