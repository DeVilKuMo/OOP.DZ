package HomeWork.Task3;

public class Human {
    public String name;
    public int yearOfBirth;
    public String town;

    public String specialist;

    public Human(String name, int yearOfBirth, String town, String specialist) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;

        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (specialist == null) {
            this.specialist = "Информация не указана";
        } else {
            this.specialist = specialist;
        }
    }
}
