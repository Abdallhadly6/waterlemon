package waterlemon;
import java.util.Scanner;
public class Waterlemon {
    
    public static Scanner inp = new Scanner(System.in);
    static void even(int weight){

        if((weight % 2) == 0){System.out.println("YES");}
        else{System.out.println("NO");}
    }
    public static void main(String[] args)  {
            System.out.print("ENTER THE WEIGHT: ");
            int weight;
            weight = inp.nextInt();
            if (weight > 2 ){
              even(weight);
            }
            else{
              System.out.println("NO");
            }
           
    }
    
}
