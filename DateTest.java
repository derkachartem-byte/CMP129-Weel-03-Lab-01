import java.util.Scanner;
public class DateTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int month = 0, day = 0, year = 0;
        do {
            System.out.println("Enter the Month in number form(1-12): ");
            month = input.nextInt();
            System.out.println("Enter the day(1-31): ");
            day = input.nextInt();
            System.out.println("Enter the year: ");
            year = input.nextInt();
            Date d1 = new Date(month, day, year);
            if (month <= 12 && month >= 1 && day >= 1 && day <= 31){
                System.out.print("```\n");
                d1.displayNumeric(month,day,year);
                d1.displayMonthFirst(month,day,year);
                d1.displayDayFirst(month,day,year);
                System.out.print("```");
            }
            else {
                System.out.println("Month and/or day are not the acceptable values of 1-12 and 1-31.\nREDOO!!!");
            }
            }while(month > 12 || month < 1 || day < 1 || day > 31);
    }
}
