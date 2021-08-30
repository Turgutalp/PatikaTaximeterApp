import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Distance: ");



        double distance = sc.nextDouble();

        double startCost = 10.0;
        double minCost = 20.0;

        if(distance > 0 ){

            double cost =+ (distance*2.20) + startCost ;

            if(cost < 20) {
                cost = minCost;
            }

            System.out.println( distance + " Kilometres Traveled Total Amount to be Paid : " + cost + " TL" );
        }else{
            System.out.println("Please Enter a Number Greater Than Zero ");
        }
        sc.close();






    }
}
