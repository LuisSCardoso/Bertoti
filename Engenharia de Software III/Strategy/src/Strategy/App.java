/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strategy;

/**
 *
 * @author Manhã
 */
public class App {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setStrategy(new GooglePlayPaymentStrategy());
        paymentContext.pay(100.0);

        paymentContext.setStrategy(new PixPaymentStrategy());
        paymentContext.pay(200.0);
    }
}

