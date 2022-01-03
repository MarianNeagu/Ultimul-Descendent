import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ButonInstructiuni extends Butoane
{
    MeniuPrincipal meniu; 
    
    public void act()  
    { 
        if (Greenfoot.mouseClicked(this))  
        { 
            setImage("Buton_Instructiuni.png"); // isi schimba aparenta pentru a exista un raspuns vizual la apasare
            Greenfoot.delay(6); // delay 
            ButonInapoi inapoi = new ButonInapoi();
            getWorld().addObject(inapoi,257,485);
            getWorld().removeObjects(getWorld().getObjects(ButonStart.class));
            getWorld().removeObject(this);
            BackgroundMeniu.instructiuni =true;
        }    
        
        if(Greenfoot.mouseMoved(this)) 
        { 
            setImage("Buton_Instructiuni_Selectat.png");
        } 
        else if (Greenfoot.mouseMoved(meniu))
        {
            setImage("Buton_Instructiuni.png");
        }
    } 
}
