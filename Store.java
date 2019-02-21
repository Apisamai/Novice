import java.util.Random;
import java.util.Scanner;
public class Store
{
    static Bag ClassBag = new Bag();
    public static int store(int value)
    {
        Scanner in = new Scanner(System.in);
        String Ans;
        System.out.println("1.Armor\n2.Damage\n3.Life Stealed");
        System.out.println("> Enter number:");
        Ans = in.next();
        switch(Ans.charAt(0)){
            case '1' : 
            {
                value = value - 90;
                ClassBag.put_in(1);
                break;
            }
            case '2' : 
            {
                value = value - 150; 
                ClassBag.put_in(2);
                break;
            }
            case '3' : 
            {
                value = value - 250; 
                ClassBag.put_in(3);
                break;
            }    
        }
        return value; 
    }
    public static void randomItem(){
        String[] Item = {"Sapeed up please press 1","Armor please press 2","Damage please press 3","Life Stealed please press 4"};
        String random = (Item[new Random().nextInt(Item.length)]);
        System.out.println("> If you want to buy " + random);
    }
}