package VMTurbo.maze;

interface Place {
    // Return the adjacent Place in the given direction
    public Place goNorth();
    public Place goSouth();
    public Place goEast();
    public Place goWest();

    // Returns true only for the special "Wall" place
    public boolean isWall();

    // Returns true only for the special "Cheese" place
    public boolean isCheese();
};