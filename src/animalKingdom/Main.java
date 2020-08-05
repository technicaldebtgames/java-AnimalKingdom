package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main 
{

    private static List<Animal> filterAnimal(List<Animal> animals, CheckAnimal tester)
    {

        // temp animal list to hold passed animals
        List<Animal> tempAnimalList = new ArrayList<>();

        // for each animal run the test passed in tester object
        for(Animal a : animals)
        {

            // if test passes add animal to temp list
            if(tester.test(a))
            {

                tempAnimalList.add(a);

            }

        }

        // we are done now so return the temp list of animals that passed test
        return tempAnimalList;

    }

    public static void main(String[] args)
    {

        System.out.println("Animal Kingdom Start -->");
        
        // init animal array... err... list... uhh... arraylist...
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

        /*
        System.out.println("\n\n\nSort list -->");

        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach((v) -> System.out.println(v.getName()));

        System.out.println("\nShow only neg fuel levels and sort by fuel level -->");

        List<AbstractVehicle> filteredList = filterVehicle(myList, v -> v.getFuelLevel() < 0);
        filteredList.sort((v1, v2) -> v1.getFuelLevel() - v2.getFuelLevel());
        filteredList.forEach((v) -> System.out.println(v.toString()));

        System.out.println("\nShow only pos fuel levels for horses -->");

        filteredList = filterVehicle(myList, v -> (v.getFuelLevel() > 0) && (v instanceof HorseFromVehicle));
        filteredList.forEach((v) -> System.out.println(v));
        */

        System.out.println("\n\nAnimals, descending order by year -->");

        animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        System.out.println(animalList);

        System.out.println("\n\nAnimals, alphabetically -->");

        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animalList);

        System.out.println("\n\nAnimals, movement type -->");

        animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animalList);

        System.out.println("\n\nAnimals, breathing type = lungs -->");

        List<Animal> filteredList = filterAnimal(animalList, a -> a.breathe() == "lungs");
        System.out.println(filteredList);

        System.out.println("\n\nAnimals, breathing type = lungs, year = 1758 -->");

        filteredList = filterAnimal(filteredList, a -> a.getYear() == 1758);
        System.out.println(filteredList);

        System.out.println("\n\nAnimals, reproduction type = eggs, breathing type = lungs -->");

        // for this subset animalList is still sorted properly
        filteredList = filterAnimal(filterAnimal(animalList, a -> a.reproduce() == "eggs"), a -> a.breathe() == "lungs");
        System.out.println(filteredList);

        System.out.println("\n\nAnimals, alphabetically, year = 1758 -->");

        // had to re-sort animalList first
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList = filterAnimal(animalList, a -> a.getYear() == 1758);
        System.out.println(filteredList);

        System.out.println("\n\nMammals, alphabetically -->");

        filteredList = filterAnimal(animalList, a -> a instanceof Mammal);
        System.out.println(filteredList);

        System.out.println("\n\n<-- Animal Kingdom End");

    }

}