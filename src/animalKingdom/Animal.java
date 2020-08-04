package animalKingdom;

abstract class Animal
{

    protected static int maxId = 0;

    protected int id;
    protected String name;
    protected int year;

    public Animal(String name, int year)
    {

        maxId++;

        this.id = maxId;
        this.name = name;
        this.year = year;

    }

    abstract String move();
    abstract String breathe();
    abstract String reproduce();

    public String eat()
    {

        return name + " eats food.";

    }

    public int getId()
    {

        return id;

    }

    public String getName()
    {

        return name;

    }

    public int getYear()
    {

        return year;

    }

}