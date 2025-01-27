import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Months> monthList = new ArrayList<>();

        monthList.add(new Months("January"));
        monthList.add(new Months("February"));
        monthList.add(new Months("March"));
        monthList.add(new Months("April"));
        monthList.add(new Months("May"));
        monthList.add(new Months("June"));
        monthList.add(new Months("July"));
        monthList.add(new Months("September"));
        monthList.add(new Months("October"));
        monthList.add(new Months("November"));
        monthList.add(new Months("December"));

        System.out.println("\nPrint the array without August: \n");

        for ( int i = 0; i < monthList.size(); i++ ){
            System.out.println(monthList.get(i).getName());
        }


        monthList.add(7, new Months("August"));

        System.out.println("\nPrint the array with August in the correct position:\n");

        for ( int i = 0; i < monthList.size(); i++ ){
            System.out.println(monthList.get(i).getName());
        }

        monthList.add(new Months("December"));
        monthList.add(new Months("December"));

        System.out.println("\nPrint the months with dobles in the array.\n");
        for ( int i = 0; i < monthList.size(); i++ ){
            System.out.println(monthList.get(i).getName());
        }

        HashSet<String> monthsOfTheYear = new HashSet<>();

        for ( int i = 0; i < monthList.size(); i++ ){
            monthsOfTheYear.add(monthList.get(i).getName());
        }

        System.out.println("\nPrint the HashSet without the duplicate months: " + monthsOfTheYear + "\n");
    }
}