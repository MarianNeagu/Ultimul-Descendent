import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class PowerBall extends Bat
{
    private int cadru=0,nrImg=0,velocity = 1,velocityMax=5,delayDamagePlayer = 10;
    GreenfootSound damageSound = new GreenfootSound("Damage.wav");
    public void act() 
    {
        //cauta instantele din clasa Player pe o raza de 30
        List player = getObjectsInRange(30,Player.class);
       //poate da damage o data la 10 frame-uri  
       if (!player.isEmpty() && delayDamagePlayer==10 )
            {
                damageSound.play();
                Player.healthLucio -=5;
                delayDamagePlayer -=1;
            }
        else if(delayDamagePlayer < 10 && delayDamagePlayer > 0 )
            delayDamagePlayer --;
        else if(delayDamagePlayer <= 0)
            delayDamagePlayer = 10;
            
        //daca ajunge la o anumita distanta pe y va vi stearsa din scena
        if(getY() >= 490)         
           getWorld().removeObject(this);
        else
        {
                if(velocity <= Greenfoot.getRandomNumber(7)+1 && cadru % 7==0) //accelereaza in timp in functie de un numar random
                velocity++;
                setLocation(getX(), getY() +velocity);
                 if(cadru % 5 == 0)
                    {        
                        setImage("Proiectil_" + nrImg + ".png");
                        nrImg++;
                        if(nrImg>3)
                            nrImg = 0;  
                    }
                cadru++;                        
        }
    }
}    

