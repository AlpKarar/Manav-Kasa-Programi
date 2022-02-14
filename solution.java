import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        float pearPrice = 2.14f, applePrice = 3.67f, tomatoPrice = 1.11f, bananaPrice = 0.95f, eggplantPrice = 5.0f, total;
        int pearAmount, appleAmount, tomatoAmount, bananaAmount, eggplantAmount;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Pear in kg: ");
        pearAmount = input.nextInt();
        
        System.out.print("Apple in kg: ");
        appleAmount = input.nextInt();
        
        System.out.print("Tomato in kg: ");
        tomatoAmount = input.nextInt();
        
        System.out.print("Banana in kg: ");
        bananaAmount = input.nextInt();
        
        System.out.print("Eggplant in kg: ");
        eggplantAmount = input.nextInt();
        
        total = pearPrice*pearAmount + applePrice*appleAmount + tomatoPrice*tomatoAmount + bananaPrice*bananaAmount + eggplantPrice*eggplantAmount;   
        
        System.out.print("Total Cost: " + total + " TL");
    }
}
