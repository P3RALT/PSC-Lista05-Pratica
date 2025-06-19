package lista05;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private double altura;
    private double peso;
    private Data dataNascimento;
    private double imc;

    public Pessoa(String nome, String sobrenome, double altura, double peso, Data dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.altura = altura;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.imc = calcularIMC();
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = LocalDate.of(dataNascimento.getAno(), dataNascimento.getMes(), dataNascimento.getDia());
        return Period.between(nascimento, hoje).getYears();
    }

    public double calcularIMC() {
        if (altura > 0) {
            imc = peso / (altura * altura);
        } else {
            imc = 0;
        }
        return imc;
    }
    public String informaObesidade() {
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Peso normal";
        else if (imc < 30) return "Sobrepeso";
        else if (imc < 35) return "Obesidade grau 1";
        else if (imc < 40) return "Obesidade grau 2";
        else return "Obesidade grau 3";
    }
    
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
    public String getNomeExibicao() {
        return sobrenome.toUpperCase() + ", " + nome.toUpperCase();
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
    public double getImc() {
        return imc;
    }
}

