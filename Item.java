import java.util.Random;
import java.util.Scanner;
public class Item
{
    String name;
    public void item(int hp, int exp, int value)
    {
        switch(value){
        case 1 : 
            {
                hp = hp + 15; 
                name = new String("ammor");
                break;
            }
        case 2 : 
            {
                exp = exp + 30;
                name = new String("Damage"); 
                break;
            }
        case 3 : 
            {
                hp = hp + 40; 
                name = new String("Life Stealed");
                break;
            }    
        } 
    }  
}