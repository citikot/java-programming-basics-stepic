package org.javaguru.mentor.lesson_3_oop_first_look.homework.solutions.level_5.task_1;

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}