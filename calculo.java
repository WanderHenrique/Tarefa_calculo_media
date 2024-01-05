import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class calculo {

  private List<Double> notas;

  public calculo() {
    this.notas = new ArrayList<>();
  }

  public void lerNotas() {
    for (int i = 0; i < 4; i++) {
      try {
        this.notas.add(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (i + 1) + ": ")));
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "A nota deve ser um número válido.");
      }
    }
  }

  public double calcularMedia() {
    double soma = 0;
for (Double nota : this.notas) {
soma += nota;
}

return soma / this.notas.size();
  }

  public void imprimirMedia() {
    System.out.println("A média é: " + this.calcularMedia());
  }

  public static void main(String[] args) {
    calculo media = new calculo();
    media.lerNotas();
    media.imprimirMedia();
  }
}