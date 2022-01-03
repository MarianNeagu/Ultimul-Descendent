import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Defeat_Effect extends Actor
{
    private int cadru=0,nrImg=0;
    public void act() 
    {
        if(cadru % 3 == 0) //se realizeaza animatia pentru efectul de defeat
        {   if(nrImg!=1)
            {
             setImage("DashEffect_" + nrImg + ".png");
            getImage().scale(getImage().getWidth() - 600,getImage().getHeight()- 600);   
            }            
            nrImg++;
            if(nrImg>8)
                getWorld().removeObject(this);  
        }
        cadru++;        
    }    
}
