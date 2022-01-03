import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ButonInapoi extends Butoane
{

    MeniuPrincipal meniu; 
    
    public void act()  
    { 
        if (Greenfoot.mouseClicked(this))  
        { 
            setImage("Buton_Inapoi.png"); // isi schimba aparenta pentru a exista un raspuns vizual la apasare
            Greenfoot.delay(6); // delay 
            ButonStart start = new ButonStart();
            ButonInstructiuni instructiuni = new ButonInstructiuni();
            
            getWorld().addObject(start,217,246);
            getWorld().addObject(instructiuni,217,364);
            BackgroundMeniu.instructiuni =false;
            getWorld().removeObject(this);
        }    
        
        if(Greenfoot.mouseMoved(this)) 
        { 
            setImage("Buton_Inapoi_Selectat.png");
        } 
        else if (Greenfoot.mouseMoved(meniu))
        {
            setImage("Buton_Inapoi.png");
        }
    }    
}
