import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scena3_TrainingLucio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scena3_TrainingLucio extends World
{

    /**
     * Constructor for objects of class Scena3_TrainingLucio.
     * 
     */
    public Scena3_TrainingLucio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    private void prepare()
    {
        setPaintOrder(TextPerm.class,Control_Scene.class,TextTimp.class,Vraja_Atac.class, Ciuperca.class,Trigger.class, ManaLucio.class, BG0.class,BG1.class, BG2.class);
        BG0 bg0 = new BG0();
        BG1 bg1 = new BG1();
        BG2 bg2 = new BG2();
        ManaLucio ml = new ManaLucio();
        Trigger trigger = new Trigger();
        Control_Scene cs = new Control_Scene();
        
        
        Ciuperca ciuperca = new Ciuperca();        
        addObject(ciuperca,500,300);
        addObject(cs,500,300);
        addObject(trigger,450,140);
        Player.atacInvatat = false;
        addObject(bg0,500,300);
        addObject(bg1,500,230);
        addObject(bg2,500,300);
        addObject(ml,500,540);
        Control_Scene.scenaCurenta = 3;
        
        bg2.setImage(new GreenfootImage("LV1_BG2.png"));
        bg1.setImage(new GreenfootImage("LV1_BG1.png"));
        bg0.setImage(new GreenfootImage("TrainingBG.png"));
        
        Dialog.replicaCurenta=23;
        Trigger.atins = false;
        ManaLucio.canShoot = false;
        ManaLucio.varAleasa = -1;
    }
}
