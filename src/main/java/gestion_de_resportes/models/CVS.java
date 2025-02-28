package gestion_de_resportes.models;

import gestion_de_resportes.Format;

public class CVS implements Format{
    @Override
    public void generateReport() {
        System.out.println("generndo reporte Cvs........");
        System.out.println("Se ha generado el reporte");
    }

    @Override
    public void downloadReport() {
        System.out.println("Descargando reporte Cvs...........");
        System.out.println("Se ha descargado el reporte");
    }

}
