import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Scena4_Padure2 extends World
{
    
    public static boolean exitOnLeft_s2;
    public Scena4_Padure2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1,false);
        prepare();
    }
    private void prepare()
    {
        
        setPaintOrder( Control_Scene.class,NotificareAtac.class, TextPerm.class, Inventar.class, TextTimp.class, FG0.class,Smoke.class, 
                        Player.class,Vraja_Atac.class, Enemys.class, Personaje.class,Sol.class, BG0.class, BG1.class,FG1.class,BG2.class);
        
        
            
                        
        Control_Scene control_Scene = new Control_Scene();
        Sol sol = new Sol();
        BG0 bg0 = new BG0();
        BG1 bg1 = new BG1();
        BG2 bg2 = new BG2();
        Player player = new Player();
        Zaratras zaratras = new Zaratras();
        NotificareAtac na = new NotificareAtac();
        addObject(na,860,-70);
        
        addObject(control_Scene,500,300);
        addObject(sol,1400,593);
        addObject(bg0,1400,268);
        addObject(bg1,1596,288);
        addObject(bg2,1799,300);
        addObject(player,480,485);
        addObject(zaratras,600,406);
        
        //INITIALIZARI:

        Control_Scene.scenaCurenta = 4;
        Player.atacInvatat = true;
        BG.bgAtLeftEdge = false;
        BG.bgAtRightEdge = false;
        
        BG1.limEdgeSt = 1595; //Cat de mult de poti duce in stanga -def 1999
        BG1.limEdgeDr = 1000; //Cat de mult de poti duce in dreapta -def 501

        //fg1.setImage(new GreenfootImage("LV1_BG1.png"));//muntii
        bg2.setImage(new GreenfootImage("LV2_BG2_CerNori.png"));
        bg1.setImage(new GreenfootImage("LV2_BG1_Padure.png"));
        bg0.setImage(new GreenfootImage("LV2_BG0_Copaci.png"));
        sol.setImage(new GreenfootImage("Sol1.png"));

    }
}
