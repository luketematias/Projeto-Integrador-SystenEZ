
package pi.systen.ez;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaUsuarios {
    public static ArrayList<Usuario> lista = new ArrayList<Usuario>();

    public static ArrayList<Usuario> listar() {
        return lista;
    }

    public static boolean excluir(int id) {
        try {
            if (id < 0) {
                JOptionPane.showMessageDialog(null, "Selecione um item da tabela para excluir!");
            } else {
                lista.remove(id);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um error ao tentar excluir da lista!", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
}
