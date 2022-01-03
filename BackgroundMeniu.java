import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BackgroundMeniu extends Actor
{
    public static boolean instructiuni = false;
    public void act() 
    {
        if(instructiuni)
            setImage("MeniuInstructiuni.png");
        else setImage("MeniuPrincipalBG.png");
    }    
}
