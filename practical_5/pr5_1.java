// Main class must match the file name
public class pr5_1 {

    // Inner class Date (not public)
    static class Date {
        // Instance variables
        int day, month, year;

        //  set_date 
        void set_date(int d, int m, int y) {
            day = d;
            month = m;
            year = y;
        }

        //  set_date
        void set_date() {
            day = 1;
            month = 1;
            year = 2000;
        }

        //  display the date
        void get_date() {
            System.out.println("Date is: " + day + "/" + month + "/" + year);
        }
    }

   
    public static void main(String[] args) {
        // Object 1: set custom date
        Date date1 = new Date();
        date1.set_date(17, 9, 2025); // set custom date
        date1.get_date();            // show date

        // Object 2: set default date
        Date date2 = new Date();
        date2.set_date();            // set default date
        date2.get_date();            // show date
    }
}

