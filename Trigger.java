import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class Trigger extends Ciuperca
{
    static boolean atins;
    boolean setat=false;
    Actor vraja;
    public void act() 
    {
        //in functie de varianta aleasa se va incarca nivelul corespunzator
        if(Dialog.replicaCurenta == 32 )
                   Greenfoot.setWorld(new Scena4_Padure2());
        else if(Dialog.replicaCurenta == 30 && Ciuperca.nrPoza == 3 )
                   Greenfoot.setWorld(new Scena3_TrainingLucio());
        else if(Dialog.replicaCurenta == 31 && Ciuperca.nrPoza != 2) 
                Greenfoot.setWorld(new Scena3_TrainingLucio());
                
       vraja = getOneIntersectingObject(Vraja_Atac.class);
       //se afiseaza dialogul in functie de varianta aleasa si se transmite frame-ul actorului Ciuperca
       if(vraja!=null && !setat)
       {
           atins = true;
           setat = true;
           if(ManaLucio.varAleasa == 1)
           {               
               getWorld().addObject(new Dialog(31,31,240,Replici.replici),500,450);
               Ciuperca.nrPoza = 2;                
           }                
           else
           {
              getWorld().addObject(new Dialog(29,29,240,Replici.replici),500,450);
              Ciuperca.nrPoza = 3; 
           }
       }
       else if (!setat)
                 Ciuperca.nrPoza = 1;
    }    
}
