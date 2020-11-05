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
<<<<<<< HEAD
        addObject(seal,83,214);
=======
        addObject(seal,357,248);
<<<<<<< HEAD
        Cactus cactus = new Cactus();
        addObject(cactus,46,129);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,504,114);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,127,326);
        Cactus cactus4 = new Cactus();
        addObject(cactus4,438,314);
        Cactus cactus5 = new Cactus();
        addObject(cactus5,264,122);
=======
>>>>>>> b0b22f3a5b10cd52a8451a37d3d947c7b2ce01bd
>>>>>>> 9a3340e1aa485ef53a7836bbedabab81ef2082f7
    }
}
