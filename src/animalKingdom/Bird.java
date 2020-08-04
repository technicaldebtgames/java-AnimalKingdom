package animalKingdom;

public class Bird extends Animal 
{

    public Bird(String name, int year)
    {

        super(name, year);

    }

    @Override
    public String move()
    {

        return "fly";

    }

    @Override
    public String breathe()
    {

        return "lungs";

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