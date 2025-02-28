package gestion_de_resportes.models;

import gestion_de_resportes.Format;

public class PDF implements Format{
    @Override
    public void generateReport() {
        System.out.println("generndo reporte PDF");
    }

    @Override
    public void downloadReport() {
        System.out.println("Descargando reporte PDF");
    }
}
