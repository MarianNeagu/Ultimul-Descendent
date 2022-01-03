import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Dialog extends Replici
{
    private int startS;
    public static int replicaCurenta;
    private int start2;
    private int finishS;
    private int delay,delay1;
    String[] apDialog;
    public static String[] apDialogPublic;
    public Dialog(int start,int finish,int time,String[] apartinatorReplica ) //poz de inceput a replicii, poz de sfarsit a replicii
    {                                                                        //cat timp sta replica pe ecran, numele stringului din care sa ia replicile
        apDialog = apartinatorReplica;
        startS=start;
        finishS=finish;
        delay=time;
        delay1=delay;
        apDialogPublic = apartinatorReplica;
    }
    public void act()
    {
        //se testeaza daca am ajuns la sfarsitul numarului de propozitii
        replicaCurenta = startS;
        if(startS<=finishS)
        {
            SistemDialog();
        }
        else
            getWorld().removeObjects(getWorld().getObjects(Dialog.class));                    
    }
    
    private void SistemDialog()
    {
        //dupa un numar de pasi va aparea o alta propozitie pe ecran
        if(delay1==delay)
        {
            getWorld().addObject(new TextTimp(apDialog[startS] ,30, delay - 20, Color.WHITE, new Color(0, 0, 0, 60)), 500, 585);
            delay1--;                                                                    //fundal text r  g  b   a  (0,0,0)=> negru
        }
        else
            delay1--;
        if(delay1==0)
        {
            delay1= delay;
            startS++;
        }                                        
    }
    
      
}
