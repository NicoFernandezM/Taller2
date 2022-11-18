public class CorreoElectronico {
    private String direccionCorreoElectronico, proveedorDeCorreo;

    public CorreoElectronico(String direccionCorreoElectronico, String proveedorDeCorreo) {
        this.direccionCorreoElectronico = direccionCorreoElectronico;
        this.proveedorDeCorreo = proveedorDeCorreo;
    }

    public String getDireccionCorreoElectronico() {
        return direccionCorreoElectronico;
    }

    public String getProveedorDeCorreo() {
        return proveedorDeCorreo;
    }
}
