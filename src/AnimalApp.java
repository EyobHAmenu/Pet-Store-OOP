import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        /*
            name, type , description, price and isInStock
            Sample case:
            ***** Add the your pet to the market. *******
                What type of animal is it? Dog
                What is the name of Dog ? Apollo
                Give us some description of Apollo ? Freindly
                What is the price of Apollo ? 330
                Apollo is in stock (true/false): true

                You want to add another pet (yes/no) ? yes
                What type of animal is it? Cat
                What is the name of Cat ? Oscar
                Give us some description of Oscar ? Rubbing
                What is the price of Oscar ? 89
                Oscar is in stock (true/false): true

                You want to add another pet (yes/no) ? no
                ******** List of Pets in the Database**************
                1. Apollo, Dog, Friendly
                2. Oscar, Cat, Rubbing
         */
        String stop = "yes";
        int count = 0;

        Scanner in = new Scanner(System.in);
        ArrayList<Animal> listOfAnimals = new ArrayList<>();

        System.out.println("***** Add the your pet to the market. *******");
        while (stop.equalsIgnoreCase("yes")){
            Animal newAnimal = new Animal();

            System.out.print("What type of animal is it? ");
            newAnimal.setType(in.nextLine());
            System.out.print("What is the name of " + newAnimal.getType() + " ? ");
            newAnimal.setName(in.nextLine());
            System.out.print("Give us some description of " + newAnimal.getName() + " ? ");
            newAnimal.setDescription(in.nextLine());
            System.out.print("What is the price of " + newAnimal.getName() + " ? ");
            newAnimal.setPrice(in.nextDouble());
            in.nextLine();
            System.out.print(newAnimal.getName() + " is in stock (true/false): ");
            newAnimal.setInStock(in.nextBoolean());
            in.nextLine();
            System.out.println();

            listOfAnimals.add(newAnimal);
            System.out.print("You want to add another pet (yes/no) ? ");
            stop = in.nextLine();
        }

        System.out.println("******** List of Pets in the Database**************");
        for(Animal list : listOfAnimals){
            count++;
            System.out.println(count + ". " + list.getPet());
        }


    }
}
