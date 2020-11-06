import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sand extends World
{

    /**
     * Constructor for objects of class Sand.
     * 
     */
    public Sand()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        seal seal = new seal();

        addObject(seal,83,214);

        addObject(seal,357,248);

        Cactus cactus = new Cactus();
        addObject(cactus,346,148);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,357,311);
    }
}
