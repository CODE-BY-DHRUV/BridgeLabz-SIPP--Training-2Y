package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void issue(Book b, Member m) {
        System.out.println("Issued: " + b + " to " + m.name);
    }
}

