package gestion_de_resportes.menu;

import java.util.Scanner;
import gestion_de_resportes.Format;
import gestion_de_resportes.Factory.CvsFactory;

public class case1Menu {
    public static int case1() {
        try (Scanner sc = new Scanner(System.in)) { 
            int case1 = 0;
            Format cvs = new CvsFactory().createFormat();
            cvs.generateReport();
            System.out.println("Deseas descargar el reporte? si/no");
            String menu1 = sc.nextLine();
            switch (menu1) {
                case "si":
                    cvs.downloadReport();
                    break;
                case "no":
                    break;
                }
            return case1;
        }
    }
}
