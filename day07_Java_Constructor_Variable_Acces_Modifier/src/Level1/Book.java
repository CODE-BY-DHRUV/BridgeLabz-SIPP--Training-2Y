class Book {
        String title;
        String author;
        double price;


        Book() {
            title = "Unknown";
            author = "Unknown";
            price = 0.0;
        }

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void displayDetails() {
            System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
        }

        public static void main(String[] args) {
            Book defaultBook = new Book();
            Book customBook = new Book("Java Basics", "John Doe", 299.99);

            defaultBook.displayDetails();
            customBook.displayDetails();
        }
    }


