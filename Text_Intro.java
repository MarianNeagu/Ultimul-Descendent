import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Text_Intro extends Background_Intro
{
    String propozitie;
    int Alpha=1;;    
    public Text_Intro(String Propozitie)
    {
        propozitie = Propozitie;  //La fiecare instanta Text_Intro o propozitie va fi atribuita variabilei "propozitie"
        setImage(new GreenfootImage(propozitie,25,Color.WHITE,null)); //Aceasta va fi transformata intr-o imagine
        getImage().setTransparency(0); //Si va fi transparenta la inceput 
    }       
    public void act() 
    {
        if(getImage().getTransparency()<255) //La fiecare apel al functiei act textul va deveni mai vizibil
        {
            getImage().setTransparency(Alpha);
            Alpha++;
        }                    
    }    
}
