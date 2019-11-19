/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallers;

/**
 *
 * @author CltControl
 */
public class Pay_Card implements Pay {

    @Override
    public void pay(String method, Book book) {
            System.out.println("El pago se realizara con tarjeta");
    }
    
}
