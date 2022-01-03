import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Scena5_Lupta1_Padure extends World
{
    
    public static boolean exitOnLeft_s2;
    public Scena5_Lupta1_Padure()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
    }
    private void prepare()
    {
        
        setPaintOrder( Control_Scene.class, HealthBar_Lucio.class, HealthBar_King.class, TextTimp.class, FG0.class,Little_Guardian.class,Smoke.class, Player.class,Defeat_Effect.class,Vraja_Atac.class, Enemys.class, 
                            Personaje.class,Sol.class, BG0.class, BG1.class,FG1.class,BG2.class);
        
        HealthBar_Lucio hbL = new HealthBar_Lucio();
        addObject(hbL,150,40);
        
        
        
        Little_Guardian little_Guardian = new Little_Guardian();
        addObject(little_Guardian,900,483);
        
        
        Control_Scene control_Scene = new Control_Scene();
        Sol sol = new Sol();
        BG0 bg0 = new BG0();
        BG1 bg1 = new BG1();
        BG2 bg2 = new BG2();
        Player player = new Player();
        Player.atacInvatat = true;
        Player.blocareMiscare =true;
        
        addObject(control_Scene,500,300);
        addObject(sol,1990,593);
        addObject(bg0,1990,268);
        addObject(bg1,1990,288);
        addObject(bg2,1990,300);
        addObject(player,30,485);

        
        //INITIALIZARI:
        Little_Guardian.health = 100;
        Player.healthLucio = 100;
        Little_Guardian.idle = true;
        Control_Scene.scenaCurenta = 5;
        
        Dialog.replicaCurenta = 3;
        Player.faceRight = true;
        BG.bgAtLeftEdge = false;
        BG.bgAtRightEdge = false;
        
        BG1.limEdgeSt = 1989; //Cat de mult de poti duce in stanga -def 1999
        BG1.limEdgeDr = 1960; //Cat de mult de poti duce in dreapta -def 501

        //fg1.setImage(new GreenfootImage("LV1_BG1.png"));//muntii
        bg2.setImage(new GreenfootImage("LV2_BG2_CerNori.png"));
        bg1.setImage(new GreenfootImage("LV2_BG1_Padure.png"));
        bg0.setImage(new GreenfootImage("LV2_BG0_Copaci.png"));
        sol.setImage(new GreenfootImage("Sol1.png"));

    }
}
