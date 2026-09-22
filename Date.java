public class Date {
    private int month;
    private int day;
    private int year;
    public Date(int month, int day, int year){ 
        this.month = month; 
        this.year = year;
        this.day = day; 
    }
    public static void displayNumeric(int month, int day, int year){
        System.out.print(month + "/" + day + "/" + Integer.toString(year));
    }
    public static void displayMonthFirst(int month, int day, int year){
       String stringMonth="";
        if(month == 1){
            stringMonth = "January";
        }
        else if (month == 2){
            stringMonth = "February";
        }
        else if (month == 3){
            stringMonth = "March";
        }
        else if (month == 4){
            stringMonth = "April";
        }
        else if (month == 5){
            stringMonth = "May";
        }
        else if (month == 6){
            stringMonth = "June";
        }
        else if (month == 7){
            stringMonth = "July";
        }
        else if (month == 8){
            stringMonth = "August";
        }
        else if (month == 9){
            stringMonth = "September";
        }
        else if (month == 10){
            stringMonth = "October";
        }
        else if (month == 11){
            stringMonth = "November";
        }
        else if (month == 12){
            stringMonth = "December";
        }
        System.out.print(stringMonth + " " + day + ", " + year);
    }
    public static void displayDayFirst(int month, int day, int year){
        String stringMonth="";
        if(month == 1){
            stringMonth = "January";
        }
        else if (month == 2){
            stringMonth = "February";
        }
        else if (month == 3){
            stringMonth = "March";
        }
        else if (month == 4){
            stringMonth = "April";
        }
        else if (month == 5){
            stringMonth = "May";
        }
        else if (month == 6){
            stringMonth = "June";
        }
        else if (month == 7){
            stringMonth = "July";
        }
        else if (month == 8){
            stringMonth = "August";
        }
        else if (month == 9){
            stringMonth = "September";
        }
        else if (month == 10){
            stringMonth = "October";
        }
        else if (month == 11){
            stringMonth = "November";
        }
        else if (month == 12){
            stringMonth = "December";
        }
        System.out.print(day + " " + stringMonth + " " + year);
    }
}
