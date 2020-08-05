package animalKingdom;

public class Fish extends Animal 
{

    public Fish(String name, int year)
    {

        super(name, year);

    }

    @Override
    public String move()
    {

        return "swim";

    }

    @Override
    public String breathe()
    {

        return "gills";

    }

    @Override
    public String reproduce()
    {

        return "eggs";

    }

    @Override
    public String toString()
    {

        return id + " " + name + " " + year + " " + this.move() + " " + this.breathe() + " " + this.reproduce();

    }

}