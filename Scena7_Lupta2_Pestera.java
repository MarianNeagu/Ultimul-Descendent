import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Scena7_Lupta2_Pestera extends World
{
    public Scena7_Lupta2_Pestera()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        setPaintOrder( Control_Scene.class,HealthBar_Lucio.class, HealthBar_Bat1.class, HealthBar_Bat2.class, Smoke.class, Player.class,Bat.class,PowerBall.class,Vraja_Atac.class, Enemys.class); 
        
        BG.bgAtRightEdge = true;
        BG.bgAtLeftEdge = true;
        Bat bat1 = new Bat();
        Bat bat2 = new Bat();
        addObject(bat1,450,50);
        addObject(bat2,600,50);
        Player player = new Player();
        addObject(player,215,440);
        Control_Scene control_Scene = new Control_Scene();
        addObject(control_Scene,500,300);
        Player.atacInvatat = true;
        Control_Scene.scenaCurenta = 7;
        Player.faceRight = true;
        
        HealthBar_Lucio hbL = new HealthBar_Lucio();
        addObject(hbL,150,570);
        
        HealthBar_Bat1 hbB1 = new HealthBar_Bat1();
        addObject(hbB1,Bat.xBat1,140);
        
        HealthBar_Bat2 hbB2 = new HealthBar_Bat2();
        addObject(hbB2,Bat.xBat2,140);
        
        Bat.health1 = 100;
        Bat.health2 = 100;

    }
}
