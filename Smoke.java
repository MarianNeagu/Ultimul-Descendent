import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Smoke extends Actor
{
    private int side,img,timer=2;
    public Smoke(int directie,int frame)
    {
        //se alege directia frame-ului si numarul acestuia
        img=frame;
        side = directie; 
        if(side==0)
        AnimatieStanga();
        else
        AnimatieDreapta();
    }
    public void act() 
    {
       if(timer>0)
        timer--;
        else
        getWorld().removeObject(this);                        
    }
    
    private void AnimatieDreapta()
    { 
            
            setImage("Smoke Trail loop_"+ img +".png");
            getImage().mirrorHorizontally();
            GreenfootImage image = getImage();
            image.scale(image.getWidth() - 200,image.getHeight() -200);
            setImage(image);                        
    }
    
    private void AnimatieStanga()
    {       
            setImage("Smoke Trail loop_"+ img +".png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth() - 200,image.getHeight() -200);
            setImage(image);                                    
    }
}