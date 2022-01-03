    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    import java.util.List;   
    public class Bat extends Enemys
    {
       private int side = -1,cadru=0,nrImg=0,timer=0,velocity=1,sleepTime=0,alfa=255,delayDamagePlayer=18,health=100,instanceNumber=-1;
       private boolean isDead=false,sleep=true;   
       Actor vrajaActor;
       public static int xBat1, xBat2,health1, health2;       
        public void act() 
        { 
            if(instanceNumber == 1)
            {
                xBat1 = getX(); 
                health1 = health;
            }
                
            else 
            {
                xBat2 = getX();
                health2 = health;
            }
            
            if(getImage().getTransparency() > 0) //daca nu e transparent inseamna ca nu a fost sters
       {
                        if(instanceNumber == -1 && getX() >=500) //se alege instanta in functie de pozitia sa pe x
                    {
                        instanceNumber = 1; //dreapta
                    }
                    else if(instanceNumber == -1 && getX() <=500)
                            instanceNumber = 0; //stanga
                              
                List vraja = getObjectsInRange(70,Vraja_Atac.class); //testeaza daca atinge vreo instanta a clasei Vraja_atac in raza de 70
                vrajaActor = getOneIntersectingObject(Vraja_Atac.class);
                
               if (!vraja.isEmpty() && delayDamagePlayer==18 )
                    {
                        health -= 10; //poate lua damage o data la 18 frame-uri
                        delayDamagePlayer -=1;
                        getWorld().removeObject(vrajaActor); //se sterge instanta cu care colizioneaza
                    }
                else if(delayDamagePlayer < 18 && delayDamagePlayer > 0 )
                    delayDamagePlayer --;
                else if(delayDamagePlayer <= 0)
                    delayDamagePlayer = 18;
                    
                if(velocity == 0)
                {
                    getImage().setTransparency​(alfa); //daca nu se mai misca inseamna ca a murit si poate deveni transparent
                    if(alfa>0)
                    alfa-=3;
                }
                    if(sleepTime<=300)
                        sleepTime++;
                    else
                        sleep=false;
                if(sleep == false) //daca nu e la inceputul nivelului
                {                         
                       if( health <=0) //daca moare
                       {
                           isDead=true; 
                           side= -1;//opreste animatia de zbor   
                           cadru=0;
                           nrImg=0;
                       }
                       if(isDead==true)
                       {
                          setImage("Bat_death" + ".png"); 
                          if(velocity>0)
                          setLocation(getX(), getY() + 5 );                  
                          if(velocity == 0)
                                {
                                    getImage().setTransparency(alfa);
                                    if(alfa>0)
                                    alfa--;
                                }                          
                       }
                       
                   //Aici se testeaza din care parte porneste: 0-stanga,1-dreapta    
                   if(side==-1 && getX() < 500 && isDead==false) 
                     side = 0;
                   else if (side == -1 && getX() > 500 && isDead==false)
                     side = 1;
                     
                   //se realizeaza animatia de zbor in functie de pozitia pe x  
                   if(side == 0 && isDead==false ) 
                   {
                       setLocation(getX() + 3, getY());
                       AnimatieDreapta();
                    }           
                   else if(side == 1 && isDead==false )
                   {
                       setLocation(getX() -3, getY());
                       AnimatieStanga();
                   }
                   //daca ajunge la margine schimba animatia de zbor
                   if(isAtEdge() && side ==0) 
                     side=1;
                   else if(isAtEdge() && side ==1) 
                     side=0;
                   if(timer == 0 && isDead==false)
                   {
                        //alege un numar intre 50 si 110 frame-uri pentru a spawna o minge de forta
                        timer =  getRandomNumber(50,120);
                        PowerBall powerBall = new PowerBall();
                        int pos_x = getX();
                        int pos_y = getY() + 30;
                        getWorld().addObject(powerBall,pos_x,pos_y);                
                    }
                    else
                    timer --;  
                    if(getY() >= 430 && isDead==true)
                      velocity=0;
           }
            else
            setImage("Bat_sleep" + ".png");      
        }
          else
            getWorld().removeObject(this);
               
    } 
     private void AnimatieDreapta()
    {
        if(cadru % 5 == 0)
        {        
            setImage("Bat_" + nrImg + ".png");
            nrImg++;
            if(nrImg>3)
                nrImg = 0;           
        }
        cadru++;
        if(cadru>24)
        cadru=0;
    }
    private void AnimatieStanga()
    {
        if(cadru % 5 == 0)
        {        
            setImage("Bat_" + nrImg + ".png");
            getImage().mirrorHorizontally();
            nrImg++;
            if(nrImg>3)
                nrImg = 0;
            
        }
        cadru++;
        if(cadru>24)
        cadru=0;
    }
    public int getRandomNumber(int start,int end) //ne ajuta sa alegem un numar random dintr-un interval ales
  {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
  }
}
