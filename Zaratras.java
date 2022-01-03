import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Zaratras extends Personaje
{
    private int cadru = 0;
    public  int nrIntalnirePlayer;
    private int nrImgAnimIdle = 0;
    private int nrRandAnimIdle = 0;
    private Actor player;
    private boolean afisatText = false;
    private boolean interactWith_E = false;
    private boolean interactOneTime = false;
    int timpintreReplici = 275;
    public int startR,finishR; 
    public void act() 
    {
        //daca termina primul dialog,playerul se va putea misca din nou
        if(Dialog.replicaCurenta == finishR + 1 && Dialog.apDialogPublic==Replici.replici)            
            Player.blocareMiscare = false;
        
        //in functie de scena in care se intalnesc va avea un dialog diferit    
        switch(nrIntalnirePlayer)
        {
            case 1:
                startR=0;
                finishR=4;
                break;
            case 2:
                startR=5;
                finishR=16;
                break; 
            case 4:
                startR=17;
                finishR=22;
                break;
            
        }
        boolean adaugat = false;
        
        //se afiseaza un mesaj cand colizioneaza cu playerul pentru a avea loc dialogul
        VerifColPlayer();
        if(Greenfoot.isKeyDown("E") && interactWith_E && !interactOneTime)
        {
            interactWith_E = false;
            interactOneTime = true;
            Player.blocareMiscare = true;
            getWorld().removeObjects(getWorld().getObjects(TextPerm.class)); //sterge instructiunea "Apasa E pentru a interactiona"
            if(!adaugat)
            {
                getWorld().addObject(new Dialog(startR,finishR,timpintreReplici,Replici.replici),500,450); //apare dialogul
                adaugat = true;
            }
                       
        }
        
        //se realizeaza efectul de parallax
        if(Greenfoot.isKeyDown("D") && !Player.animAtac && !Player.animAtacSus && Player.playerInCenter && !Player.blocareMiscare && 
            Control_Scene.scenaCurenta!= 5 && Control_Scene.scenaCurenta!= 7 && Control_Scene.scenaCurenta!= 8 && Control_Scene.scenaCurenta != 2
             && Control_Scene.scenaCurenta != 9)// && getWorld().getObjects(Player.class).get(0).getX()>=500)           
               setLocation(getX()-3,getY());            
        else if(Greenfoot.isKeyDown("A") && !Player.animAtac && !Player.animAtacSus && Player.playerInCenter && !Player.blocareMiscare && 
            Control_Scene.scenaCurenta!= 5 && Control_Scene.scenaCurenta!= 7 && Control_Scene.scenaCurenta!= 8 && Control_Scene.scenaCurenta != 2
             && Control_Scene.scenaCurenta != 9)// && getWorld().getObjects(Player.class).get(0).getX()<=getX())
               setLocation(getX()+3,getY()); 
            
        //Animatiile random pentru Idle
        if(nrRandAnimIdle<20)
            AnimatieIdle_RespSt();
            
        else if(nrRandAnimIdle>=20 && nrRandAnimIdle<26)
            AnimatieIdle_OchiSt();
            
        else if(nrRandAnimIdle>=26 && nrRandAnimIdle<30)
            AnimatieIdle_CapSt();
            
        else if(nrRandAnimIdle>=30 && nrRandAnimIdle<34)
            AnimatieIdle_ScarpinatSt();
            
        else if(nrRandAnimIdle>=34 && nrRandAnimIdle<37)
            AnimatieIdle_PalarieSt();
        
            
    }   
    
    //--------------
    
    public void VerifColPlayer()  
    {  
        
        player = getOneIntersectingObject(Player.class);
        if(player != null && !afisatText && !interactOneTime && Control_Scene.scenaCurenta!=10)
        {
            nrIntalnirePlayer = Control_Scene.scenaCurenta;
            interactWith_E = true;
            getWorld().addObject(new TextPerm("Apasa E pentru a interactiona" ,30, Color.WHITE,1,null), 500, 530);
            afisatText = true;               
        } 
        else if(player == null)
        {
            interactWith_E = false;
            getWorld().removeObjects(getWorld().getObjects(TextPerm.class));
            afisatText = false;
        }      
    }
    
    
    //-------------------ANIMATII IDLE------------
    //--------------------STANGA--------------------
    
    public void AnimatieIdle_RespSt()
    {
        if(cadru % 2 == 0)
        {
            
            setImage("Zaratras_IdleRespirat(" + nrImgAnimIdle + ")" + ".png");
            nrImgAnimIdle++;
            if(nrImgAnimIdle>29) 
            {
                nrImgAnimIdle = 0;
                nrRandAnimIdle = Greenfoot.getRandomNumber​(37);
            }
                
        }
        cadru++;
        if(cadru > 39)
            cadru = 0;
    }
    public void AnimatieIdle_OchiSt()
    {
        if(cadru % 2 == 0)
        {
            
            setImage("Zaratras_IdleOchi(" + nrImgAnimIdle + ")" + ".png");
            nrImgAnimIdle++;
            if(nrImgAnimIdle>59) 
            {
                nrImgAnimIdle = 0;
                nrRandAnimIdle = Greenfoot.getRandomNumber​(37);
            }
                
        }
        cadru++;
        if(cadru > 24)
            cadru = 0;
    }
    public void AnimatieIdle_CapSt()
    {
        if(cadru % 2 == 0)
        {
            
            setImage("Zaratras_IdleCap(" + nrImgAnimIdle + ")" + ".png");
            nrImgAnimIdle++;
            if(nrImgAnimIdle>59) 
            {
                nrImgAnimIdle = 0;
                nrRandAnimIdle = Greenfoot.getRandomNumber​(37);
            }
                
        }
        cadru++;
        if(cadru > 24)
            cadru = 0;
    }
    public void AnimatieIdle_ScarpinatSt()
    {
        if(cadru % 2 == 0)
        {
            
            setImage("Zaratras_IdleScarpinat(" + nrImgAnimIdle + ")" + ".png");
            nrImgAnimIdle++;
            if(nrImgAnimIdle>59) 
            {
                nrImgAnimIdle = 0;
                nrRandAnimIdle = Greenfoot.getRandomNumber​(37);
            }
                
        }
        cadru++;
        if(cadru > 24)
            cadru = 0;
    }
    public void AnimatieIdle_PalarieSt()
    {
        if(cadru % 2 == 0)
        {
            
            setImage("Zaratras_IdlePalarie(" + nrImgAnimIdle + ")" + ".png");
            nrImgAnimIdle++;
            if(nrImgAnimIdle>89) 
            {
                nrImgAnimIdle = 0;
                nrRandAnimIdle = Greenfoot.getRandomNumber​(37);
            }
                
        }
        cadru++;
        if(cadru > 24)
            cadru = 0;
    }
    
    //--------------------DREAPTA--------------------
}
