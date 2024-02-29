package model;

public class BankovniUcet {
    private long sumaNaUctu;


    public long getSumaNaUctu() {
        return sumaNaUctu;
    }

    public void setSumaNaUctu(long sumaNaUctu) {
        this.sumaNaUctu = sumaNaUctu;
    }

    @Override
    public String toString() {
        return "BankovniUcet{" +
                "sumaNaUctu=" + sumaNaUctu +
                '}';
    }
}