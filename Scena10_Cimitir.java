import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Scena10_Cimitir extends World
{
    

    public Scena10_Cimitir()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1, false);
        prepare();
    }
    private void prepare()
    {
        
        setPaintOrder( Control_Scene.class, TextPerm.class, Inventar.class, TextTimp.class, FG1.class,  FG0.class,Smoke.class, 
                        Player.class,Vraja_Atac.class, Enemys.class, Personaje.class,Sol.class, BG0.class, BG1.class,BG2.class);
        
        
            
                        
        Control_Scene control_Scene = new Control_Scene();
        addObject(control_Scene,500,300);
        
        Sol sol = new Sol();
        
        Player.atacInvatat = true;
        BG0 bg0 = new BG0();
        
        
        BG1 bg1 = new BG1();
        Zaratras zaratras = new Zaratras(); 
        
        BG2 bg2 = new BG2();
       
        
        /*FG0 fg0 = new FG0();
        addObject(fg0,500,481);
        
        FG1 fg1 = new FG1();
        addObject(fg1,500,370);*/
        
        Player player = new Player();
        
         // pe x mai mult de -30 ca sa nu se reintoarca in scena anterioara
        
        BG.bgAtLeftEdge = false;
        BG.bgAtRightEdge = false;
        
        addObject(zaratras,1600,406);
        addObject(sol,1000,593);
        addObject(bg0,1000,300);
        addObject(bg1,1000,368);
        addObject(bg2,1000,300);
        addObject(player,30,485);
        BG1.limEdgeSt = 999; //Cat de mult de poti duce in stanga -def 1999
        BG1.limEdgeDr = 400; //Cat de mult de poti duce in dreapta -def 501
        
        
        
        
        
        //INITIALIZARI:
        
        Control_Scene.scenaCurenta = 10;
        
         bg2.setImage(new GreenfootImage("LV3_BG2_CerNori.png"));
        bg1.setImage(new GreenfootImage("LV3_BG1_PadureNoaptea.png"));
        bg0.setImage(new GreenfootImage("LV3_BG0_CopaciNoaptea.png"));
        sol.setImage(new GreenfootImage("Sol1.png"));

    }
}
