import java.util.Scanner;

public class Lista05_Atv01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        // Criando objeto Pessoa
        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);

        // Saída
        double imc = pessoa.calcularIMC();
        String classificacao = pessoa.informaObesidade();

        System.out.printf("\n%s %s tem IMC de %.2f\n", pessoa.getNome(), pessoa.getSobrenome(), imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
