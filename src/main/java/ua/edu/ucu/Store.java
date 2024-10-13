package ua.edu.ucu;
import java.util.List;
import java.util.ArrayList;

public class Store {
    private List<FlowerBucket> buckets = new ArrayList<>();
    public Store() {
        this.buckets = buckets;
    }

    public void add(FlowerBucket flower) {
        buckets.add(flower);
    }

    public List<FlowerBucket> search(FlowerType type) {
        List<FlowerBucket> result = new ArrayList<>();
        for (FlowerBucket bucket : buckets) {
            for (FlowerPack pack : bucket.getFlowerPacks()) {
                if (pack.getFlower().getFlowerType() == type) {
                    result.add(bucket);
                    break;
                }
            }
        }
        return result;
    }
}