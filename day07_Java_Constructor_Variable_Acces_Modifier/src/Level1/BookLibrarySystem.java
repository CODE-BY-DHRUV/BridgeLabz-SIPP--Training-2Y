 class BookLibrarySystem {

        public String ISBN;
        protected String title;
        private String author;

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }
    }

    class EBook extends BookLibrarySystem {
        void displayDetails() {
            System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
        }
    }

     class MainLibrary {
        public static void main(String[] args) {
            EBook ebook = new EBook();
            ebook.ISBN = "12345";
            ebook.title = "Java Programming";
            ebook.setAuthor("John Doe");

            ebook.displayDetails();
        }
    }


