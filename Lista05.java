/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista05;
import java.util.Scanner;

public class Lista05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] cadastros = new Pessoa[10];
        int count = 0;

        while (count < 10) {
            System.out.println("\nCadastro " + (count + 1) + ":");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = scanner.nextLine();

            String nomeCompleto = nome + " " + sobrenome;

            boolean jaCadastrado = false;
            for (int i = 0; i < count; i++) {
                if (cadastros[i].getNomeCompleto().equalsIgnoreCase(nomeCompleto)) {
                    jaCadastrado = true;
                    break;
                }
            }

            if (jaCadastrado) {
                System.out.println("⚠ Pessoa já cadastrada com esse nome completo.\n");
                continue;
            }

            System.out.print("Altura (em metros): ");
            double altura = Double.parseDouble(scanner.nextLine());

            System.out.print("Peso (em kg): ");
            double peso = Double.parseDouble(scanner.nextLine());

            System.out.print("Data de nascimento (dia): ");
            int dia = Integer.parseInt(scanner.nextLine());

            System.out.print("Mês de nascimento: ");
            int mes = Integer.parseInt(scanner.nextLine());

            System.out.print("Ano de nascimento: ");
            int ano = Integer.parseInt(scanner.nextLine());

            Data dataNascimento = new Data(dia, mes, ano);
            Pessoa pessoa = new Pessoa(nome, sobrenome, altura, peso, dataNascimento);

            cadastros[count] = pessoa;
            count++;

            System.out.println("Cadastro realizado com sucesso!\n");

            if (count < 10) {
                System.out.print("Deseja cadastrar outra pessoa? (s/n): ");
                String resposta = scanner.nextLine();
                if (!resposta.equalsIgnoreCase("s")) break;
            }
        }

        System.out.println("\n=== RELATÓRIO FINAL ===");
        for (int i = 0; i < count; i++) {
            Pessoa p = cadastros[i];
            System.out.println("\nCadastro " + (i + 1) + ":");
            System.out.println("Nome completo: " + p.getNomeCompleto());
            System.out.println("Nome de referência: " + p.getNomeExibicao());
            System.out.println("Idade: " + p.calcularIdade());
            System.out.printf("Peso: %.2f kg\n", p.getPeso());
            System.out.printf("Altura: %.2f m\n", p.getAltura());
            System.out.printf("IMC: %.2f\n", p.getImc());
            System.out.println("Classificação: " + p.informaObesidade());
        }
    }
}
