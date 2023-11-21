import java.util.Scanner;

public class CalculadoraRankeadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de vitórias: ");
        int vitorias = scanner.nextInt();

        System.out.print("Digite a quantidade de derrotas: ");
        int derrotas = scanner.nextInt();

        int saldoVitorias = calcularSaldo(vitorias, derrotas);
        String nivel = calcularNivel(vitorias);

        System.out.println("O Herói tem um saldo de " + saldoVitorias + " e está no nível de " + nivel);

        scanner.close();
    }

    static int calcularSaldo(int vitorias, int derrotas) {
        return vitorias - derrotas;
    }

    static String calcularNivel(int vitorias) {
        String nivel;

        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        return nivel;
    }
}
