
package Ejercicio13;

/**
 *
 * @author adria
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado para: " + qr.getUsuario().getNombre() + " - Valor:" + qr.getValor());
    }
    
}
