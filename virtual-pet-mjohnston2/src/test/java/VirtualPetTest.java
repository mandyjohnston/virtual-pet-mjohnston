import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

    @Test
    public void isAkiraAlive() {
        VirtualPet akiraTheAlligator = new VirtualPet(0, 0, 0, 10, 10, 10, "Akira", true);
        boolean mortality=akiraTheAlligator.isAlive();
        Assert.assertEquals(false,mortality);
    }
}

