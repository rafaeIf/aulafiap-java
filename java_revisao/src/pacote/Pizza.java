package pacote;

public class Pizza {
    int id;
    String sabor;
    String tamanho;
    double preco;

    public Pizza (int id, String sabor, String tamanho, double preco){
        this.id = id;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String exibir(){return "ID: "+id+", Sabor: "+sabor+", R$: "+preco+", "+tamanho;}

}
