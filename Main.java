    import java.util.*;
import java.util.Scanner;
public class Main
{
    // private static int exp = 0;
    // private static int hp = 100;
    // private static int money = 0;
    private static int leve = 1;
    public static void main(String[] args){
        Novice ClassNovice = new Novice();
        Item ClassItem = new Item();
        Bag ClassBag = new Bag();
        Store ClassStore = new Store();
        Scanner in = new Scanner(System.in);
        ClassBag.init_slot();
        System.out.print("> Your Name:");
        String name = in.next();
        System.out.print("> Hi, "+ name + " ,Welcome to your world \n" );
        System.out.println("> exp : 0   hp: 100   Money: 0  Level: 1\n");
        System.out.println("Mode\n d : Dragon's Cave \n s : Store \n m : Keep money to Monster attack \n b : Bag");
        while(ClassNovice.hp > 0){
            System.out.println("> Name : " + name + "  Class : Novice Lv." + leve +"  HP : " + ClassNovice.hp + "  EXP : " + ClassNovice.exp +"  Money : " + ClassNovice.money);
            if(ClassNovice.money > 100)
                ClassStore.randomItem();
            System.out.print("> Action :");
            String action = in.next();
            switch(action.charAt(0)){
                case 'd' :{ClassNovice.DrogonFight(); break;}
                case 's' :
                    {
                        if(ClassNovice.money > 100)
                            ClassNovice.money = ClassStore.store(ClassNovice.money); 
                        break;
                    }
                case 'm' :{ClassNovice.Monster(); break;}
                case 'b' :
                    {
                        ClassBag.info();
                    }
            }
        
        if (ClassNovice.hp < 25)
        {
            System.out.println("Do you want to increase blood(y/n)?" + ClassNovice.hp);
            String Ans = in.next();
            if((Ans.charAt(0) == 'y')&&(ClassNovice.money > 100))
            {
                ClassNovice.hp = 100;
                ClassNovice.money = ClassNovice.money - 60;
            }
            else if(ClassNovice.money < 100)
                System.out.println("Your money is not enough");
        }

        else if (ClassNovice.exp >= 100){
            leve++;
            ClassNovice.exp = ClassNovice.exp - 100;
            System.out.println("Level UP" + leve+ "!!");
        }
        }

         System.out.print("Game Over!!");
         System.exit(1);
    }
}