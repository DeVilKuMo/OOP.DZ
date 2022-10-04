package HomeWork.Task1;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;


        Human maxim  = new  Human();
       maxim.name = "Максим";
       maxim.yearOfBirth = 35;
       maxim.town = "Минск";
       maxim.specialist = " бренд-менеджером";

        Human anya  = new  Human();
        anya.name = "Аня";
        anya.yearOfBirth = 29;
        anya.town = "Москва";
        anya.specialist = " методистом образовательных программ";

        Human katya  = new  Human();
        katya.name = "Катя";
        katya.yearOfBirth = 28;
        katya.town = "Калининград";
        katya.specialist = " продакт-менеджером";

        Human artem  = new  Human();
        artem.name = "Артем";
        artem.yearOfBirth = 27;
        artem.town = "Москва";
        artem.specialist = " директором по развитию бизнеса";


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

