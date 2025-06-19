public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura; 
    private double peso;   
    private double imc;    

    // Construtor
    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.calcularIMC();
    }

    // Método para calcular IMC
    private void calcularIMC() {
        if (altura > 0) {
            this.imc = peso / (altura * altura);
        } else {
            this.imc = 0;
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
        calcularIMC(); // Atualiza o IMC
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        calcularIMC();
    }
    public double getImc() {
        return imc;
    }
    
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        System.out.printf("IMC: %.2f%n", imc);
    }
}


