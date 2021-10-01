package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
          Book horror = new Book("It", 500);
          Book novel = new Book("Twilight", 400);
          Book fantasy = new Book("Star wars", 350);
          Book instruct = new Book("Clean code", 10);
          Book[] books = new Book[4];

          books[0] = horror;
          books[1] = novel;
          books[2] = fantasy;
          books[3] = instruct;
          for (int index = 0; index < books.length; index++){
              Book bk = books[index];
              System.out.println(bk.getBook() + " - " + bk.getCount());
          }

          System.out.println("Changing the data with the index 0 and 3 places");
          Book clear = new Book();
          clear = books[0];
          books[0] = books[3];
          books[3] = clear;
          for (int i = 0; i < books.length ; i++) {
              Book bk = books[i];
              System.out.println(bk.getBook() + " - " + bk.getCount());
        }

        System.out.println("Search for a book with the title Clean code");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getBook())){
                System.out.println(bk.getBook() + " - " + bk.getCount());
            }
        }
    }
}
