package Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private double peso;
    private int altura;


    public Pessoa() {}

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, double peso, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getID() {
        return this.ID;
    }

    public double getPeso() {
        return this.peso;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setNome(String nome) {
        String regex = "[A-Z][a-z]* [A-Z][a-z]*";
        boolean isValid = nome.matches(regex);

        if (isValid) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public void setIdade(int idade) {
        if (idade < 130 && idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            System.out.println("Peso inválido!");
        } else {
            this.peso = peso;
        }
    }

    public void setAltura(int altura) {
        if (altura > 0 && altura < 250) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }

    public static int calcularImc(double peso, int altura) {
        double alturaEmMetros = (double) altura / 100;
        double imc = peso / (alturaEmMetros * alturaEmMetros);

        if (imc < 20) {
            return -1;
        }

        if (imc > 20 && imc < 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean ehMaiorIdade(int idade) {
        return idade > 18;
    }
}
