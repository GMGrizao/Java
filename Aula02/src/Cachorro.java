public class Cachorro {
    //Atributo
    String nome;
    float peso;
    int idade;
    boolean castrado;

    //Metodos
    void andar(){
        System.out.println(nome +" está andando..");
    }

    //Metodo que calcula a dose de um medicamento (remedio que e 1ml dose por 10)
    float caulcularDose(int dosePorKg){
        float doses = peso /dosePorKg;
        return doses;
    }

    //Metodo que calcula a idade "humana" do cachorro (cada ano do cachorro vale por 7)
    int calcularIdade(){
        int idadeHumana = idade * 7;
        return idadeHumana;
    }

}

