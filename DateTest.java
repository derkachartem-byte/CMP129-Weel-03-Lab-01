import java.util.Scanner;
public class DateTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int month = 0, day = 0, year = 0;
        do {
            System.out.println("Enter the Month in number form: ");
            month = input.nextInt();
            System.out.println("Enter the day: ");
            day = input.nextInt();
            System.out.println("Enter the year: ");
            year = input.nextInt();
            if (month <= 12 & month >= 1 & day >= 1 & day <= 31){
                System.out.print("```");
                displayNumeric(month,day,year);
                displayMonthFirst(month,day,year);
                displayDayFirst(month,day,year);
                System.out.print("```")
            }
            }while(month <= 12 & month >= 1 & day >= 1 & day <= 31);
    }
}
