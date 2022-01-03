import greenfoot.*;   // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ButonStart extends UI 
{ 
    // PlayButton este un buton care prin apasarea acestuia are 
    // rolul de schimbarea lumii Menu cu cea de Level. 
    
    MeniuPrincipal meniu; 
    
    public void act()  
    { 
        if (Greenfoot.mouseClicked(this))  
        { 
            setImage("Buton_Start.png"); // isi schimba aparenta pentru a exista un raspuns vizual la apasare
            Greenfoot.delay(6); // delay 
            Greenfoot.setWorld(new Scena_Intro()); //la apasarea butonului te trimite la Introducere
        }   
        
        if(Greenfoot.mouseMoved(this)) 
        { 
            setImage("Buton_Start_Selectat.png");
        } 
        else if (Greenfoot.mouseMoved(meniu))
        {
            setImage("Buton_Start.png");
        }
    }    
}
