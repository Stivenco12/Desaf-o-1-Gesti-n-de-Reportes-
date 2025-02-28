package gestion_de_resportes;

import java.util.Scanner;
import gestion_de_resportes.menu.*;

public class Main {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {   
            InformationMenu.Informationmenu();
            String menu0;
            menu0 = sc.nextLine();
            switch (menu0) {
                case "1":
                    case1Menu.case1();
                    break;
                case "2":
                    case2Menu.case2();
                    break;
                case "3":
                        case3Menu.case3();
                    break;
                case "4":
                    System.out.println("saliendo......");
                    break;
                }
                
        }
    }
}