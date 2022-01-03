import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Sol extends FG
{

    public void act() 
    {
       //se realizeaza efectul de parallax
       if(Greenfoot.isKeyDown("D") && !BG.bgAtRightEdge && Player.playerInCenter && !Player.animAtac && !Player.animAtacSus && !Player.blocareMiscare
       && Control_Scene.scenaCurenta!= 5 && Control_Scene.scenaCurenta!= 7 && Control_Scene.scenaCurenta!= 8 && Control_Scene.scenaCurenta != 2 && Control_Scene.scenaCurenta != 9)
            setLocation(getX()-3,getY());
        else if(Greenfoot.isKeyDown("A") && !BG.bgAtLeftEdge && Player.playerInCenter && !Player.animAtac && !Player.animAtacSus && !Player.blocareMiscare && 
            Control_Scene.scenaCurenta!= 5 && Control_Scene.scenaCurenta!= 7 && Control_Scene.scenaCurenta!= 8 && Control_Scene.scenaCurenta != 2 && Control_Scene.scenaCurenta != 9)
            setLocation(getX()+3,getY());
    }    
}
