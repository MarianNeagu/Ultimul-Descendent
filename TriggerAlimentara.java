import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class TriggerAlimentara extends Actor
{
    Actor player;
    private boolean afisatText = false, interactOneTime=false,interactWith_E,intersectie=false,transparenta;
    TriggerAlimentara()
    {
        setImage(new GreenfootImage(1,1));
        getImage().setTransparency(0);
    }
    public void act() 
    {   //realizarea intrarii in magazin la replica 1                
        if(Dialog.replicaCurenta >= 1 && Dialog.replicaCurenta < 10  && Dialog.apDialogPublic==Replici.vanzatorAlimentara)
        {
            Player playerImg = (Player) getWorld().getObjects(Player.class).get(0);
                playerImg.getImage().setTransparency(0);
        }
        
        //se deblocheaza miscarea dupa terminarea dialogului
        if(Dialog.replicaCurenta == 10 && Dialog.apDialogPublic==Replici.vanzatorAlimentara )
            Player.blocareMiscare = false;   
            
        player = getOneIntersectingObject(Player.class);
        if(Greenfoot.isKeyDown("D") && !Player.animAtac && !Player.animAtacSus && Player.playerInCenter && !Player.blocareMiscare)           
               setLocation(getX()-3,getY());            
        else if(Greenfoot.isKeyDown("A") && !Player.animAtac && !Player.animAtacSus && Player.playerInCenter && !Player.blocareMiscare)
               setLocation(getX()+3,getY());               
        VerifColPlayer();            
    }          
    public void VerifColPlayer()  
    {  
        //dialogul incepe cand detecteaza player-ul
        if(!interactOneTime)
        {            
            if(player != null)
            {
                transparenta = true;
                Player.blocareMiscare = true;
                getWorld().addObject(new Dialog(0,9,235,Replici.vanzatorAlimentara),500,450);
                interactOneTime = true;                
            }                 
        }                            
    }
}