import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End_Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End_Credits extends World
{

    /**
     * Constructor for objects of class End_Credits.
     * 
     */
    public End_Credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    private void prepare() 
    {
        Control_Scene cs = new Control_Scene();
        addObject(cs,500,300);
        Control_Scene.scenaCurenta = 11;
    }
}
