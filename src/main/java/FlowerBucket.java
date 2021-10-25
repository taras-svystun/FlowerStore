import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> flowerBucket;

    public double getPrice(){
        double bucketPrice = 0;
        for (FlowerPack bucket: flowerBucket){
            bucketPrice += bucket.getPrice();
        }
        return bucketPrice;
    }

    public void add(FlowerPack bucket) {
        flowerBucket.add(bucket);
    }

    public FlowerBucket() {
        flowerBucket = new ArrayList<FlowerPack>();
    }

}
