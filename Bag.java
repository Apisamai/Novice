import java.util.*;
public class Bag{
    int i = 20;
    int slot[][] = new int[i][2];
    int item[] = new int[3];
    Item ClassItem = new Item();
    public void init_slot(){
        for(int num = 0 ; num < i; num++){
            slot[num][0] = 0;
            slot[num][1] = 0;
        }
        for(int num = 0; num < 3; num++){
            item[num] = 0;
        }
    }
    public void info(){
        for (int num = 1; num < 4; num++){
            ClassItem.item(0,0,num);
            System.out.println(num + "." + ClassItem.name + ": " + item[num -1]);
        }
    }
    public void put_in(int item_number){
        for(int num = 0 ; num < i; num++){
            if(slot[num][0] == 1){
            }
            else if(slot[num][0] == 0){
                slot[num][0] = 1;
                slot[num][1] = item_number;
                item[item_number-1]++;
                break;
            }
            else{
                System.out.println("Bag is FULL!!");
            }
        }
    }
    public void get_out(){}
}