import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class HealthBar_Bat2 extends UI
{

    public void act() 
    {
        //update in timp real al statusului vietii actorului
        setLocation(Bat.xBat2, 160);
        
        if(Bat.health2 <= 100 && Bat.health2 > 90)
            setImage("HealthBat8.png");
        else if(Bat.health2 <= 90 && Bat.health2 > 80)
            setImage("HealthBat7.png");
        else if(Bat.health2 <= 80 && Bat.health2 > 70)
            setImage("HealthBat6.png");
        else if(Bat.health2 <= 70 && Bat.health2 > 60)
            setImage("HealthBat5.png");
        else if(Bat.health2 <= 60 && Bat.health2 > 50)
            setImage("HealthBat4.png");
        else if(Bat.health2 <= 50 && Bat.health2 > 40)
            setImage("HealthBat3.png");
        else if(Bat.health2 <= 40 && Bat.health2 > 30)
            setImage("HealthBat2.png");
        else if(Bat.health2 <= 30 && Bat.health2 > 10)
            setImage("HealthBat1.png");
        else setImage("HealthBat0.png");
    }    
}
