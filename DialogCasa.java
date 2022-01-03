import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class DialogCasa extends Replici
{
    private boolean adaugat=false;
    private int timer=200,nr=0;
    public void act() 
    {
        //la sfarsitul dialogului va trece la urmatoarea scena
        if(Dialog.replicaCurenta == 11)
        {
            Greenfoot.setWorld(new Scena1_Oras());
        }
        if(!adaugat && timer<=0)
        {
            getWorld().addObject(new Dialog(0,10,280,Replici.repliciCasa),500,960); //apare dialogul
            adaugat = true;
        }
        else timer--;
        
    }    
}
