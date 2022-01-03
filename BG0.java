import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class BG0 extends BG
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("D") && !BG.bgAtRightEdge //background-ul se va misca contrar directiei apasate pentru a crea efectul de parallax
            && Player.playerInCenter && !Player.animAtac && !Player.animAtacSus && !Player.blocareMiscare && 
            Control_Scene.scenaCurenta!= 5 && Control_Scene.scenaCurenta!= 7 && Control_Scene.scenaCurenta!= 8 
            && Control_Scene.scenaCurenta != 2 && Control_Scene.scenaCurenta != 9)
                setLocation(getX()-3,getY());
                
        else if(Greenfoot.isKeyDown("A") && !BG.bgAtLeftEdge 
            && Player.playerInCenter && !Player.animAtac && !Player.animAtacSus && !Player.blocareMiscare && 
            Control_Scene.scenaCurenta!= 5 && Control_Scene.scenaCurenta!= 7 && Control_Scene.scenaCurenta!= 8 
            && Control_Scene.scenaCurenta != 2 && Control_Scene.scenaCurenta != 9)
            setLocation(getX()+3,getY());
    }    
}
