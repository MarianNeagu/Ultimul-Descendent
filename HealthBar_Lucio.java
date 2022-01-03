import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar_Lucio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar_Lucio extends UI
{
    /**
     * Act - do whatever the HealthBar_Lucio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Player.healthLucio <= 100 && Player.healthLucio > 80)
            setImage("HealthLucio5.png");
        else if (Player.healthLucio <= 80 && Player.healthLucio > 60)
            setImage("HealthLucio4.png");
        else if (Player.healthLucio <= 60 && Player.healthLucio > 40)
            setImage("HealthLucio3.png"); 
        else if (Player.healthLucio <= 40 && Player.healthLucio > 20)
            setImage("HealthLucio2.png"); 
        else if (Player.healthLucio <= 20 && Player.healthLucio > 0)
            setImage("HealthLucio1.png"); 
        else setImage("HealthLucio0.png"); 
    }    
}
