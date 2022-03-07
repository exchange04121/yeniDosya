import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       /*final double radius=5.5;
       double perimeter,area;

       perimeter=2*radius*Math.PI;
       area=radius*radius*Math.PI;

        System.out.println("cevre: "+perimeter+"\n"+"alan: "+area);*/


        System.out.println("tek ir sayi gir:");

        Scanner input=new Scanner(System.in);

        int number=input.nextInt();

        int middleNumber=number/2;

        for (int x=1;x<=Math.ceil(middleNumber);x++)
        {
            for (int y=1;y<=middleNumber-x;y++)
            {
                System.out.print(" ");
            }

            for (int z=1;z<=2*x-1;z++)
            {
                System.out.print("*");
            }
            System.out.println();
        }





    }
}

// osman bozdag

   /* Write a Java program that displays the area and perimeter of a circle that has a radius of
5.5 using the following formulas:
        perimeter = 2 * radius * 𝜋
        area = radius * radius * 𝜋*/