import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrestamoBancario banco = new PrestamoBancario();

        while (!banco.metaAlcanzada()) {
            System.out.println("\n--- NUEVO CLIENTE ---");

            System.out.print("Nombre: ");
            String nombre = br.readLine();

            System.out.print("Sexo (M/F): ");
            String sexo = br.readLine();

            System.out.print("Salario: B/.");
            double salario = Double.parseDouble(br.readLine());

            System.out.print("Monto del préstamo: B/.");
            double monto = Double.parseDouble(br.readLine());

            Cliente cliente = new Cliente(nombre, sexo, salario, monto);
            banco.procesarCliente(cliente);
        }

        banco.mostrarReporte();
    }
}
