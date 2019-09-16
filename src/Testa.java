/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Barbara
 */
public class Testa{
 public static void main(String[] args) throws SaldoInsuficienteException {
//teste 1 - exception
//     int inteiro = 5;
//  try{
//      if (inteiro > 4){
//      throw new SaldoInsuficienteException();
//      } 
//    }catch(Exception me){
//     System.err.println(me.getMessage());
//   }

//
////teste 2 - ticketMachine
//    TicketMachine tm = new TicketMachine(2);
//    
////    tm.inserir(2);
////    tm.inserir(2);
////    tm.inserir(5);
//    tm.inserir(4);
//    

//teste 3 - Troco
    

    PapelMoeda[] p = new PapelMoeda[6];
    p[0] = new PapelMoeda(2,0);
    p[1] = new PapelMoeda(5,0);
    p[2] = new PapelMoeda(10,0);
    p[3] = new PapelMoeda(20,0);
    p[4] = new PapelMoeda(50,0);
    p[5] = new PapelMoeda(100,0);
    
    
    Troco t = new Troco(p,20);
    t.calculaTroco();
    TrocoIterator ti = new TrocoIterator(t);
    if(ti.hasNext()){
    System.out.println("true" + ti.next().getValor());
    }else{
    System.out.println("false");
    }
    
        for(int i = (p.length-1);i>=0;i-- ){
            System.out.println("Nota: "
            + p[i].getValor()+"\n Quantidade: " + p[i].getQuantidade());
        }
  }
}

