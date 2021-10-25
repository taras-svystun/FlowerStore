import org.junit.jupiter.api.BeforeEach;

import java.awt.*;
import java.util.concurrent.Flow;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {

    private FlowerPack flowerPack;

    @BeforeEach
    void setUp(){
        flowerPack = new FlowerPack();
        Flower flower = new Flower();
        bucket = new FlowerBucket(flower);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {

    }
}