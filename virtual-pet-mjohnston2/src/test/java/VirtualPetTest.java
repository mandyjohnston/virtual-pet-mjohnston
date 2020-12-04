import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

    @Test
    public void isPetAlive() {
        VirtualPet akiraTheAlligator = new VirtualPet();
        boolean aliveTest=akiraTheAlligator.isAlive();
        Assert.assertEquals(true,aliveTest);
    }
    @Test
    public void feedFish() {
        VirtualPet akiraTheAlligator = new VirtualPet();
        int newFoodLevel=akiraTheAlligator.feedFish();
        Assert.assertEquals(60,newFoodLevel);
    }
    @Test
    public void FeedRabbit() {
        VirtualPet akiraTheAlligator = new VirtualPet();
        int newFoodLevel=akiraTheAlligator.feedRabbit();
        Assert.assertEquals(75,newFoodLevel);
    }
}


