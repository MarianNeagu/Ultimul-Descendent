import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class NotificareAtac extends UI
{
    private int delay = 300,delaySt=300;
    boolean inSus, ajunsSus;
    public void act() 
    {

            if(getY()<70 && !inSus && !ajunsSus)
            {
                setLocation(getX(),getY()+5);
            }
            if(getY()==70 && delay<=0)
            {
                inSus= true;
                
            }
            else 
                        delay--;
                        
            if(inSus)
            {
                setLocation(getX(),getY()-5);
                if(getY()<-70)
                {
                    inSus=false;
                    ajunsSus = true;
                }
                    
            }


        
    }    
}
