public class Cliente {
    private String nombre;
    private String sexo;
    private double salario;
    private double montoPrestamo;

    public Cliente(String nombre, String sexo, double salario, double montoPrestamo) {
        this.nombre = nombre;
        this.sexo = sexo.trim().toUpperCase();
        this.salario = salario;
        this.montoPrestamo = montoPrestamo;
    }

    public boolean esAprobado() {
        return salario > 800 && montoPrestamo >= 25000 && montoPrestamo <= 400000;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }
}
