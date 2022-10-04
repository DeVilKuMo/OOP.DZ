package HomeWork.Task3;

public class Car {
    public String brand;
    public String model;
    public double engineCapacity;
    public String bodyColor;
    public int yearOfProduction;
    public String countryOfAssembly;

    public Car(String brand, String model, double engineCapacity, String bodyColor, int yearOfProduction, String countryOfAssembly) {
        if (brand==null){
            this.brand = "default";
        }else {
            this.brand = brand;
        }
        if (model==null){
            this.model = "default";
        }else {
            this.model = model;

        } if (bodyColor==null){
            this.bodyColor = "default";
        }else {
            this.bodyColor = bodyColor;
        }
        if (Double.compare(engineCapacity,0)==0){
            this.engineCapacity = 1.5;
        }else {
            this.engineCapacity = engineCapacity;

        } if (bodyColor==null){
        this.bodyColor = "Белый";
         }else {
        this.bodyColor = bodyColor;
    }
        if (yearOfProduction==0){
            this.yearOfProduction = 2000;
        }else {
            this.yearOfProduction = yearOfProduction;

        }
        this.countryOfAssembly = countryOfAssembly;
    }
}
