import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class TextTimp extends Actor
{
    private int duration;    
    public TextTimp(String text, int marime, int timp, Color colorText, Color colorFundal)
    {
        setImage(new GreenfootImage(text,marime,colorText, colorFundal));
        duration = timp;
    }
    
    public void act() 
    {
        if(duration>0)
        {
            duration--;
            if(duration == 0)
                getWorld().removeObject(this);         
        }
    }    
}
