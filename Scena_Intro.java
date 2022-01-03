import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Scena_Intro extends World
{


    public Scena_Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    public void prepare()
    {
         setPaintOrder(Text_Intro.class,Background_Intro.class);                         
        Background_Intro background_intro = new Background_Intro();
        addObject(background_intro,500,300);
        
        
        
    }
}
