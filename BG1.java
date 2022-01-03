import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BG1 extends BG
{
    public static int xPoz;
    public static int yPoz;
    int timer=0;
    public static int limEdgeDr, limEdgeSt; //se initializeaza in fiecare world,                                            // in functie de dimensiunea BG.
    public void act() 
    {
        
        if(Greenfoot.isKeyDown("D") && Player.playerInCenter && !Player.animAtac && !Player.animAtacSus && !Player.blocareMiscare && 
            Control_Scene.scenaCurenta!= 5 && Control_Scene.scenaCurenta!= 7 && Control_Scene.scenaCurenta!= 8 && Control_Scene.scenaCurenta != 2  
            && Control_Scene.scenaCurenta != 9) //background-ul se va misca contrar directiei apasate pentru a crea efectul de parallax
            setLocation(getX()-2,getY());
        else if(Greenfoot.isKeyDown("A") && Player.playerInCenter && !Player.animAtac && !Player.animAtacSus && !Player.blocareMiscare && 
            Control_Scene.scenaCurenta!= 5 && Control_Scene.scenaCurenta!= 7 && Control_Scene.scenaCurenta!= 8 && Control_Scene.scenaCurenta != 2 && Control_Scene.scenaCurenta != 9
            ) 
            setLocation(getX()+2,getY());
        
        if(getX() < limEdgeDr)
            bgAtRightEdge = true;
        else bgAtRightEdge = false;
        
        if(getX() > limEdgeSt)
            bgAtLeftEdge = true;
        else bgAtLeftEdge = false;
        

    }

}
