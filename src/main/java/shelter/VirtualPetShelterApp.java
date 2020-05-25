package shelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp<userSelection> {

    public static void main(String[] args) {

        VirtualPet hamBone = new VirtualPet("Hambone", "Hambone is a roly-poly goofball", 20, 20, 20);
        VirtualPet sandalphon = new VirtualPet("Sandalphon", "Sandalphon is one tall boy!");


        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.intakeANewPet(hamBone);
        myShelter.intakeANewPet(sandalphon);

        System.out.println("Welcome to Patches' Pet Shelter");
        System.out.println("As the new vet-tech it is your job to care for the pets as well as handle adoptions and intakes");
        System.out.println();



        Scanner scanner = new Scanner(System.in);
        String userSelection;



        while (true) {

            printPetStatus(myShelter);
            System.out.println("");
            System.out.println("If you would like to feed the pets press 1, \n " +
                    "if you would like to give them all water press 2, \n " +
                    "if you would like to play with them all press 3. \n " +
                    "Press 4 if you'd like to enter a particular pet name in order to retrieve  said pet's description. \n" +
                    "Press 5 if you'd like to adopt a Pet.\n" +
                    "Press 6 if you would like to admit a pet to the Shelter. \n" +
                    "Press 7 if you would like to play with a particular pet inside of the shelter" +
                    " If you would like to exit press -1");
            userSelection = scanner.nextLine();

            if (userSelection.equals("1")) {
                myShelter.feedAllThePets();
                System.out.println("You fed all the pets!");
            } else if (userSelection.equals("2")) {
                myShelter.waterAllThePets();
                System.out.println("You gave all the pets water!");
            } else if (userSelection.equals("3")) {
                myShelter.playWithAllThePets();
                System.out.println("You played with all the pets!");
            }
            else if (userSelection.equals("4")){
                System.out.println("Please Enter The Pet's Name ");
                String petname = scanner.nextLine();

               System.out.println(myShelter.findThisPet(petname).petDescription);

            }
            else if (userSelection.equals("5")){
                Collection<VirtualPet> petsToAdopt = myShelter.showAllPets();
                for (VirtualPet pet : petsToAdopt)
                    System.out.println(pet.getName()+": " + pet.getPetDescription() ) ;
                System.out.println("Please Enter the Name of The Pet To Adopt");
                String petname = scanner.nextLine();
                myShelter.adoptAPet(petname);
                System.out.println( "You adopted " + petname);
            }
            else if (userSelection.equals("6")){
                System.out.println("Please provide a name for the pet you would like to intake");
                String petName = scanner.nextLine();
                System.out.println("Please give a brief description of this good-good boy");
                String petDescription = scanner.nextLine();
                myShelter.intakeANewPet(new VirtualPet(petName, petDescription));



            }
            else if (userSelection.equals("7")){
                System.out.println("Please provide the name of the pet you'd like to play with");
                String petName = scanner.nextLine();
                myShelter.playWithSinglePet(petName);

            }
            else if (userSelection.equals("-1")){
                System.out.println("Goodbye");
                System.exit(-1);
            }
//            printPetStatus(myShelter);
            myShelter.tick();
        }
    }

    private static void printPetStatus(VirtualPetShelter shelter) {
        System.out.println("This is the status of your pets: ");
//        for (VirtualPet pet : shelter.myPetList.values()) {
//            System.out.println(pet);
//            System.out.println("");

            Collection<VirtualPet> pets = shelter.showAllPets();
            for (VirtualPet pet : pets)
                System.out.println(pet.getName() + "\n" +
                        "\tHunger: " + pet.getHungerLevel() +
                        "\tThirst: " + pet.getThirstLevel() +
                        "\tBoredom: " + pet.getBoredomLevel());
        }

    }











