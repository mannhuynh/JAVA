
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        double tax;
        if (value < 5000){
            System.out.println("No tax!");
        } else if (value >= 5000 && value < 25000){
            tax = (100 + (value - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (value >= 25000 && value < 55000){
            tax = (1700 + (value - 25000) * 0.1);
            System.out.println("Tax: " + tax);
        } else if (value >= 55000 && value < 200000){
            tax = (4700 + (value - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (value >= 200000 && value < 1000000){
            tax = (22100 + (value - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else if (value >= 1000000){
            tax = (142100 + (value - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }
    }
}

/*
A gift is a transfer of property to another person against no compensation or payment. If the total value of the gifts you receive from the same donor in the course of 3 years is €5,000 or more, you must pay gift tax.

When a gift is given by a close relative or a family member, the amount of gift tax is determined by the following table (source vero.fi):

Value of gift           Tax at the lower limit	Tax rate(%) for exceeding part
5 000 — 25 000          100                         8
25 000 — 55 000         1 700                       10
55 000 — 200 000        4 700                       12
200 000 — 1 000 000     22 100                      15
1 000 000 —             142 100                     17
For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000)_0.08), and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) _ 0.12).

*/