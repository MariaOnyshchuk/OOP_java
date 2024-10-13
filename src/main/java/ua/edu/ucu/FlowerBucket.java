package ua.edu.ucu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter@Setter
@AllArgsConstructor
public class FlowerBucket {
    private List<FlowerPack> flowerPacks;
    public FlowerBucket(){
        this.flowerPacks = new ArrayList<>();
    }
    public void add(FlowerPack pack){
        flowerPacks.add(pack);
    }
    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks){
            price+=flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof FlowerBucket)) return false;

        FlowerBucket other = (FlowerBucket) obj;
        return Objects.equals(this.flowerPacks, other.flowerPacks);
    }

}
