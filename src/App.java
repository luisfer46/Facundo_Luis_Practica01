import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto de tipo Tarjeta
        System.out.println("Ingrese el número de la tarjeta:");
        int numeroTarjeta = scanner.nextInt();
        
        System.out.println("Ingrese el saldo inicial:");
        float saldoInicial = scanner.nextFloat();

        System.out.println("¿La tarjeta está activa? (true/false):");
        boolean activo = scanner.nextBoolean();

        System.out.println("Ingrese el precio a consumir:");
        float precio = scanner.nextFloat();

        Tarjeta tarjeta = new Tarjeta(numeroTarjeta, saldoInicial, activo, precio);

        // Crear un objeto de tipo Usuario
        scanner.nextLine(); // Limpiar buffer

        System.out.println("Ingrese el apellido paterno:");
        String paterno = scanner.nextLine();

        System.out.println("Ingrese el apellido materno:");
        String materno = scanner.nextLine();

        System.out.println("Ingrese los nombres:");
        String nombres = scanner.nextLine();

        System.out.println("Ingrese el documento:");
        String documento = scanner.nextLine();

        System.out.println("Ingrese el tipo de documento:");
        String tipoDocumento = scanner.nextLine();

        Usuario usuario = new Usuario(paterno, materno, nombres, documento, tipoDocumento);

        // Pruebas de recarga y consumo
        System.out.println("Ingrese monto para recargar en la tarjeta:");
        float montoRecarga = scanner.nextFloat();
        
        if (tarjeta.recargar(montoRecarga)) {
            System.out.println("Recarga exitosa. Nuevo saldo: " + tarjeta.getSaldo());
        } else {
            System.out.println("Recarga fallida.");
        }

        System.out.println("¿Desea consumir con la tarjeta? (true/false):");
        boolean deseaConsumir = scanner.nextBoolean();

        if (deseaConsumir && tarjeta.consumir()) {
            System.out.println("Consumo exitoso. Saldo restante: " + tarjeta.getSaldo());
        } else {
            System.out.println("Consumo fallido.");
        }

        scanner.close();
    }
}
