public class Main {
    public static void main(String[] args) {
        //Criar um objeto para represntar um cachorro
        Cachorro dogBelga = new Cachorro();
        //Atribuir valores aos atributos do objeto
        dogBelga.nome = "Spike";
        dogBelga.peso = 30;
        dogBelga.idade = 6;
        dogBelga.castrado = true;
        //Exibir os dados do objeto cahorro
        System.out.println(dogBelga.nome + ", tem " + dogBelga.idade + " anos," +
                " pesa " + dogBelga.peso + " Kg e é castrado? " + dogBelga.castrado);

        //Criar um outro objeto cachorro
        Cachorro maltes = new Cachorro();
        //Atribuir outro valores
        maltes.nome = "Snow";
        maltes.peso = 6;
        maltes.idade = 8;
        maltes.castrado = true;
        //Exibir os valores do outro objeto
        System.out.println(maltes.nome + ", tem " + maltes.idade + " anos," +
                " pesa " + maltes.peso + " Kg e é castrado? " + maltes.castrado);

        //Chamar os metodos
        dogBelga.andar();
        maltes.andar();

        //Chamar o metodo para calcular a dose do remedio 1 a cada 5 kg
       float doseBelga = dogBelga.caulcularDose(5);
        System.out.println("Doses necessárias para o " + dogBelga.nome + " é: " + doseBelga);

        float doseMaltes = maltes.caulcularDose(5);
        System.out.println("Doses necessárias para o " + maltes.nome + " é: "  + doseMaltes);

        //Calcular e exibir a idade humana do dog
        int idadeBelga = dogBelga.calcularIdade();
        System.out.println("Idade humana do " + dogBelga.nome + " é: " + idadeBelga);

        int idadeMaltes = maltes.calcularIdade();
        System.out.println("Idade humana do " + maltes.nome + " é: " + idadeMaltes);


        Aluno alunoFiap = new Aluno();
        alunoFiap.nome = "Guilherme";
        alunoFiap.cp = 8;
        alunoFiap.gs = 7;
        alunoFiap.challenge = 9;


        float mediaAluno = alunoFiap.mediaFinal();
        System.out.println("A média final do " + alunoFiap.nome + " é: " + mediaAluno);
    }
}