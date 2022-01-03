import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Little_Guardian extends Enemys
{
    int cadru = 0,nrImg=0,dx=-4,frameCadere=0,frameRidicare=0,frameDefeat=0,speed=1,nr=0,delayDamage=5,timerDialog=80,delayDamagePlayer=4,delayDefeat=100;
    private boolean mersDreapta=false,mersStanga=true,getUp=false,defeated=false,dying=false,dialogStart=false,terminatDialog=false; 
    public static boolean idle = true;    
    public static int health = 100;
    Actor vrajaLucio;
    GreenfootSound damageSound = new GreenfootSound("Damage.wav");
    
    public void act() 
    {   //Daca se afla in scena sapte si nu a inceput lupta               
        if(Dialog.replicaCurenta == 7 && Player.healthLucio == 100 && !terminatDialog)
        {
            terminatDialog = true;
            Player.blocareMiscare =false;
            idle=false;
            HealthBar_King hbK = new HealthBar_King();
            getWorld().addObject(hbK,750,40);
        }
        //Dialogul de inceput va incepe dupa un numar de pasi (100)
        if(timerDialog > 0 && Player.healthLucio == 100 )
        timerDialog--;
        else if(timerDialog==0 && Player.healthLucio == 100 )
        {
            getWorld().addObject(new Dialog(0,6,270,Replici.dialogInamici),500,450);
            timerDialog=-1;
        }
        //testeaza coliziunea cu Playerul repectiv atacul sau
        vrajaLucio = getOneIntersectingObject(Vraja_Atac.class);
        List player = getObjectsInRange(15,Player.class);
        
        
        if(vrajaLucio != null && delayDamage==5)
        {
            health -=10;
            delayDamage-=1;
           getWorld().removeObject(vrajaLucio);
        } else if(vrajaLucio == null && delayDamage<5)
                delayDamage--;
        if (delayDamage == 0) 
            delayDamage=5;
            
         //poate da damage dupa un anumit interval de timp 
        if (!player.isEmpty() && delayDamagePlayer==7 )
            {
                damageSound.play();
                Player.healthLucio -=5;
                delayDamagePlayer -=1;
            }
        else if(delayDamagePlayer < 7 && delayDamagePlayer > 0 )
            delayDamagePlayer --;
        else if(delayDamagePlayer <= 0)
            delayDamagePlayer = 7;
        
       //testeaza daca a inceput lupta
       if(idle==false)
       {
              if(health <= 0) //daca a murit se reseteaza brusc animatiile de mers pentrua incepe cea de infrangere 
                {
                    mersDreapta=false;
                    mersStanga=false;
                    dying = true;
                    cadru=0;
                }
                
            if(dying == true)
             DefeatAnimation();
            
           //animatie in functie de pozitia actorului  
           if(mersDreapta == true && mersStanga==false)
           {               
               MersDreapta();
               if(speed<=5 && cadru % 7 ==0)                                  
                   speed++;
               move(speed);                              
           }
           else if(mersDreapta == false && mersStanga == true)
           {   
               
               MersStanga(); 
               if(speed<=5 && cadru % 7 ==0)                                  
                   speed++; 
               setLocation(getX() - speed, getY());
            }
            
            //alegerea pozitiei la care va incepe animatia de cadere
            if(getX()<=60 && defeated==false) 
            { 
                     mersStanga=false;
                     CadereStanga();
            }
            if(getX()>=930 && defeated==false)
            {
                mersDreapta=false;
                CadereDreapta();  
            }
      }
      else
      {
          setImage("Armature-GetUp_17" + ".png");
            getImage().mirrorHorizontally();
            GreenfootImage image = getImage();
            image.scale(image.getWidth() - 30,image.getHeight()-50);
            setImage(image);
        }
    }  
    public void DefeatAnimation()
    {
        //la sfarsitul animatiei de infrangere se va trece la urmatoarea scena
        if(cadru % 14 == 0 && defeated==false)
        {
            setImage("Armature-Defeat_" + frameDefeat + ".png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth() - 30,image.getHeight()-50);
            setImage(image);
            frameDefeat++;
            if(frameDefeat>32)
            {
                defeated=true;  
                dying = false;
                cadru=0;
                Greenfoot.setWorld(new Scena6_Padure3CapPestera());       
            }
        }
        cadru++;
    }
    public void MersStanga()
    {
        if(cadru % 2 == 0)
        {
            
            setImage("Armature-Run_" + nrImg + ".png");
            getImage().mirrorHorizontally();
            GreenfootImage image = getImage();
            image.scale(image.getWidth() - 30,image.getHeight()-50);
            setImage(image);
            nrImg++;
            if(nrImg>29)
                nrImg = 0;   
        }
        cadru++;
        if(cadru > 29)
            cadru = 0;
    }
    public void MersDreapta()
    {
        if(cadru % 2 == 0)
        {
            setImage("Armature-Run_" + nrImg + ".png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth() - 30,image.getHeight()-50);
            setImage(image);
            nrImg++;
            if(nrImg>29)
                nrImg = 0;
            
        }
        cadru++;
        if(cadru > 29)
            cadru = 0;
    }    
    public void CadereDreapta()
    {
        if(getUp==false)
       {
            if(cadru % 3 == 0)
        {
            setImage("Armature-Falling_" + frameCadere + ".png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth() - 30,image.getHeight()-50);
            setImage(image);
            frameCadere++;
            if(frameCadere>17)
            {
                frameCadere = 0;
                getUp=true;
                speed=1;
            }       
        }
        cadru++;
       }
       else
       {           
           if(cadru % 4 == 0)
        {
            setImage("Armature-GetUp_" + frameRidicare + ".png");
            GreenfootImage image = getImage();
            image.scale(image.getWidth() - 30,image.getHeight()-50);
            setImage(image);
            frameRidicare++;  
            if(frameRidicare>17)
            {
            mersStanga=true;
            cadru=0;
            frameRidicare=0;
            getUp=false;
            }              
        }
        cadru++;
       }                
    }
    //Animatie Stanga    
    public void CadereStanga()
    {
        if(getUp==false)
       {
            if(cadru % 3 == 0)
        {
            setImage("Armature-Falling_" + frameCadere + ".png");
            getImage().mirrorHorizontally();
            GreenfootImage image = getImage();
            image.scale(image.getWidth() - 30,image.getHeight()-50);
            setImage(image);
            frameCadere++;             
            if(frameCadere>=17)
            {
                frameCadere = 0;
                getUp=true;
                speed=1;
                
            }               
        }
        cadru++;        
       }
       else if(getUp==true)
       {           
           if(cadru % 4 == 0)
        {
            setImage("Armature-GetUp_" + frameRidicare + ".png");
            getImage().mirrorHorizontally();
         GreenfootImage image = getImage();
            image.scale(image.getWidth() - 30,image.getHeight()-50);
            setImage(image);
            frameRidicare++;               
            if(frameRidicare>=17)
            {
            mersDreapta=true;
            cadru=0;
            frameRidicare=0;
            getUp=false;
            }             
        }
        cadru++; 
       }
    }
}
