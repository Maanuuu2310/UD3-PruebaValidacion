import com.concesionario.camion.Camion;
import com.concesionario.moto.Ciclomotor;

public class App {
    public static void main(String[] args) {
        Ciclomotor motitouwu = new Ciclomotor("hola", 100, 3, 1, 200, "si");
        System.out.println(motitouwu);
        System.out.println("\n");
        Camion camioncitoOwO = new Camion("Mercedes", 18000, 200, 2, 200, 23);
        System.out.println(camioncitoOwO);
    }
}



