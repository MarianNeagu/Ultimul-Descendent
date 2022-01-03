import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BG2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BG2 extends BG
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("D") && !bgAtRightEdge && Player.playerInCenter && !Player.animAtac && !Player.animAtacSus && !Player.blocareMiscare && 
            Control_Scene.scenaCurenta!= 5 && Control_Scene.scenaCurenta!= 7 && Control_Scene.scenaCurenta!= 8 && Control_Scene.scenaCurenta != 2
            && Control_Scene.scenaCurenta != 9)
            setLocation(getX()-1,getY()); 
        else if(Greenfoot.isKeyDown("A") && !bgAtLeftEdge && Player.playerInCenter && !Player.animAtac && !Player.animAtacSus && !Player.blocareMiscare && 
            Control_Scene.scenaCurenta!= 5 && Control_Scene.scenaCurenta!= 7 && Control_Scene.scenaCurenta!= 8 && Control_Scene.scenaCurenta != 2
            && Control_Scene.scenaCurenta != 9)
            setLocation(getX()+1,getY());       
    }    
}
