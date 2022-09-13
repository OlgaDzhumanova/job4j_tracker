package ru.job4j.bank;

import java.util.Objects;
/**
 * Класс описывает модель банковского счета пользователя банковского сервиса
 * @author Olga Dzhumanova
 * @version 1.0
 */

public class Account {

    /**
     * Модель принимает два параметра : реквизиты и баланс
     */
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Геттер для модели банковского счета
     * @return requisite, возвращает реквизиты банковоского счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Сеттер для модели банковского счета
     * @param requisite, принимает значение и присваивает его полю requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Геттер для модели банковского счета
     * @return balance, возвращает баланс банковского счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Сеттер для модели банковского счета
     * @param balance, принимает значение и присваивает его полю balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
