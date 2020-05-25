package shelter;


public class VirtualPet {


    public String name;
    public int hungerLevel;
    public int thirstLevel;
    public int boredomLevel;
    public String petDescription;

    public VirtualPet(String name, String petDescription){
        this.name = name;
        this.petDescription = petDescription;
        this.hungerLevel = 20;
        this.thirstLevel = 20;
        this.boredomLevel = 20;
    }


    public VirtualPet(String name, String petDescription, int hungerLevel, int thirstLevel, int boredomLevel) {
        this.name = name;
        this.petDescription = petDescription;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }


    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public String getName() {
        return name;
    }

    public void feedThisPet(){

        hungerLevel = hungerLevel - 20;

    }
    public void playWithThisPet(){
        boredomLevel = boredomLevel -20;

    }
    public void giveThisPetWater(){
        thirstLevel = thirstLevel - 20;

    }

    @Override
    public String toString() {
        return
                "Pet Name = " + name + '\n' +
                " How Hungry " + name + " Is = " + hungerLevel + '\n' +
                " How Thirsty " + name +" is = " + thirstLevel + '\n' +
                " How Bored " + name +  " is = " + boredomLevel + '\n' +
                " " + petDescription + '\n';
    }
    public void tick() {
        hungerLevel = hungerLevel + 10;
        thirstLevel = thirstLevel + 10;
        boredomLevel = boredomLevel + 10;
    }
}



