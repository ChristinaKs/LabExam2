import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreenWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreenWorld extends SimulationWorld
{
    GreenfootSound music;
    /**
     * Constructor for objects of class StartScreenWorld.
     * 
     */
    public StartScreenWorld()
    {        
        super("",  800, 600, new Point2D(0.0, 0.0), 10);
        music = new GreenfootSound("startMenu.wav");
        setMusic(music);
    }

    public void act()
    {
        transitionToGameCatchWorld();
        

    }

    public void transitionToGameCatchWorld()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            transitionToWorld(new CatchWorld());
        }
    }
}
