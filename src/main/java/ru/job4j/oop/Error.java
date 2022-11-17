package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error vkontakte = new Error(true, 56, "Привет");
        vkontakte.printInfo();
        Error odnoklassniki = new Error(true, 6, "В сети");
        odnoklassniki.printInfo();
        Error facebook = new Error(true, 1, "Дома");
        facebook.printInfo();
    }
}
