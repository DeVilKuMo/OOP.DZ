package HomeWork.Task2;

public class MainCar { public static void main(String[] args) {
    Car granta = new Car("Lada", "Grande", 1.7, "Желтый",2015,"Россия");
//        granta.brand = "lada";
//        granta.model = " Grande ";
//        granta.yearOfProduction = 2015;
//        granta.bodyColor = "желтого  ";
//        granta.countryOfAssembly = "Россия";
//        granta.engineCapacity = 1.7;
    System.out.println(" Марка автомобиля "+granta.brand
            + " модель "+granta.model
            +" год выпуска "+granta.yearOfProduction
            +" Страна производства "+ granta.countryOfAssembly
            +" цвет "+granta.bodyColor
            +" Обьем двигателя "+granta.engineCapacity);

    Car audi  = new Car("Audi", "A8 50 L TDI quattro ", 3.0,"Черный",2020,"Германия");
//        audi .brand = "Audi";
//        audi .model = " A8 50 L TDI quattro ";
//        audi .yearOfProduction = 2020 ;
//        audi .bodyColor = "черный  ";
//        audi .countryOfAssembly = "Германия";
//        audi .engineCapacity = 3.0;
    System.out.println(" Марка автомобиля "+audi .brand
            + " модель "+audi .model
            +" год выпуска "+audi .yearOfProduction
            +" Страна производства "+ audi .countryOfAssembly
            +" цвет "+audi .bodyColor
            +" Обьем двигателя "+audi .engineCapacity);

    Car bmv  = new Car("BMV", "Z8", 3.0, "Черный",2021,"Германия");
//        bmv .brand = "Bmv";
//        bmv .model = " Z8 ";
//        bmv .yearOfProduction = 2021 ;
//        bmv .bodyColor = "черный  ";
//        bmv .countryOfAssembly = "Германия";
//        bmv .engineCapacity = 3.0;
    System.out.println(" Марка автомобиля "+bmv .brand
            + " модель "+bmv .model
            +" год выпуска "+bmv .yearOfProduction
            +" Страна производства "+ bmv .countryOfAssembly
            +" цвет "+bmv .bodyColor
            +" Обьем двигателя "+bmv .engineCapacity);

    Car kia  = new Car("Kia", "Sportage 4", 2.4, "Красный",2018,"Южная Корея");
//        kia .brand = "Kia";
//        kia .model = " Sportage 4 ";
//        kia .yearOfProduction = 2018 ;
//        kia .bodyColor = "красный  ";
//        kia .countryOfAssembly = " Южной Корее";
//        kia .engineCapacity = 2.4;
    System.out.println(" Марка автомобиля "+kia .brand
            + " модель "+kia .model
            +" год выпуска "+kia .yearOfProduction
            +" Страна производства "+ kia .countryOfAssembly
            +" цвет "+kia .bodyColor
            +" Обьем двигателя "+kia .engineCapacity);

    Car hundai  = new Car("Hundai","Avante",1.6,"Оранжевый", 2016,"Южная корея ");
//        hundai .brand = "Hundai";
//        hundai .model = " Avante ";
//        hundai .yearOfProduction = 2016 ;
//        hundai .bodyColor = "оранжевый  ";
//        hundai .countryOfAssembly = " Южной Корее";
//        hundai .engineCapacity = 1.6;
    System.out.println(" Марка автомобиля "+hundai .brand
            + " модель "+hundai .model
            +" год выпуска "+hundai .yearOfProduction
            +" Страна производства "+ hundai .countryOfAssembly
            +" цвет "+hundai .bodyColor
            +" Обьем двигателя "+hundai .engineCapacity);

}
}
