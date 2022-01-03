import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class HealthBar_Bat1 extends UI
{

    public void act() 
    {
        //update in timp real al statusului vietii actorului
        setLocation(Bat.xBat1, 140);        
        if(Bat.health1 <= 100 && Bat.health1 > 90)
            setImage("HealthBat8.png");
        else if(Bat.health1 <= 90 && Bat.health1 > 80)
            setImage("HealthBat7.png");
        else if(Bat.health1 <= 80 && Bat.health1 > 70)
            setImage("HealthBat6.png");
        else if(Bat.health1 <= 70 && Bat.health1 > 60)
            setImage("HealthBat5.png");
        else if(Bat.health1 <= 60 && Bat.health1 > 50)
            setImage("HealthBat4.png");
        else if(Bat.health1 <= 50 && Bat.health1 > 40)
            setImage("HealthBat3.png");
        else if(Bat.health1 <= 40 && Bat.health1 > 30)
            setImage("HealthBat2.png");
        else if(Bat.health1 <= 30 && Bat.health1 > 10)
            setImage("HealthBat1.png");
        else setImage("HealthBat0.png");        
    }    
}
