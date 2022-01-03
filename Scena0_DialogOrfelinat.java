import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Scena0_DialogOrfelinat extends World
{

    
    public Scena0_DialogOrfelinat()
    {            
        super(1000, 600, 1, false); //booleanul e pentru "bounded" din constructorul World
        prepare();
    }
    private void prepare()
    {   
        //initializare lume
        // cel mai aproape -> cel mai departe
        setPaintOrder(Control_Scene.class, TextTimp.class, TextPerm.class, FG1.class,  FG0.class,Sol.class, BG0.class, BG1.class,BG2.class);
                        
        Control_Scene control_Scene = new Control_Scene();
        addObject(control_Scene,500,300);
                        
        Sol sol = new Sol();
        
        //Sprinter sprinter = new Sprinter();
        
        BG0 bg0 = new BG0();
        BG1 bg1 = new BG1();
        BG2 bg2 = new BG2();
        FG0 fg0 = new FG0();
        FG1 fg1 = new FG1();
        DialogCasa dc = new DialogCasa();
        Control_Scene cs = new Control_Scene();
        
        addObject(dc,500,300);
        addObject(sol,1900,593);
        addObject(bg0,1930,355); 
        addObject(bg1,500,310);
        addObject(bg2,500,300);
        addObject(fg0,1715,403);
        
        bg2.setImage(new GreenfootImage("LV1_BG2.png"));
        bg1.setImage(new GreenfootImage("LV1_BG1.png"));
        bg0.setImage(new GreenfootImage("LV1_BG0.png"));//orasul impreuna cu layerul cu deal si case
        fg0.setImage(new GreenfootImage("FG0.png"));
        //fg1.setImage(new GreenfootImage("FG1.png"));
        sol.setImage(new GreenfootImage("Sol1.png"));        
        Dialog.replicaCurenta=0;
    }
    
}
