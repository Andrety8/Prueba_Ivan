import java.io.File;

public class ListarEscritorio {
    public static void main(String[] args) {
        String escritorio = System.getProperty("user.home") + File.separator + "Desktop";

        File carpeta = new File(escritorio);

        if (!carpeta.exists()) {
            System.out.println("No se encontró la carpeta del Escritorio.");
            return;
        }

        File[] archivos = carpeta.listFiles();

        if (archivos == null || archivos.length == 0) {
            System.out.println("El Escritorio está vacío.");
            return;
        }

        System.out.println("Archivos en el Escritorio:");
        for (File archivo : archivos) {
            System.out.println(archivo.getName());
        }
    }
}
