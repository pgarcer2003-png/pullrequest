
import javax.sound.sampled.SourceDataLine;

public class Personaje {
 private String nom;
 private int dinero;
 public Personaje(String nom, int dinero) {
 this.nom = nom;
 this.dinero = dinero;
 }
 public void mostrarInfo() {
 System.out.println(nom + " tiene " + dinero + "$.");
 }
 public void subirNivel() {
    int counter = 1;
    System.out.println(nom + "ha subido al nivel " + counter++);
 }

 public static void main(String[] args) {
 Personaje jugador = new Personaje("El búho de Duolingo", 500);
 jugador.mostrarInfo();
 jugador.subirNivel();
 }
}