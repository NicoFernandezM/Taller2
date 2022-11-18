public class Chasis {
    private int numeroDeChasis;
    private String tipoDeMaterial;

    public Chasis(int numeroDeChasis, String tipoDeMaterial) {
        this.numeroDeChasis = numeroDeChasis;
        this.tipoDeMaterial = tipoDeMaterial;
    }

    public int getNumeroDeChasis() {
        return numeroDeChasis;
    }

    public String getTipoDeMaterial() {
        return tipoDeMaterial;
    }
}
