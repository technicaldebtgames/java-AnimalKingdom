package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main 
{

    public static void main(String[] args)
    {

        System.out.println("Animal Kingdom Start -->");
        
        List<Animal> animalList = new ArrayList<>(
            List.of(new Mammal("Panda", 1869),
                    new Mammal("Zebra", 1778),
                    new Mammal("Koala", 1816),
                    new Mammal("Sloth", 1804),
                    new Mammal("Armadillo", 1758),
                    new Mammal("Raccoon", 1758),
                    new Mammal("Bigfoot", 2021),
                    new Bird("Pigeon", 1837),
                    new Bird("Peacock", 1821),
                    new Bird("Toucan", 1758),
                    new Bird("Parrot", 1824),
                    new Bird("Swan", 1758),
                    new Fish("Salmon", 1758),
                    new Fish("Catfish", 1817),
                    new Fish("Perch", 1758))
        );

        System.out.println("<-- Animal Kingdom End");

    }

}