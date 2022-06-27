package Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa diovana = new Pessoa("Diovana Valim", 21, "aabbcc", 47.5, 156);
        Pessoa debora = new Pessoa();
        Pessoa ovelha = new Pessoa("Ovelha Ovelha", 45, "aaaaaa");

        System.out.println("Objeto Diovana");
        System.out.println(diovana.getNome());
        System.out.println(diovana.getIdade());
        System.out.println("---------------------------------");

        System.out.println("Modificando o objeto Diovana");
        diovana.setNome("Shirley Valim");
        diovana.setIdade(98);
        System.out.println("---------------------------------");

        System.out.println("Novo objeto Diovana");
        System.out.println(diovana.getNome());
        System.out.println(diovana.getIdade());
        System.out.println("---------------------------------");

        System.out.println("Objeto Debora");
        System.out.println(debora.getNome());
        System.out.println(debora.getIdade());
        System.out.println("---------------------------------");

        System.out.println("Objeto Ovelha");
        System.out.println(ovelha.getNome());
        System.out.println(ovelha.getIdade());

        System.out.println("---------------------------------");
        int imc = diovana.calcularImc(diovana.getPeso(), diovana.getAltura());
        System.out.println("De acordo com seu peso, " + diovana.getNome() + " está: ");
        switch (imc) {
            case -1:
                System.out.println("Abaixo do peso!");
                break;
            case 0:
                System.out.println("Peso saudável!");
                break;
            case 1:
                System.out.println("Sobrepeso!");
        }

        boolean ehMaiorDeIdade = diovana.ehMaiorIdade(diovana.getIdade());
        if (ehMaiorDeIdade) {
            System.out.println(diovana.getNome() + " é maior de idade!");
        } else {
            System.out.println(diovana.getNome() + " não é maior de idade!");
        }
    }
}
