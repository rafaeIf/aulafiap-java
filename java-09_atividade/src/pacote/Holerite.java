package pacote;

import java.util.ArrayList;

public class Holerite {

    Pagamento pagamento;
    ArrayList<Desconto> descontos;

    public Holerite(Pagamento pagamento, ArrayList<Desconto> descontos){
        this.pagamento = pagamento;
        this.descontos = descontos;
    }
}
