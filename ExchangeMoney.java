import java.util.Scanner;
public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        double USD = 3.5260;
        double EUR = 3.6850;
        Menu();
        try {
            int input = money.nextInt();
            while (input != 0) {
                if (input > 4 || input < 0)
                    throw new Exception();
                System.out.println("Please  enter a amount to change : ");
                double amount = money.nextDouble();
                if (input == 1) System.out.println(amount + "₪" + " in $ worth: " + amount / USD + "$");
                if (input == 2) System.out.println(amount + "$" + " in ₪ worth: " + amount * USD + "₪");
                if (input == 3) System.out.println(amount + "€" + " in ₪ worth: " + amount * EUR + "₪");
                if (input == 4) System.out.println(amount + "₪" + " in € worth: " + amount / EUR + "€");
                Menu();
                input = money.nextInt();
            }
            System.out.println("Thank you \nSee you soon :)");
        }
        catch (Exception e){
            System.out.println("Error wrong key");}
        }
    public static void Menu () {
        System.out.println("Welcome to Currency Exchange ");
        System.out.println("Press  [1] to convert a shekels to dollars ");
        System.out.println("Press  [2] to convert a dollars to shekels ");
        System.out.println("Press  [3] to convert a euro to shekels ");
        System.out.println("Press  [4] to convert a shekels to euros ");
        System.out.println("Press [0] to exit ");}
    }
