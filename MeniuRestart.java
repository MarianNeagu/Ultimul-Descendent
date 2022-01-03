import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeniuRestart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeniuRestart extends World
{

    /**
     * Constructor for objects of class MeniuRestart.
     * 
     */
    public MeniuRestart()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    private void prepare()
    {
         ButonRestart br = new ButonRestart();
         addObject(br,500,300);
    }
    
    
}
