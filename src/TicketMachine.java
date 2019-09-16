
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    /**
     * Atributos não especificados na documentação [COMISSÃO]
     *
     */
    protected int valor;
    protected int saldo;

    /**
     * Lógica da classe não utiliza o index deste array corretamente ele não tem
     * a posição 6, as mesmas vão de 0 à papelMoeda.length - 1 (6). Erro lógico
     * é carregado até a classe Troco, e o mesmo estoura lá [DADOS]
     */
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    /**
     *
     *
     *
     * @param precoDoBilhete
     */
    public TicketMachine(int precoDoBilhete) {
        // renomeada a variável de acordo com a especificação da classe

        this.valor = precoDoBilhete;
        this.saldo = 0;
    }

    /**
     *
     * Lógica não satisfais o especificado [COMISSÃO][EXESSO]
     */
    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        //mensagem do caso de uso CSU01 - Ação do Sistema 2 implementada
        try {
            System.out.println("Por favor, aguarde alguns instantes...");

            boolean achou = false;

            for (int i = 0; i < papelMoeda.length && !achou; i++) {
                //comparação alterada de 1 para i, pois ele só aceitaria notas de 5, posição 1 no array
                if (papelMoeda[i] == quantia) {
                    achou = true;
                    //incremento agora realizado dentro da validação
                    this.saldo += quantia;
                    //ação do sistema 5 do CSU01 implementada
                    System.out.println("Nota de papel aceita!");
                }
            }
            if (!achou) {
                throw new PapelMoedaInvalidaException();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
        //this.saldo += quantia; Se o incremento ocorrer aqui, mesmo que a nota seja
        //inválida, o saldo será contabilizado.

        //implementada a ação de sistema 6 do CSU01
        System.out.println("Saldo atual: " + this.saldo);
    }

    public int getSaldo() {
        return saldo;
    }

    /**
     * Método não implementado! o mesmo retorna NULL! [INICIALIZAÇÃO]
     */
    public String getTroco() throws SaldoInsuficienteException {
        
    PapelMoeda[] p = new PapelMoeda[6];
    p[0] = new PapelMoeda(2,0);
    p[1] = new PapelMoeda(5,0);
    p[2] = new PapelMoeda(10,0);
    p[3] = new PapelMoeda(20,0);
    p[4] = new PapelMoeda(50,0);
    p[5] = new PapelMoeda(100,0);
    
    Troco t = new Troco(p,saldo);
    t.calculaTroco();
     TrocoIterator ti = new TrocoIterator(t);
     
        for (PapelMoeda papeisMoeda : ti.troco.papeisMoeda) {
            if (papeisMoeda.getQuantidade() != 0) {
            return "Nota: "+papeisMoeda.getValor()+"\nQuantidade: " 
            + papeisMoeda.getQuantidade();
            }
        }
        return null;
    }

    /**
     * Método não devia ter a verificação do saldo, a mesma devia ser delegada
     * [COMPUTAÇÃO]
     */
    //função de verificação de saldo implementada
    public boolean verificarSaldo() {
        boolean saldoSuficiente;
        if (saldo < valor) {
            saldoSuficiente = false;
        } else {
            saldoSuficiente = true;
        }
        return saldoSuficiente;
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (verificarSaldo()) {
            //caso de uso não previa o débito do valor do bilhete
            saldo = (saldo - valor);
        } else {
            throw new SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}
