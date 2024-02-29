import model.BankovniUcet;
import model.BankovniOperace;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainProgram {
    public static void main(String[] args) {

        BankovniUcet mujBankovniUcet = new BankovniUcet();
        BankovniOperace bankovniOperace = new BankovniOperace();
        mujBankovniUcet.setSumaNaUctu(5000);
        System.out.println(mujBankovniUcet.toString());

        //inicializace - propojeni bankovniUcet s BankovniOperace
        bankovniOperace.setDispozibilniZustatek(mujBankovniUcet);

        bankovniOperace.uloz(300);
        System.out.println(mujBankovniUcet.toString());


        bankovniOperace.uloz(300);
        System.out.println(mujBankovniUcet.toString());

        bankovniOperace.vyber(200);
        System.out.println(mujBankovniUcet.toString());

        bankovniOperace.vyber(20000);
        System.out.println(mujBankovniUcet.toString());


    }
}
