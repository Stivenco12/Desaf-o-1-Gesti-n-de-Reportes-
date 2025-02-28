package gestion_de_resportes.models;
import gestion_de_resportes.Format;
public class Excel implements Format {
   @Override
    public void generateReport() {
        System.out.println("generndo reporte Excel");
    }

    @Override
    public void downloadReport() {
        System.out.println("Descargando reporte Excel");
    }
}
