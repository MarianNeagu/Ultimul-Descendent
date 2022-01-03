import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Scena9_Lupta3_PadNoapte extends World
{
    

    public Scena9_Lupta3_PadNoapte()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
    }
    private void prepare()
    {
        
        setPaintOrder( Control_Scene.class,HealthBar_Lucio.class, HealthBar_King.class, TextPerm.class,  TextTimp.class, FG1.class,  FG0.class,Smoke.class, 
                        Player.class,MagicBullet.class,Evil_Wizard.class,Defeat_Effect.class,Vraja_Atac.class, Enemys.class, Personaje.class,Sol.class, BG0.class, BG1.class,BG2.class);
                                                    
        Control_Scene control_Scene = new Control_Scene();
        addObject(control_Scene,500,300);
        
        Evil_Wizard evil_Wizard = new Evil_Wizard();
        addObject(evil_Wizard,880,440);
        
        Sol sol = new Sol();
        
        Player.atacInvatat = true;
        BG0 bg0 = new BG0();
        
        
        BG1 bg1 = new BG1();
        
        Player.blocareMiscare = true;
        Dialog.replicaCurenta = 16;
        BG2 bg2 = new BG2();
       
        
        /*FG0 fg0 = new FG0();
        addObject(fg0,500,481);
        
        FG1 fg1 = new FG1();
        addObject(fg1,500,370);*/
        
        Player player = new Player();
        Evil_Wizard.health = 150;
         // pe x mai mult de -30 ca sa nu se reintoarca in scena anterioara
        
        HealthBar_Lucio hbL = new HealthBar_Lucio();
        addObject(hbL,150,40);
        
        addObject(sol,2000,593);
        addObject(bg0,2000,300);
        addObject(bg1,2000,368);
        addObject(bg2,2000,300);
        addObject(player,30,485);
        BG1.limEdgeSt = 1999; //Cat de mult de poti duce in stanga -def 1999
        BG1.limEdgeDr = 2000; //Cat de mult de poti duce in dreapta -def 501
        
        
        
        
        
        //INITIALIZARI:
        
        Control_Scene.scenaCurenta = 9;
        
        Player.faceRight = true;
        
        
        bg2.setImage(new GreenfootImage("LV3_BG2_CerNori.png"));
        bg1.setImage(new GreenfootImage("LV3_BG1_PadureNoaptea.png"));
        bg0.setImage(new GreenfootImage("LV3_BG0_CopaciNoaptea.png"));
        sol.setImage(new GreenfootImage("Sol1.png"));

    }
}
