import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Inventar extends UI
{
    private boolean isOn;

    public void act() 
    
    {
        if(!isOn && Greenfoot.isKeyDown("I"))
        {
            getImage().setTransparency(255);
            isOn = true;
        }
                
        else 
            if(isOn && Greenfoot.isKeyDown("I"))
                {
                    getImage().setTransparency(0);
                    isOn = false;
                }
                
            
             
    }    
}
