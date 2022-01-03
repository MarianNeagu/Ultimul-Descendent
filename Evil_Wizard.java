import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Evil_Wizard extends Actor
{
    private int idleAnimations=2,spellsCast=4,cadru=0,frameIdle=0,frameAttack=0,delayDamagePlayer=40,timerDialog=150;
    private boolean defeated=false,dialogTerm=false;
    public static int health = 150;
    public void act() 
    {
        //in momentul cand s-a terminat dialogul de inceput va aparea bara de viata 
        if(Dialog.replicaCurenta == 18 && !dialogTerm)
        {
            dialogTerm=true;
            HealthBar_King hbK = new HealthBar_King();
            getWorld().addObject(hbK,750,40);
        }
        
        //delay pana la inceperea dialogului
        if(timerDialog > 0)
        timerDialog--;
        else if(timerDialog==0)
        {
            getWorld().addObject(new Dialog(7,17,260,Replici.dialogInamici),500,450); //260 vit
            timerDialog=-1;
        }           
        
        //verificare coliziune vraja player
       List vraja = getObjectsInRange(100,Vraja_Atac.class);
       if (!vraja.isEmpty() && delayDamagePlayer==40 )
            {
                health -=10;
                delayDamagePlayer -=1;
            }
        else if(delayDamagePlayer < 40 && delayDamagePlayer > 0 )
            delayDamagePlayer --;
        else if(delayDamagePlayer <= 0)
            delayDamagePlayer = 40;
            
         if(health <=0)
        defeated = true;
        
          if(!defeated)
          {
              if(Player.blocareMiscare ) //daca playerul nu se poate misca va ramane in idle
                  {
                      Idle();
                  }
                  else if(Player.healthLucio <=0) //daca playerul moare va opri animatia de atac
                  spellsCast = 0;          
              else
                  {
                    if(idleAnimations>0) 
                    
                        Idle();
                        
                    else
                    
                        Attack(); 
                  }          
          } 
       else
          { 
               Defeat_Effect effect = new Defeat_Effect();
               getWorld().addObject(effect,getX(),getY());
               getWorld().removeObject(this);                      
          }                
    }  
    
    //Animatiile actorului
    private void Idle()
    {
        if(cadru % 2 == 0)
        {
            setImage("Armature-Idle_" + frameIdle + ".png");
             getImage().scale(getImage().getWidth() - 20,getImage().getHeight()-20);
            frameIdle++;
            if(frameIdle > 19)
            {
                idleAnimations--;
                frameIdle = 0;
                cadru=0;
            }
        }
        cadru++;
    }
    
    private void Attack()
    {
        if(cadru % 2 == 0)
        {
           
            if(frameAttack == 24)
            {
            MagicBullet magicBullet = new MagicBullet();
            getWorld().addObject(magicBullet,getX() - 60,getY() - 20);
            spellsCast--;                       
            }
            setImage("Armature-Shoot_" + frameAttack + ".png");
             getImage().scale(getImage().getWidth() - 20,getImage().getHeight()-20);
            frameAttack++;
            if(frameAttack >39)
            {
                frameAttack = 0;
                if(spellsCast==0)      
                {
                    //la terminarea ciclului de atac numarul de animatii idle si attack vor fi alese random
                    idleAnimations = Greenfoot.getRandomNumber(4) + 1;
                     spellsCast = Greenfoot.getRandomNumber(7) + 1;
                               cadru=0;
                }
            }          
        }
        cadru++;
    }
}

