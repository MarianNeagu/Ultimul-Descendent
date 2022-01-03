import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButonRestart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButonRestart extends Butoane
{
    MeniuRestart scena; 
    
    public void act()  
    { 
        if (Greenfoot.mouseClicked(this))  
        { 
            setImage("Buton_Restart.png"); // isi schimba aparenta pentru a exista un raspuns vizual la apasare
            Greenfoot.delay(6); // delay 
            Player.healthLucio = 100;
            Player.blocareMiscare =true;
            switch(Control_Scene.scenaCurenta)
            {
                case 5:
                Greenfoot.setWorld(new Scena5_Lupta1_Padure());
                Little_Guardian.idle = true;
                break;
                
                case 7:
                Greenfoot.setWorld(new Scena7_Lupta2_Pestera());
                break;
                
                case 9:
                Greenfoot.setWorld(new Scena9_Lupta3_PadNoapte());
                break;
            }
             //la apasarea butonului te trimite la Introducere
        }   
        
        if(Greenfoot.mouseMoved(this)) 
        { 
            setImage("Buton_Restart_Selectat.png");
        } 
        else if (Greenfoot.mouseMoved(scena))
        {
            setImage("Buton_Restart.png");
        }
    }       
}
