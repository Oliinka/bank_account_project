package model;

public class BankovniUcet {
    private long sumaNaUctu;
    private long limit;


    public long getSumaNaUctu() {
        return sumaNaUctu;
    }

    public void setSumaNaUctu(long sumaNaUctu) {
        this.sumaNaUctu = sumaNaUctu;
    }

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }


    @Override
    public String toString() {
        return "BankovniUcet{" +
                "sumaNaUctu=" + sumaNaUctu +
                '}';
    }
}