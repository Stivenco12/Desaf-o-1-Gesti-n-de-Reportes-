package gestion_de_resportes.Factory;

import gestion_de_resportes.Format;
import gestion_de_resportes.models.PDF;

public class PdfFactory extends FormatFactory {
    @Override
    public Format createFormat()  {
        return new PDF();
    }
}
