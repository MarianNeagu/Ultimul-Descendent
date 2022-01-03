import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MeniuPrincipal extends World
{

    public MeniuPrincipal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        
        BackgroundMeniu bg = new BackgroundMeniu();
        addObject(bg,500,300);
        
        ButonStart start = new ButonStart();
        ButonInstructiuni instructiuni = new ButonInstructiuni();
            
        addObject(start,217,246);
        addObject(instructiuni,217,364);
        
        BackgroundMeniu.instructiuni =false;
    }
    
    
}
