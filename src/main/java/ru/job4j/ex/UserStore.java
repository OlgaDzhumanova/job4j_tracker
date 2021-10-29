package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не валидный");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
            try {
                User user = findUser(users, "Petr");
                if (validate(user)) {
                    System.out.println("Пользователь найден");
                }
            } catch (UserInvalidException ea) {
                ea.printStackTrace();
            } catch (UserNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
