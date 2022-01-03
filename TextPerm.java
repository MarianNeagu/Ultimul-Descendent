import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class TextPerm extends Actor
{
    boolean apasat=false;
    private int poz;
    Scena3_TrainingLucio lume; 

    public TextPerm(String text, int size, Color color,int pozitie, Color colorBG)
    {
        setImage(new GreenfootImage(text,size,color,colorBG));
        poz = pozitie;
    }
    public void act() 
    {   
        //se salveaza optiunea aleasa si se transmite printr-o variabila publica
        MouseInfo mouse = Greenfoot.getMouseInfo();        
        if(Control_Scene.scenaCurenta==3)
        {
            if(Greenfoot.mouseMoved(this))
            {                
                getImage().setTransparency(255);
                ManaLucio.varAleasa = poz;
            }
            else if (Greenfoot.mouseMoved(lume))
            {
                getImage().setTransparency(190);
            }
            if(mouse!=null && Greenfoot.mouseClicked(this) && !apasat) //&& remove!=null)
            {
                getWorld().removeObjects(getWorld().getObjects(TextPerm.class));
                apasat = true;
                ManaLucio.canShoot = true; 
              
            }
                                }
    }    
}
