public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura; // em metros
    private double peso;   // em kg
    private double imc;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.calcularIMC();
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
        calcularIMC(); // Atualiza IMC se altura ou peso mudar

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else if (imc < 35.0) {
            return "Obesidade grau 1";
        } else if (imc < 40.0) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        calcularIMC(); // atualiza o IMC
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        calcularIMC(); // atualiza o IMC
    }

    public double getImc() {
        return imc;
    }
}
