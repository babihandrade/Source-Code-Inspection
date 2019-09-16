

/**
 *
 * @author Calebe de Paula Bianchini
 */
/**
 * SETERS faltando, e não representados na documentação.
 * [COMISSÃO]
 */
public class PapelMoeda {

    /**
     * Visibilidade dos atributos não bate com o especificado
     * 
     * [COMISSÃO]
     */
    private int valor; //visibilidade alterada de protected para private
    private int quantidade; //visibilidade alterada de protected para private

    
    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }  

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
