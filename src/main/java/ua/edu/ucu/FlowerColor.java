package ua.edu.ucu;
import lombok.Getter;

//enum is for saving constants
//@Getter
public enum FlowerColor {

    RED("#FF0000"), WHITE("#FFFFFF"), YELLOW("FFFF00");
    private String code;

    FlowerColor(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;

    }
}