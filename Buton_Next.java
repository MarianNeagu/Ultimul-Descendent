import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Buton_Next extends Background_Intro
{
    
    Scena_Intro scena; 
    
    public void act()  
    { 
        if (Greenfoot.mouseClicked(this))  
        { 
            setImage("Buton_Continua.png"); // isi schimba aparenta pentru a exista un raspuns vizual la apasare
            Greenfoot.delay(6); // delay 
            Greenfoot.setWorld(new Scena0_DialogOrfelinat()); //la apasarea butonului te trimite la Introducere
        }   
        
        if(Greenfoot.mouseMoved(this)) 
        { 
            setImage("Buton_Continua_Selectat.png");
        } 
        else if (Greenfoot.mouseMoved(scena))
        {
            setImage("Buton_Continua.png");
        }
    }    
}
