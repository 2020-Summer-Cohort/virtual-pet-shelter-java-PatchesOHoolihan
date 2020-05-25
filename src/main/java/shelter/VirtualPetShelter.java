package shelter;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

    public Map<String, VirtualPet> myPetList = new HashMap<>();


    public void retrieveAllPets() {
        for (VirtualPet pet : myPetList.values()) {
            System.out.println(pet);
        }
    }

    public void feedAllThePets() {
        for (VirtualPet pet : myPetList.values())
            pet.feedThisPet();
    }
    public Collection<VirtualPet> showAllPets(){
        return myPetList.values();
    }

    public void waterAllThePets() {
        for (VirtualPet pet : myPetList.values())
            pet.giveThisPetWater();
    }

    public void playWithAllThePets() {
        for (VirtualPet pet : myPetList.values())
            pet.playWithThisPet();
    }

    public VirtualPet findThisPet(String name) {


        return myPetList.get(name);

    }

    public void playWithSinglePet(String name) {


        myPetList.get(name).playWithThisPet();

    }
    public void intakeANewPet(VirtualPet petToAdd) {
        myPetList.put(petToAdd.getName(), petToAdd);
    }


    public void adoptAPet(String name) {
        myPetList.remove(name);
    }


    //    public String listAllPets() {
//        Set<String> petNames = myPetList.keySet();
//        System.out.println("The pet names are " + petNames);
//
    public Set<String> retrieveAllPetNames() {

        return myPetList.keySet();
    }
    public void tick (){
        for (VirtualPet pet : myPetList.values())
            pet.tick();
    }






    }

