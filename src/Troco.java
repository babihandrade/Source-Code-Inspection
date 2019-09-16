
import br.ticketmachine.exception.SaldoInsuficienteException;


/**
 *
 * @author Calebe de Paula Bianchini
 */
/**
 *
 * Classes nesse arquivo não condizem com a especificação da documentação
 * (e a mesma esta desenhada erradamente)
 * (Classe Troco não é, nem deveria ser uma abstração de Iterator)
 * [COMISSÃO]
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;
    int saldo;

    /**
     * Construtor com lógica e estruturas desnecessarias, loops poderiam ser
     * organizados de outra forma oucompletamente removidos Algoritmo usado não
     * garante a resolução do problema, e seu resultado não condiz com as
     * espectativas estruturas de dados usadas não são adequadas para a situação
     * em questão. [COMPUTAÇÃO] [DESEMPENHO] [DADOS] [EXESSO]
     */

    public Troco(PapelMoeda[] papeisMoeda, int saldo) {
        this.papeisMoeda = papeisMoeda;
        this.saldo = saldo;
    }

    public PapelMoeda[] getPapeisMoeda() {
        return papeisMoeda;
    }

    public void setPapeisMoeda(PapelMoeda[] papeisMoeda) {
        this.papeisMoeda = papeisMoeda;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void calculaTroco() throws SaldoInsuficienteException {
        int count = 0;
        /**
         * Variavel de controle (valor) não alterada durante o loop
         * Programatrava aqui e não segue pois loop não retorna.
         * [CONTROLE][DESEMPENHO]
         */
        try{
        if(this.saldo > 2){
        for (int i = (this.papeisMoeda.length - 1); i >= 0; i--) {
            count = 0;
            while (this.saldo >= papeisMoeda[i].getValor()) {
                count++;
                this.saldo = (this.saldo - papeisMoeda[i].getValor());
            }
            this.papeisMoeda[i].setQuantidade(count);
        }
        }else{
        throw new SaldoInsuficienteException();
        }
        }catch(Exception e){
        System.err.println(e.getMessage());
        }
    //papeisMoeda[5] = new PapelMoeda(100, count);
    /**
     * Variável count sempre é zerada. seu valor não passa adiante. [COMPUTAÇÃO]
     *
     * count = 0; while (valor % 50 != 0) { count++; } papeisMoeda[4] = new
     * PapelMoeda(50, count); count = 0; while (valor % 20 != 0) { count++; }
     * papeisMoeda[3] = new PapelMoeda(20, count); count = 0; while (valor % 10
     * != 0) { count++; } papeisMoeda[2] = new PapelMoeda(10, count); count = 0;
     * while (valor % 5 != 0) { count++; } papeisMoeda[1] = new PapelMoeda(5,
     * count); count = 0; while (valor % 2 != 0) { count++;
         * }
     */
    /**
     * Posição 1 do vetor tem seu valor resetado. [COMPUTAÇÃO]
     *
     * papeisMoeda[1] = new PapelMoeda(2, count);
     *
     * /**
     * vetor papeisMoeda não inicializado corretamente. O mesmo tem 6 posições e
     * somente 5 foram usadas/inicialisadas
     *
     * posição 0 é null
     *
     * [COMPUTAÇÃO][DADOS]
     */
}

}
