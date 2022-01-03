import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class ManaLucio extends Training
{   
    private int timerDialog=100,nr=0,var1=-1,var2=-1,var3=-1,var4=-1,var5=-1,delay=0;
    public static int varAleasa=-1;
    public static boolean canShoot = false;
    public int alfaBGtext = 255;
    boolean aiTras=false;    
    public void act() 
    {        
        MouseInfo mouse = Greenfoot.getMouseInfo();   
        //daca a fost aleasa o optiune se poate trage dupa un anumit numar de pasi
        if(delay==10 && canShoot)
        {
            if(canShoot && mouse.getButton() == 1 && !aiTras && mouse !=null)
            {   
                delay=11;
                Vraja_Atac vraja = new Vraja_Atac();
                getWorld().addObject(vraja, getX() - 5 , getY() - 65);
                aiTras=true;
            }            
        }
        else if(delay<10 && canShoot) delay++;
        
        if(mouse!=null)
            setLocation(mouse.getX(), getY());
        
        //se afiseaza de fiecare data optiunile vrajii intr-o ordine diferita
        if(Dialog.replicaCurenta == 29 && Control_Scene.scenaCurenta == 3 && canShoot==false)
        {
            if(nr < 5)
            {
                   switch(nr)
                   {
                       case 0:
                            var1=Greenfoot.getRandomNumber(5);
                            getWorld().addObject(new TextPerm(Replici.variantaVraji[var1],40,Color.WHITE,var1, new Color(0, 0, 0, alfaBGtext)),860,150);
                            nr++;
                            break;
                       case 1:
                             var2 = Greenfoot.getRandomNumber(5);
                               if(var2==var1 || var2==var3 || var2==var4 || var2 == var5)
                                 var2 = Greenfoot.getRandomNumber(5);
                                 else
                                 {
                                   getWorld().addObject(new TextPerm(Replici.variantaVraji[var2],40,Color.WHITE,var2, new Color(0, 0, 0, alfaBGtext)),860,200); 
                                   nr++;
                                 }                                    
                             break;
                       case 2:
                             var3 = Greenfoot.getRandomNumber(5);
                             if(var3==var1 || var3==var2 || var3==var4 || var3 == var5)
                                  var3 = Greenfoot.getRandomNumber(5);
                             else
                             {                               
                             getWorld().addObject(new TextPerm(Replici.variantaVraji[var3],40,Color.WHITE,var3, new Color(0, 0, 0, alfaBGtext)),860,250);      
                             nr++; 
                             }                             
                             break;
                       case 3:
                             var4 = Greenfoot.getRandomNumber(5);
                             if(var4==var2 || var4==var3 || var4==var1 || var4 == var5)
                                  var4 = Greenfoot.getRandomNumber(5);
                             else
                             {
                                getWorld().addObject(new TextPerm(Replici.variantaVraji[var4],40,Color.WHITE,var4, new Color(0, 0, 0, alfaBGtext)),860,300);      
                             nr++; 
                             }                             
                             break;    
                       case 4:
                             var5 = Greenfoot.getRandomNumber(5);
                             if(var5 == var1 || var5 == var2 || var5 == var3 || var5 == var4)
                                  var5 = Greenfoot.getRandomNumber(5);
                             else
                             {
                                getWorld().addObject(new TextPerm(Replici.variantaVraji[var5],40,Color.WHITE,var5, new Color(0, 0, 0, alfaBGtext)),860,350);      
                             nr++; 
                             }                                
                             break;  
                   }
            }           
        }
        //dialogul are loc dupa un anumit delay
        if(timerDialog > 0 )
        timerDialog--;
        else if(timerDialog==0)
        {
            getWorld().addObject(new Dialog(23,28,270,Replici.replici),500,450);
            timerDialog=-1;
        }
        
        
    }    
}
