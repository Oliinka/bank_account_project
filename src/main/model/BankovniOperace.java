// BankAccount.java
package model;

public class BankovniOperace {
    private BankovniUcet dispozibilniZustatek;

    public BankovniUcet getDispozibilniZustatek() {
        return dispozibilniZustatek;
    }

    public void setDispozibilniZustatek(BankovniUcet dispozibilniZustatek) {
        this.dispozibilniZustatek = dispozibilniZustatek;
    }

    public void uloz(long castka) {

        dispozibilniZustatek.setSumaNaUctu(dispozibilniZustatek.getSumaNaUctu() + castka);
        System.out.println("Operace úspěšně provedena. Nový zůstatek: " + dispozibilniZustatek.getSumaNaUctu());
    }

    public void vyber(long castka) {
        if (dispozibilniZustatek.getSumaNaUctu() > castka) {
            dispozibilniZustatek.setSumaNaUctu(dispozibilniZustatek.getSumaNaUctu() - castka);
            System.out.println("Výber úspěšně proveden. Nový zůstatek: " + dispozibilniZustatek.getSumaNaUctu());
        } else {
            System.out.println("Operace neprovedena, nedostatečný dispozibilní zústatek: " + dispozibilniZustatek.getSumaNaUctu());
        }
    }


}