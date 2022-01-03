
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Vraja_Atac extends Actor
{
    private int cadru;
    int nrImg = 0;
    public static int vitezaVraja;    
    public void act() 
    {        
       if(isAtEdge() && Control_Scene.scenaCurenta!=3 && Control_Scene.scenaCurenta!=9)   // isAtEdge() poate lua valoarea true sau false in functie daca atinge sau nu marginea       
           getWorld().removeObject(this);//daca atinge marginea atunci se sterge
        
        //daca in scena de training atinge ciuperca vraja va disparea,altfel va afisa pe ecran un mesaj   
        if(Control_Scene.scenaCurenta==3)
        {
            setLocation(getX(), getY()-8);
            if(getY() <= 139 && Trigger.atins)
               getWorld().removeObject(this);
            else if (!Trigger.atins && isAtEdge())
                {
                   getWorld().addObject(new Dialog(30,30,240,Replici.replici),500,450);
                  getWorld().removeObject(this);                      
                }                
        }            
        else move(8);
        
        if(cadru % 6 == 0)
        {
            setImage("VrajaLucio(" + nrImg + ")" + ".png");
            nrImg++;
            if(nrImg>11) 
                nrImg = 0;
        }        
        cadru++;
        if(cadru > 60)
            cadru = 0;
        if(Control_Scene.scenaCurenta == 9 && getX() >=870 && getWorld().getObjects(Evil_Wizard.class).size() != 0 || Control_Scene.scenaCurenta == 9 && getX() <=10 )
        getWorld().removeObject(this);
        else if(Control_Scene.scenaCurenta == 9 && isAtEdge() && getWorld().getObjects(Evil_Wizard.class).size() == 0)
                getWorld().removeObject(this);
        else if(Control_Scene.scenaCurenta == 9 && isAtEdge() && getWorld().getObjects(Evil_Wizard.class).size() != 0)
                getWorld().removeObject(this);                         
    }    
}
