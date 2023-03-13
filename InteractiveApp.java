import java.util.Scanner;

public class InteractiveApp {
    public static void main(String[] args) {

        System.out.println("Welcome, Thank you for taking this survey!!");
        Scanner sc = new Scanner(System.in);
        int counter=0;

        System.out.println("What is your name?");
        String name=sc.nextLine();
        counter++;

        System.out.println("What is your daily Auto fare?");
        Float fare=sc.nextFloat();
        counter++;

        System.out.println("How many days you travel by auto?");
        Integer days=sc.nextInt();
        counter++;

        System.out.println("How much the lunch cost?");
        Float cost=sc.nextFloat();
        counter++;

        System.out.println("How many days you eat?");
        Integer dayseat=sc.nextInt();
        counter++;

        sc.close();

        System.out.println("Thank you "+ name+ " For answering " + counter+ " questions");
        System.out.println("Your Total monthly auto Fare is " + days*fare);
        System.out.println("Your Total monthly Food Cost is " + cost*dayseat);

    }
}