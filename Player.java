import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player extends Actor
{
    
    public static boolean faceRight = true;
    private int cadru = 0;
    private int nrImgAnimMers;
    private int nrImgAnimIdle;
    private int nrImgAnimAtac;
    public static boolean playerInCenter; //se va initializa in fiecare World in functie de pozitia de inceput
    public static boolean isAtLeftEdge = false; // sa nu se confunde cu bgAtLeftEdge, care este diferit
    public static boolean isAtRightEdge = false;
    public static boolean animAtac=false; //animatie atac in fata (orizonal)
    public static boolean animAtacSus=false;
    private boolean atacVraja=false;
    private int delayAtac=0;
    private boolean pressedSpace=false;
    private boolean pressedF=false;
    public static int directieAtac=0; // 0 - orizontal, 1 - vertical
    private int cadruFade;
    public static boolean blocareMiscare=false, atacInvatat=false;    
    private int cadru2=0,frame=0;
    public static int healthLucio = 100;
    //shift
    private int delayDash =0,delayDefeat=100;
    private boolean shiftApasat = false, laSfarsit = false;   
    public void act() 
    {        
        
        //se afiseaza dialogul de la sfarsitul jocului
        if(Control_Scene.scenaCurenta == 10 && getX() == 600 && !laSfarsit)
        {
            laSfarsit = true;
            blocareMiscare = true;
            getWorld().addObject(new Dialog(32,45,270,Replici.replici),500,450);
        }
        //se afiseaza creditele de sfarsit
        if(Dialog.replicaCurenta == 46)//end credits
        {
            Greenfoot.setWorld(new End_Credits());
        }
        
        //se restrictioneaza miscarea in functie de terminarea dialogului
        if(Control_Scene.scenaCurenta == 9 && Dialog.replicaCurenta == 18)
            blocareMiscare = false;
        //daca au fost eliminati toate instantele clasei respective se poate trece in scena urmatoare    
        if(getWorld().getObjects(Bat.class).size() == 0 && getX() >= 950 && Control_Scene.scenaCurenta == 7)
            Greenfoot.setWorld(new Scena8_PadureNoapte1());
        if(Control_Scene.scenaCurenta == 9 &&  getWorld().getObjects(Evil_Wizard.class).size() == 0 && getX() >= 950)    
            Greenfoot.setWorld(new Scena10_Cimitir());
        
        //daca playerul ramane fara viata,monstrul nu va putea ataca si dupa un numar de pasi va intra in meniul de restart    
        if(healthLucio <= 0 && Control_Scene.scenaCurenta == 5 && delayDefeat >= 100)
        {
            delayDefeat --;
            Little_Guardian.idle = true;
            blocareMiscare = true;
        }
        else if(healthLucio <= 0 && Control_Scene.scenaCurenta == 5 && delayDefeat > 0)
            delayDefeat --;        
        else if(delayDefeat==0 && healthLucio <=0 && Control_Scene.scenaCurenta == 5  )
            Greenfoot.setWorld(new MeniuRestart());            
            if(healthLucio <= 0 && Control_Scene.scenaCurenta == 7 && delayDefeat >= 100)
        {
            delayDefeat --;            
            blocareMiscare = true;
        }
        else if(healthLucio <= 0 && Control_Scene.scenaCurenta == 7 && delayDefeat > 0)
            delayDefeat --;        
        else if(delayDefeat==0 && healthLucio <=0 && Control_Scene.scenaCurenta == 7  )
            Greenfoot.setWorld(new MeniuRestart());            
            if(healthLucio <= 0 && Control_Scene.scenaCurenta == 9 && delayDefeat >= 100)
        {
            delayDefeat --;
            blocareMiscare = true;
        }
        else if(healthLucio <= 0 && Control_Scene.scenaCurenta == 9 && delayDefeat > 0)
            delayDefeat --;        
        else if(delayDefeat==0 && healthLucio <=0 && Control_Scene.scenaCurenta == 9  )            
                Greenfoot.setWorld(new MeniuRestart());
         
        //are loc efectul de iesire din orfelinat         
        if(Control_Scene.scenaCurenta == 1 && cadruFade<255 && getX()<500)
        {
            setImage("d_Armature_Idle(0).png");
            cadruFade+=5;
            getImage().setTransparency(cadruFade);
            blocareMiscare = true; 
        }
        else if(Control_Scene.scenaCurenta !=1&& cadruFade<255 )
            cadruFade=255;
        if(cadruFade==255 && Control_Scene.scenaCurenta != 5 && Control_Scene.scenaCurenta != 9 )
        {
            blocareMiscare = false;
            cadruFade=256;
        }
      
        //restrictionarea abilitatii de Dash doar in scenele de lupta
        if(Greenfoot.isKeyDown("SHIFT") && !shiftApasat && !blocareMiscare && Control_Scene.scenaCurenta == 5 || 
        Greenfoot.isKeyDown("SHIFT") && !shiftApasat && !blocareMiscare && Control_Scene.scenaCurenta == 7 || 
        Greenfoot.isKeyDown("SHIFT") && !shiftApasat && !blocareMiscare && Control_Scene.scenaCurenta == 9 )
        {
            if(faceRight && delayDash<=0)                            
                setLocation(getX()+150,getY());                            
            else if(!faceRight && delayDash<=0)             
                    setLocation(getX()-150,getY());                         
            shiftApasat = true;
        }
        //restrictionarea abilitatii pe un interval de timp
        if(shiftApasat)
        {
            delayDash++;
            if(delayDash==30)
            {
                delayDash = 0;
                shiftApasat = false;
            }
                
        }
     
        
            //-------------DEPLASARE---------------------//
        if(blocareMiscare == false)
        {
            if(Greenfoot.isKeyDown("D") && !isAtRightEdge && !animAtac && !animAtacSus && !blocareMiscare) //a doua conditie - pentru cazul in care te afli la limita lumilor
            {
                if(BG.bgAtRightEdge || BG.bgAtLeftEdge) // Daca a ajuns la marginea scenei nu se mai misca bg-ul, ci playerul 
                    move(3);
                AnimatieMersDreapta();
                if(cadru2%3==0)
                {                    
                    Smoke smoke = new Smoke(0,frame); 
                    getWorld().addObject(smoke,getX() - 40,getY() + 75);
                    frame++;
                    if(frame>5)
                    frame=0;
                }
                cadru2++;
                if(cadru2>26)
                cadru2=0;
                faceRight = true;
                if(isAtLeftEdge)
                    isAtLeftEdge = false;
            }
            else if(Greenfoot.isKeyDown("A") && !isAtLeftEdge && !animAtac && !animAtacSus && !blocareMiscare)
            {
                if(BG.bgAtLeftEdge || BG.bgAtRightEdge)
                    move(-3);
                AnimatieMersStanga();
                if(cadru2%3==0)
                {              
                    Smoke smoke = new Smoke(1,frame);
                    getWorld().addObject(smoke,getX() + 40,getY() + 75);
                    frame++;
                    if(frame>5)
                    frame=0;
                        
                }
                cadru2++;
                if(cadru2>26)
                cadru2=0;
                faceRight = false;
                if(isAtRightEdge)
                    isAtRightEdge = false;
            }
        }
        
        //-------------/DEPLASARE---------------------//
        
        
        
        //-------------REINITIALIZARE CADRU ANIM---------------------//    
        if(faceRight && !Greenfoot.isKeyDown("D") && !Greenfoot.isKeyDown("A") && !animAtac && !animAtacSus && cadruFade>=255)
        {
            nrImgAnimMers = 0;
            AnimatieIdleDreapta();
        }
        
        if(!faceRight && !Greenfoot.isKeyDown("D") && !Greenfoot.isKeyDown("A") && !animAtac && !animAtacSus && cadruFade>=255)
        {
            nrImgAnimMers = 0;
            AnimatieIdleStanga();
        }
        //-------------/REINITIALIZARE CADRU ANIM---------------------//
        
        //-------------VERIFICARE CENTRARE PLAYER---------------------//        
        if(getX()>=498 && getX()<=502) //498, 502
            playerInCenter = true;
        else playerInCenter = false;

        //-------------/VERIFICARE CENTRARE PLAYER---------------------//
            
        
        //-------------VERIFICARE PLAYER LA MARGINE---------------------//
        //Jocul fiind liniar,  nu poti continua deplasarea in partea stanga (exista coliziune), 

        if(getX() <= 30 && Control_Scene.scenaCurenta != 5 
            && Control_Scene.scenaCurenta != 7
            && Control_Scene.scenaCurenta != 9) 
                isAtLeftEdge = true;
        else isAtLeftEdge = false;
        
       
        
        // cazul de margine dreapta al ultimei scene
        if(getX() >= 1030) // 
            isAtRightEdge = true;
        else isAtRightEdge = false;
        
        //-------------/VERIFICARE PLAYER LA MARGINE---------------------//

        //-------------ATAC---------------------//
        switch(directieAtac)
        {
            //schimbarea directiei de atac
            case 0:
                if(Greenfoot.isKeyDown("F") && !pressedF)
                {
                    directieAtac=1;
                    pressedF=true;
                    break;
                }
            case 1:
                if(Greenfoot.isKeyDown("F") && !pressedF)
                {
                    directieAtac=0;
                    pressedF=true;
                    break;
                }

        }
        if(!Greenfoot.isKeyDown("F"))
            pressedF=false;
        //atac           
        if(blocareMiscare == false)
        {
           if(Greenfoot.isKeyDown("SPACE") && !pressedSpace && atacInvatat)
           {
               GreenfootSound tragereS = new GreenfootSound("Tragere.wav");
               tragereS.play();
                if(directieAtac==0)
                    animAtac=true;
                else if (directieAtac==1)
                    animAtacSus=true;
                pressedSpace=true;
                
                atacVraja=true;
            }
            
            if(atacVraja)
                Atac();
                
            if(animAtac)
                AnimatieAtacFata();
              
            if(animAtacSus)
                AnimatieAtacSus();
            
            if(pressedSpace)
            {
                delayAtac++;
                if(delayAtac>60)
                {
                    delayAtac=0;
                    pressedSpace=false;
                    
                }
            } 
        }
        
        //-------------/ATAC---------------------//
        
        
        
        
        
    }

    //-------------ATAC---------------------//
    public void Atac()
    {
        Vraja_Atac vraja = new Vraja_Atac();
        atacVraja=false;
        if(directieAtac==0)
        {
            if(faceRight)
            getWorld().addObject(vraja, getX() + 80, getY());
            else
            {
                getWorld().addObject(vraja, getX() - 80, getY());
                vraja.setRotation(180);
            }   
        }
        else if(directieAtac==1)
            {
                vraja.setRotation(-90);
                if(faceRight)
                    getWorld().addObject(vraja, getX() + 15, getY()-100);
                else
                    getWorld().addObject(vraja, getX() -15, getY()-100);
                
            } 
            
    }
    //-------------/ATAC---------------------//
    

    //-------------Animatii---------------------//
    public void AnimatieAtacSus()
    {

        if(cadru % 1 == 0)
        {
            setImage("Lucio_Atac_Sus(" + nrImgAnimAtac + ")" + ".png");
            if(!faceRight)
                getImage().mirrorHorizontally();

            nrImgAnimAtac++;
            
        }
        cadru+=2;
        if(cadru > 30)
            cadru = 0;
        if(nrImgAnimAtac>20)
        {
            animAtacSus=false;
            nrImgAnimAtac=0;  
        }  
    }
    public void AnimatieAtacFata()
    {

        if(cadru % 1 == 0)
        {
            setImage("d_Armature_Atac_Bagheta(" + nrImgAnimAtac + ")" + ".png");
            if(!faceRight)
                getImage().mirrorHorizontally();

            nrImgAnimAtac++;
            
        }
        cadru++;
        if(cadru > 30)
            cadru = 0;
        if(nrImgAnimAtac>24)
        {
            animAtac=false;
            nrImgAnimAtac=0;  
        }    
    }
    

    public void AnimatieIdleDreapta()
    {
        if(cadru % 6 == 0)
        {
            
            setImage("d_Armature_Idle(" + nrImgAnimIdle + ")" + ".png");
            nrImgAnimIdle++;
            if(nrImgAnimIdle>24) 
                nrImgAnimIdle = 0;
        }
        cadru++;
        if(cadru > 60)
            cadru = 0;
    }
    
    public void AnimatieIdleStanga()
    {
        if(cadru % 6 == 0)
        {
            
            setImage("d_Armature_Idle(" + nrImgAnimIdle + ")" + ".png");
            getImage().mirrorHorizontally();
            nrImgAnimIdle++;
            if(nrImgAnimIdle>24) 
                nrImgAnimIdle = 0;
        }
        cadru++;
        if(cadru > 60)
            cadru = 0;
    }
    
    public void AnimatieMersDreapta()
    {
        if(cadru % 2 == 0)
        {
            setImage("d_Armature_Alergat(" + nrImgAnimMers + ")" + ".png");
            nrImgAnimMers++;
            if(nrImgAnimMers>29)
                nrImgAnimMers = 0;
        }
        cadru++;
        if(cadru > 65)
            cadru = 0;
    }
    
    public void AnimatieMersStanga()
    {
        if(cadru % 2 == 0)
        {
            setImage("d_Armature_Alergat(" + nrImgAnimMers + ")" + ".png");
            getImage().mirrorHorizontally();
            nrImgAnimMers++;
            if(nrImgAnimMers>29)
               nrImgAnimMers = 0;
        }
        cadru++;
        if(cadru > 65)
            cadru = 0;
    }
    //-------------/Animatii---------------------//

}
