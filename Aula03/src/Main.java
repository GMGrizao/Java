import br.com.fiap.tds.model.Carro;

public class Main {
    public static void main(String[] args) {
        //Instanciar um Carro
        Carro bmw = new Carro();
        bmw.setCor("Azul");
        bmw.setModelo("320i");
        bmw.setPlaca("abc1234");

        //Exibir os valores do modelo, placa e cor
        System.out.println(bmw.getModelo() + " " + bmw.getCor() + " " + bmw.getPlaca());

    }
}