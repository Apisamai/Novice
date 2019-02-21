import java.util.*;
public class Novice{ 
    public int hp = 100;
    public int exp = 0;
    public int money = 0;
    public void DrogonFight()
    {
        exp = exp + 25;
        hp = hp - 15;
        money = money + 20;
    }
    public void Monster()
    {
        exp = exp + 2;
        hp = hp - 1;
        money = money + 30;
    }
}