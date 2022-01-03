import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar_King here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar_King extends UI
{
    /**
     * Act - do whatever the HealthBar_King wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //update in timp real al statusului vietii actorului
        if(Control_Scene.scenaCurenta==5)
        {
            if(Little_Guardian.health <= 100 && Little_Guardian.health > 90)
                setImage("HealthKing8.png");
            else if(Little_Guardian.health <= 90 && Little_Guardian.health > 80)
                setImage("HealthKing7.png");
            else if(Little_Guardian.health <= 80 && Little_Guardian.health > 70)
                setImage("HealthKing6.png");
            else if(Little_Guardian.health <= 70 && Little_Guardian.health > 60)
                setImage("HealthKing5.png");
            else if(Little_Guardian.health <= 60 && Little_Guardian.health > 50)
                setImage("HealthKing4.png");
            else if(Little_Guardian.health <= 50 && Little_Guardian.health > 40)
                setImage("HealthKing3.png");
            else if(Little_Guardian.health <= 40 && Little_Guardian.health > 30)
                setImage("HealthKing2.png");
            else if(Little_Guardian.health <= 30 && Little_Guardian.health > 10)
                setImage("HealthKing1.png");
            else setImage("HealthKing0.png");
               
        }
        else if(Control_Scene.scenaCurenta==9)
        {
            if(Evil_Wizard.health <= 150 && Evil_Wizard.health > 130)
                setImage("HealthKing8.png");
            else if(Evil_Wizard.health <= 130 && Evil_Wizard.health > 110)
                setImage("HealthKing7.png");
            else if(Evil_Wizard.health <= 110 && Evil_Wizard.health > 90)
                setImage("HealthKing6.png");
            else if(Evil_Wizard.health <= 90 && Evil_Wizard.health > 70)
                setImage("HealthKing5.png");
            else if(Evil_Wizard.health <= 70 && Evil_Wizard.health > 50)
                setImage("HealthKing4.png");
            else if(Evil_Wizard.health <= 50 && Evil_Wizard.health > 30)
                setImage("HealthKing3.png");
            else if(Evil_Wizard.health <= 30 && Evil_Wizard.health > 20)
                setImage("HealthKing2.png");
            else if(Evil_Wizard.health <= 20 && Evil_Wizard.health > 10)
                setImage("HealthKing1.png");
            else setImage("HealthKing0.png");
        }
    }    
}
