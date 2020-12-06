import javax.swing.*;

public class Classtablica {

  public static void main(String[] args) {
    double suma = 0;
    int tablica[] = new int[5];
    for (int i = 0; i < tablica.length; i++) {
      String tekst = JOptionPane.showInputDialog("podaj watosc pola tablicy");
      int liczba = Integer.parseInt(tekst);
      tablica[i] = liczba;
      suma = tablica[i] + suma;
    }
    System.out.println("Suma liczb z tablicy wynosi " + suma);
  }
}
