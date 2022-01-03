import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class UI extends Actor
{

    private boolean inventarOn = false;
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("I") && !inventarOn)
            afisareInventar();
        else if(Greenfoot.isKeyDown("I") && inventarOn)
            ascundeInventar();
        
    }  
    
    public void afisareInventar()
    {
        if(getWorld()!=null)
        {
            Inventar inventar = new Inventar();
            getWorld().addObject(inventar, 500, 300);
            inventarOn = true;
        }
            
    }
    
    public void ascundeInventar()
    {
        if(getWorld()!=null)
        {
            getWorld().removeObjects(getWorld().getObjects(Inventar.class));
            inventarOn = false;
        }
            
    }
    
}
