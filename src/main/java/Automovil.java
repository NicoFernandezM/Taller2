public class Automovil {
    private String marca, modelo;
    private int añoDeFabricacion, precio;
    private Motor motor;
    private Chasis chasis;

    public Automovil(String marca, String modelo, int añoDeFabricacion, int precio, Motor motor, Chasis chasis) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoDeFabricacion = añoDeFabricacion;
        this.precio = precio;
        this.motor = motor;
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public int getPrecio() {
        return precio;
    }
}
