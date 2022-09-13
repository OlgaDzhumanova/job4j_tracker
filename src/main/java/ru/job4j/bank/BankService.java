package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса
 * @author Olga Dzhumanova
 * @version 1.0
 */
public class BankService {

    /**
     * Хранение задания осуществляется в коллекции типа HashMap, которая содержит
     * всех пользователей типа User с прикреплеными к ним счетами ввиде коллекции ArrayList
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя
     * @param user, принимает значение модели нового пользователя и добавляет ее в коллекцию users
     * При этом в значении объявляется пустая коллекция типа ArrayList
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет
     * @param passport, принимает значение паспорта для поиска пользователя
     * с помощью метода findByPassport находит пользователя
     * @param account, если пользователь найден, а переданный account не найден
     * в коллекции userAccount, добавляет account в коллекцию
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccount = users.get(user);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по паспорту
     * @param passport, принимает значение и сравнивает
     * по ключевому значению в коллекции users
     * @return findUser, возвращает пользователя если он найден по паспорту
     */
    public User findByPassport(String passport) {
        User findUser = null;
         for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                findUser = user;
                break;
            }
        }
        return findUser;
    }

    /**
     * Метод ищет модель банковского счета
     * @param passport, принимает значение паспорта
     * через метод findByPassport по параметру passport, находит пользователя
     * @param requisite, если пользователь найден, по заданому значению ищет счет
     * @return account, если счет найден возвращает его
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account account = null;
        if (user != null) {
            for (Account result : users.get(user)) {
                if (requisite.equals(result.getRequisite())) {
                    account = result;
                    break;
                }
            }
        }
        return account;
    }

    /**
     * Метод совершает перевод со счета одного пользователя на счет другого пользователя
     * @param srcPassport, принимает значение паспорта пользователя, который совершает перевод
     * @param srcRequisite, принимает значение счета пользователя, с которого совершается переводл
     * @param destPassport, принимает значение паспорту пользователя, кому совершается перевод
     * @param destRequisite, принимает значение счета пользователя, кому совершается перевод
     * @param amount, принимает значение суммы перевода
     * если счет отправителя и получателя найдены, и счет отправителя больше amount,
     * осуществляется перевод и метод возвращает true
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
