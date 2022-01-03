import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Control_Scene extends Actor
{
    public static int scenaCurenta;
    private int timer=255; // timer fadeIn&Out
    private boolean fadeIn = false;
    private boolean fadeOut = false;
    private boolean loadScene = false;
    private boolean musicOn = false;
    public void act() 
    {

        if(!fadeIn)
        {
            
            timer-=3;
            getImage().setTransparency​(timer);
            if(timer <= 0)
                fadeIn = true;
        }
        
        
        if(fadeOut)
        {
            timer+=3;
            getImage().setTransparency​(timer);
            if(timer >= 255)
            {
                loadScene=true;
                fadeOut=false;
            }
                
        }
        
        
        
        switch(scenaCurenta)
        {
            case 1: 
            if(!fadeOut)
            {
                if(Player.isAtRightEdge)
                {
                    fadeOut = true;
                    timer = 0;
                }
                if(loadScene)
                    Greenfoot.setWorld(new Scena2_Padure1()); // delay
            }
            break;
            
            case 2:
            if(!fadeOut)
            {
                //vrem sa luam replicaCurenta a lui Zaratras si daca a ajuns la ultima replica, va intra in training
                if(Dialog.replicaCurenta==17 && Dialog.apDialogPublic==Replici.replici)
                    Greenfoot.setWorld(new Scena3_TrainingLucio());
            }
            break;
            
            case 3:
                GreenfootSound muzicaTraining = new GreenfootSound("Training.wav");
                if(!musicOn)
                    {
                        
                        muzicaTraining.play();
                        musicOn=true;
                    }
            
            case 4:
            if(!fadeOut)
            {
                if(Player.isAtRightEdge)
                {
                    fadeOut = true;
                    timer = 0;
                }
                if(loadScene)
                    Greenfoot.setWorld(new Scena5_Lupta1_Padure()); // delay
            }
            break;
            
            case 6:
            if(!fadeOut)
            {
                if(Player.isAtRightEdge)
                {
                    fadeOut = true;
                    timer = 0;
                }
                if(loadScene)
                    Greenfoot.setWorld(new Scena7_Lupta2_Pestera()); // delay
            }
            break;
            
            case 8:
            if(!fadeOut)
            {
                if(Player.isAtRightEdge)
                {
                    fadeOut = true;
                    timer = 0;
                }
                if(loadScene)
                    Greenfoot.setWorld(new Scena9_Lupta3_PadNoapte()); // delay
            }
            break;
        }
        
    }
    
    
}
