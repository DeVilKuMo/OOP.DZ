package HomeWork.Task2;

public class Main {
    public static void main(String[] args) {
    int currentYear = 2022;


    Human maxim  = new  Human(" Максим ",35,"Минск"," Бренд-Менеджер");


    Human anya  = new  Human("Аня", 29,"Москва"," Медотист образовательных программ");


    Human katya  = new  Human("Катя", 28, "Калининград", " Продакт-менеджер");


    Human artem  = new  Human("Артем", 27,"Москва"," Директор по развитию бизнес");



    System.out.println(" Привет! Меня зовут "+maxim.name+" Я из города "+maxim.town+" Я родился в "+
            (currentYear-maxim.yearOfBirth)+" году. Я работаю на должности"+maxim.specialist+". Будем знакомы!");
    System.out.println(" Привет! Меня зовут "+anya.name+" Я из города "+anya.town+" Я родился в "+
            (currentYear-anya.yearOfBirth)+" году. Я работаю на должности"+anya.specialist+". Будем знакомы!");
    System.out.println(" Привет! Меня зовут "+katya.name+" Я из города "+katya.town+" Я родился в "+
            (currentYear-katya.yearOfBirth)+" году. Я работаю на должности"+katya.specialist+". Будем знакомы!");
    System.out.println(" Привет! Меня зовут "+artem.name+" Я из города "+artem.town+" Я родился в "+
            (currentYear-artem.yearOfBirth)+" году. Я работаю на должности"+artem.specialist+". Будем знакомы!");
}
}
