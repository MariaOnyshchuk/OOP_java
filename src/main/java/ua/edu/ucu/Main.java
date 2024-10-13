package ua.edu.ucu;

public class Main {
    public static void main(String[] args){
        Flower flower = new Flower();
        flower.setPrice(100);
        flower.setFlowerType(FlowerType.ROSE);

        FlowerBucket fBucket = new FlowerBucket();

        FlowerPack fPack = new FlowerPack(flower, 5);
        fBucket.add(fPack);

        FlowerPack fPack2 = new FlowerPack(flower, 10);
        fBucket.add(fPack2);

        System.out.println(fBucket.getPrice());

        flower.setPrice(15);


        System.out.println(fBucket.getPrice());
    }
}
