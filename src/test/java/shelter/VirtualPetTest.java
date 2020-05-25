package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void shouldInstantiate() {
        VirtualPet underTest = new VirtualPet("George", "George is one ugly puppy", 20, 20, 20);
    }

    @Test
    public void shouldHaveAName() {
        VirtualPet underTest = new VirtualPet("George", "George is one ugly puppy", 20, 20, 20);
        String name = underTest.getName();
        assertEquals("George", name);
    }

    @Test
    public void shouldHaveAHungerLevel() {
        VirtualPet underTest = new VirtualPet("George", "George is one ugly puppy", 20, 20, 20);
        int hungerLevel = underTest.getHungerLevel();
        assertEquals(20, hungerLevel);
    }

    @Test
    public void shouldHaveAThirstLevel() {
        VirtualPet underTest = new VirtualPet("George", "George is one ugly puppy", 20, 20, 20);
        int thirstLevel = underTest.getThirstLevel();
        assertEquals(20, thirstLevel);
    }

    @Test
    public void shouldHaveABoredomLevel() {
        VirtualPet underTest = new VirtualPet("George", "George is one ugly puppy", 20, 20, 20);
        int boredomLevel = underTest.getBoredomLevel();
        assertEquals(20, boredomLevel);
    }

    @Test
    public void shouldHaveAPetDescription() {
        VirtualPet underTest = new VirtualPet("George", "George is one ugly puppy", 20, 20, 20);
        String petDescription = underTest.getPetDescription();
        assertEquals("George is one ugly puppy", petDescription);
    }
}

