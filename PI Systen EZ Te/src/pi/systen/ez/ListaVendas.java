
package pi.systen.ez;

import java.util.ArrayList;

public class ListaVendas {
    private static ArrayList<Venda> vendas = new ArrayList<>();

    public static void adicionar(Venda v) {
        vendas.add(v);
    }

    public static ArrayList<Venda> listar() {
        return vendas;
    }
}
