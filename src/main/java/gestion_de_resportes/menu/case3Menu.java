package gestion_de_resportes.menu;

import java.util.Scanner;

import gestion_de_resportes.Format;
import gestion_de_resportes.Factory.PdfFactory;

public class case3Menu {
public static int case3() {
        try (Scanner sc = new Scanner(System.in)) {
            int case3 = 0;
            Format pdf = new PdfFactory().createFormat(); 
            pdf.generateReport();
            System.out.println("Deseas descargar el reporte? si/no");
            String menu3 = sc.nextLine();
            switch (menu3) {
                case "si":
                    pdf.downloadReport();
                    break;
                case "no":
                    break;
            }
            return case3; 
        }
    }
}
