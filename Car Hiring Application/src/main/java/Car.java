public class Car {
    private String carId;
    private String brand;
    private  String model;
    private double basePricePerDay;
    private boolean isAvailable;


    public Car(String carId, String brand, String model, double basePricePerDay){
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }
    //getters and setters created so that user can use this data because all the variables are encapsulated / private.
    public String getCarId(){
        return carId;
    }
    public void setCarId(String carId){
        this.carId = carId;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    //Here calculatePrice is calculating price per days
    public  double calculatePrice(int rentalDays){
        return  basePricePerDay * rentalDays;
    }
    public boolean isAvailable(){
       return  isAvailable;
    }
    public void rent(){
        isAvailable = false;
    }
    public void  returnCar(){
        isAvailable = true;
    }
}
