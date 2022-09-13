package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банковского сервиса
 * @author Olga Dzhumanova
 * @version 1.0
 */
public class User {

    /**
     * Модель принимает два параметра : паспорт и имя пользователя
     */
    private String passport;
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Геттер для модели пользователя банковского сервиса
     * @return passport, возвращает данные паспорта пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Сеттер для модели пользователя банковоского сервиса
     * @param passport, принимает значение и присваивает его полю passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Геттер для модели пользователя банковского сервиса
     * @return username, возвращает имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Сеттер для модели пользователя банковоского сервиса
     * @param username, принимает значение и присваивает его полю username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
