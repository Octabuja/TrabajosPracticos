
package Ejercicio2;

/**
 *
 * @author adria
 */
public class Celular {
    private String marca;
    private String modelo;
    private String imei;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(String marca, String modelo, String imei, Bateria bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
 
}
