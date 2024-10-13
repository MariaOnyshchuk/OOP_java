import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import ua.edu.ucu.Flower;
import ua.edu.ucu.FlowerBucket;
import ua.edu.ucu.FlowerPack;
import ua.edu.ucu.FlowerColor;
import ua.edu.ucu.FlowerType;
import ua.edu.ucu.Store;

import java.util.List;

import static ua.edu.ucu.FlowerType.ROSE;
import static ua.edu.ucu.FlowerType.TULIP;
import static ua.edu.ucu.FlowerType.CAMOMILE;

public class StoreTest {
    private Store store;
    private FlowerBucket bucket1;
    private FlowerBucket bucket2;
    private FlowerPack pack1;
    private FlowerPack pack2;
    private FlowerPack pack3;

    @BeforeEach
    public void init() {
        store = new Store();

        // Creating first flower bucket with roses
        bucket1 = new FlowerBucket();
        Flower rose = new Flower(FlowerColor.RED, ROSE, 10.0, 5.0);
        bucket1.add(new FlowerPack(rose, 3));
        store.add(bucket1);

        // Creating second flower bucket with tulips
        bucket2 = new FlowerBucket();
        Flower tulip = new Flower(FlowerColor.YELLOW, FlowerType.TULIP, 12.0, 6.0);
        bucket2.add(new FlowerPack(tulip, 2));
        store.add(bucket2);

        Flower roseCopy = new Flower(FlowerColor.RED, FlowerType.ROSE, 10.0, 5.0);
        pack1 = new FlowerPack(rose, 3);
        pack2 = new FlowerPack(roseCopy, 3);
        pack3 = new FlowerPack(tulip, 5);
    }

    @Test
    public void testSearchForExistingFlowerType() {
        List<FlowerBucket> result = store.search(ROSE);
        Assertions.assertEquals(1, result.size());
        Assertions.assertTrue(result.contains(bucket1));
    }

    @Test
    public void testSearchForNonExistingFlowerType() {
        List<FlowerBucket> result = store.search(CAMOMILE);
        Assertions.assertEquals(0, result.size());
    }

    @Test
    public void testEqualityOfFlowerPacks() {
        Assertions.assertTrue(pack1.equals(pack2));
    }

    @Test
    public void testDifferentBucketsAreNotEqual() {
        Assertions.assertNotEquals(bucket1, bucket2);
    }

    @Test
    public void testTotalPriceOfFlowerBucket() {
        Assertions.assertEquals(30.0, bucket1.getPrice());
    }

    @Test
    public void testMultipleSearches() {
        List<FlowerBucket> roseResult = store.search(ROSE);
        List<FlowerBucket> tulipResult = store.search(TULIP);

        Assertions.assertEquals(1, roseResult.size());
        Assertions.assertEquals(1, tulipResult.size());
    }
}
