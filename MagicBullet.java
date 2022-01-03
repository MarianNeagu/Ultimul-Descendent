import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class MagicBullet extends Evil_Wizard
{    
    private int cadru=0,nrImg=0,velocity = -4,nr=0,delayDamagePlayer=50;
    GreenfootSound damageSound = new GreenfootSound("Damage.wav");
           
    public void act() 
    {
       //Verificare coliziune player 
       List player = getObjectsInRange(70,Player.class);
       if (!player.isEmpty() && delayDamagePlayer==50 )
            {
                damageSound.play();
                Player.healthLucio -=5;
                delayDamagePlayer -=1;
            }
        else if(delayDamagePlayer < 50 && delayDamagePlayer > 0 )
            delayDamagePlayer --;
        else if(delayDamagePlayer <= 0)
            delayDamagePlayer = 50;
        
        //Eliminare din scena daca ajunge la margine    
        if(isAtEdge())         
           getWorld().removeObject(this);
        else
            {
                   setLocation(getX() + velocity, getY() );
                    if(cadru % 8 == 0)
                        {        
                            setImage("MagicBullet_" + nrImg + ".png");
                            getImage().scale(getImage().getWidth() - 10,getImage().getHeight()-10);
                            nrImg++;
                            if(nrImg>3)
                                nrImg = 0;            
                        }
                cadru++;                        
        }
    }
   
}