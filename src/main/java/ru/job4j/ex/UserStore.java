package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername() != login){
                throw new UserNotFoundException("Пользователь не найден");
            }else {
                return users[i];
            }
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() == false || user.toString().length() < 3) {
            throw new UserInvalidException("Пользователь не валидный");
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", false)
        };
       // User user = findUser(users, "Petr Arsentev");
        //if (validate(user)) {
          //  System.out.println("This user has an access");
            try {
                if(validate(findUser(users, "Petr Arsentev")));
            }catch (UserInvalidException ea) {
                ea.printStackTrace();
            }catch (UserNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
