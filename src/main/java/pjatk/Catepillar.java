package pjatk;


import java.awt.print.*;
import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Catepillar extends Excavators implements Annotation {

    @Catsn(key = 1111)
    int sN;
    int power;
    int id;


    public Catepillar(int id, int power, int sN) {
        this.sN = sN;
        this.power = power;
        this.id = id;
    }

    @Override
    public void excavate() {

    }

    @Override
    public void drill() {

    }

    @Override
    public void lift() {

    }

    public void setSN(int sN) {
        this.sN = sN;
    }

    public void setPower(int power) {
        power = power;
    }

    public int getSN() {
        return sN;
    }

    public int getPower() {
        return power;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Catepillar{" +
                "SN=" + sN +
                ", Power=" + power +
                ", id=" + id +
                '}';
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
