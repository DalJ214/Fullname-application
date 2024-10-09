package com.pluralsight;

public class Book {


        private String isbn;
        private String title;
        private String checkedOutTo;
        private int id;
        private boolean isCheckedOut;

        public Book(){
            this.isbn = "";
            this.title = "";
            this.checkedOutTo = "";
            this.id = 0;
            this.isCheckedOut = true;


        }

        public String checkOut(String checkedOutTo){
            if(isCheckedOut){
                return "The book " + title + "the book has been checked out" + checkedOutTo;
            }
            isCheckedOut = true;
            checkedOutTo = false;
            return title + "has been checked out";
        }
        public String checkIn(){
            if(!isCheckedOut){
                return "The book " +title+" is already checked in";
            }
        }


}
