package gestion_de_resportes.Factory;

import gestion_de_resportes.Format;
import gestion_de_resportes.models.Excel;

public class ExcelFactory extends FormatFactory {
    @Override
    public Format createFormat()  {
        return new Excel();
    }
}
