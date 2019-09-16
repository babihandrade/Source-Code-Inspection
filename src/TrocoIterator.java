
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Barbara
 */


    class TrocoIterator implements Iterator<PapelMoeda> {

        /**
         * Variavel Troco dispensável uma vez que os atributos da instancia usada estão
         * no mesmo escopo deste iterator.
         * [DESEMPENHO]
         * [EXESSO]
         */
        protected Troco troco;
        private int posicao = 0;
        
        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }


        @Override
        public boolean hasNext() {
            /**
             * Iteração errada, contador i sobe, e sai do escopo do array. loop não retorna.
             * [COMPUTAÇÃO]
             */
            /**
             * Implementação do método hasNext() errada!
             * Não se percorre o array, guarda-se a posição atual.
             * [COMPUTAÇÃO]
             * [DESEMPENHO]
             */
            int tamanho = troco.papeisMoeda.length;
            if((posicao > tamanho) || (troco.papeisMoeda[posicao]== null)){
             return false;                
                }else{
                return true;
            }   
        }

        /**
         * 
         * Implementação completamente errada.
         * [COMPUTAÇÃO]
         * [DADOS]
         * [DESEMPENHO]
         * 
         */
        @Override
        public PapelMoeda next() {
            PapelMoeda item = troco.papeisMoeda[posicao]; 
            posicao++;
            return item;
        }

        @Override
        public void remove() {
            next();
        }
    }

