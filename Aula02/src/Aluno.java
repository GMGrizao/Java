public class Aluno{
    String nome;
    int cp;
    int gs;
    int challenge;

    float mediaFinal(){
        float media = cp * 0.2f + gs * 0.6f + challenge * 0.2f;
        return media;
    }

}
