import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ciuperca extends Training
{
    public static int nrPoza = 1;
    public void act() 
    {
       //setarea imaginii in functie de varianta aleasa 
       if(nrPoza==1)
           setImage("Ciuperca1.png");
       else if (nrPoza==2)
                setImage("Ciuperca2.png");
       else if (nrPoza==3) setImage("Ciuperca3.png");

    }    
}
