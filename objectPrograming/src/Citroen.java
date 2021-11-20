public class Citroen extends Vehicle {


    private Drive drive;

    public Citroen(int dateOfProduction, String model, boolean airCon, int mileage, Drive drive) {
        super(dateOfProduction, model, airCon, mileage);
        this.drive = drive;
    }

}
