import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FG1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FG1 extends FG
{
    /**
     * Act - do whatever the FG1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //se realizeaza efectul de parallax
        if(Greenfoot.isKeyDown("D") && !BG.bgAtRightEdge && Player.playerInCenter && !Player.animAtac && !Player.animAtacSus && !Player.blocareMiscare)
            setLocation(getX()-2,getY());
        else if(Greenfoot.isKeyDown("A") && !BG.bgAtLeftEdge && Player.playerInCenter && !Player.animAtac && !Player.animAtacSus && !Player.blocareMiscare)
            setLocation(getX()+2,getY()); 
    }    
}
