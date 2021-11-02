package hillel.kate;
//lesson3
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner InputSideA = new Scanner(System.in);
        System.out.println("Add a side:   ");
        double firstside = InputSideA.nextInt();

        Scanner InputSideB = new Scanner(System.in);
        System.out.println("Add a side:   ");
        double secondSide = InputSideA.nextInt();

        Scanner InputSideC = new Scanner(System.in);
        System.out.println("Add a side:   ");
        double thirdSide = InputSideA.nextInt();

        double Perimetr = getPerimetr(firstside,secondSide,thirdSide);
        double SemiPerimetr = getSemiPerimetr(Perimetr);
        double Square = getSquare(SemiPerimetr, firstside, secondSide, thirdSide);

        System.out.println("Perimetr: " + Perimetr);
        System.out.println("Half Perimetr:" + SemiPerimetr);
        System.out.println("Square:"+ Square);
    }

    public static double getPerimetr(double firstSide,double secondSide,double thirdSide) {
        return firstSide + secondSide + thirdSide;
    }
    public static double getSemiPerimetr(double getPerimetr){return (getPerimetr)/ 2;}

    public static double getSquare(double SemiPerimetr, double firstSide,double secondside, double thirdSide){
        return Math.sqrt(SemiPerimetr * (SemiPerimetr - firstSide) * (SemiPerimetr - secondside) * (SemiPerimetr - thirdSide));
    }

}
