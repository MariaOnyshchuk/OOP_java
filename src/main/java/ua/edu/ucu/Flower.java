package ua.edu.ucu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flower {
    private FlowerColor color;
    private FlowerType flowerType;
    @Getter
    private double price;
    @Getter
    private double sepalLengh;

    public Flower(Flower flower){
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLengh = flower.sepalLengh;
    }

    public String getColor(){
        return color.getCode();
    }

}

