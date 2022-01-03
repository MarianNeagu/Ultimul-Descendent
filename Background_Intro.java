import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Background_Intro extends Actor
{
   private int delay=0,y=170,i=0;
   boolean adaugat=false,finish=false,butonAfis=false,musicOn=false;
   
   
    public void act() 
    {
       if(!musicOn)
       {
           musicOn = true;
           GreenfootSound muzicaIntro = new GreenfootSound("Intro.wav");
           muzicaIntro.play();
       }
        
       if(finish==false )
       {
           
           if(delay<=0) //Numarul de pasi pana cand o alta propozitie va fi aleasa
           {
            Text_Intro text = new Text_Intro(Replici.repliciNarator[i]); //Se creeaza o instanta Text_Intro ce contine enuntul de pe pozitia i;               
            getWorld().addObject(text,500,y); //Instanta este plasata pe ecran la un x static si un y ce va creste la fiecare instanta
            y+=33;
            i++;
            delay++;            
            if(i > Replici.repliciNarator.length - 1)//daca am ajuns la ultima propozitie Intro-ul se va opri
                finish=true;

           }
           else if(delay==200)
               delay=0;
           else delay++;

       }
       else 
       {
           if(!butonAfis)
           {
               Buton_Next buton = new Buton_Next();
               getWorld().addObject(buton, 900,550);
               butonAfis = true;
           }
           
       }
        
  
                       
        
    }    
}
