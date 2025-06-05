import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrestamoBancario banco = new PrestamoBancario();

        while (!banco.metaAlcanzada()) {
            System.out.println("\n--- NUEVO CLIENTE ---");

            try {
                System.out.print("Nombre: ");
                String nombre = br.readLine();

                System.out.print("Sexo (M/F): ");
                String sexo = br.readLine().trim().toUpperCase();

                if (!sexo.equals("M") && !sexo.equals("F")) {
                    System.out.println("Error: el sexo debe ser 'M' o 'F'.");
                    continue; // Repetir cliente
                }

                System.out.print("Salario: ");
                double salario = Double.parseDouble(br.readLine());

                System.out.print("Monto del préstamo: ");
                double monto = Double.parseDouble(br.readLine());

                // Crear cliente y procesar
                Cliente cliente = new Cliente(nombre, sexo, salario, monto);
                banco.procesarCliente(cliente);

            } catch (NumberFormatException e) {
                System.out.println("Error: ingrese un número válido para salario o préstamo.");
                // No se procesa este cliente, se vuelve a pedir
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }

        banco.mostrarReporte();
    }
}
