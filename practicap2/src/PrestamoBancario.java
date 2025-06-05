public class PrestamoBancario {
    private double totalPrestado = 0.0;
    private int totalClientes = 0;
    private int clientesAprobados = 0;

    private String hombresAprobados = "";
    private String mujeresAprobadas = "";

    public void procesarCliente(Cliente c) {
        totalClientes++;

        if (c.esAprobado()) {
            if (totalPrestado + c.getMontoPrestamo() > 1_000_000.00) {
                System.out.println("Este préstamo excede el millón, no se puede aprobar.");
                return;
            }

            System.out.println("Préstamo APROBADO.");
            totalPrestado += c.getMontoPrestamo();
            clientesAprobados++;

            if (c.getSexo().equals("M")) {
                hombresAprobados += "- " + c.getNombre() + "\n";
            } else if (c.getSexo().equals("F")) {
                mujeresAprobadas += "- " + c.getNombre() + "\n";
            }
        } else {
            System.out.println("Préstamo NO aprobado.");
        }
    }

    public boolean metaAlcanzada() {
        return totalPrestado >= 1_000_000.00;
    }

    public void mostrarReporte() {
        System.out.println("\n=== REPORTE FINAL ===");
        System.out.println("Total de clientes tramitados: " + totalClientes);
        System.out.println("Clientes con préstamo aprobado: " + clientesAprobados);

        System.out.println("\nHombres con préstamo aprobado:");
        System.out.print(hombresAprobados);

        System.out.println("\nMujeres con préstamo aprobado:");
        System.out.print(mujeresAprobadas);
    }
}
