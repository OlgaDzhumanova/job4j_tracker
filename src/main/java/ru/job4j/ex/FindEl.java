package ru.job4j.ex;

public class FindEl{
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        if (key == null) {
            throw new ElementNotFoundException("key could not be null");
        }
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] result = new String[]{"One", null, "two", "tree", null};
        try {
            indexOf(result, null);
        }catch (ElementNotFoundException e){
            e.printStackTrace();
        }
    }
}
