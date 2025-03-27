import pacote.Desconto;
import pacote.Holerite;
import pacote.Pagamento;

import java.util.ArrayList;

public class Main {

    public static void main (String [] args){

        Pagamento pagamento = new Pagamento(15000, "descritivo do pagamento");
        Desconto inss = new Desconto("Inss", 100);
        Desconto irpf = new Desconto("Irpf", 120);

        ArrayList<Desconto> descontos = new ArrayList<>();
        descontos.add(inss);
        descontos.add(irpf);
        Holerite holeriteDoGustavo = new Holerite(pagamento, descontos);

    }

}
