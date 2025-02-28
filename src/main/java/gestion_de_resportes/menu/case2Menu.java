package gestion_de_resportes.menu;

import java.util.Scanner;

import gestion_de_resportes.Format;
import gestion_de_resportes.Factory.ExcelFactory;

public class case2Menu {
    public static int case2() {
        try (Scanner sc = new Scanner(System.in)) { 
            int case2 = 0;
            Format excel = new ExcelFactory().createFormat();
            excel.generateReport();
            System.out.println("Deseas descargar el reporte? si/no");
            String menu2 = sc.nextLine();
            switch (menu2) {
                case "si":
                    excel.downloadReport();
                    break;
                case "no":
                    break;
            }
            return case2; 
        }
        
    }
}
