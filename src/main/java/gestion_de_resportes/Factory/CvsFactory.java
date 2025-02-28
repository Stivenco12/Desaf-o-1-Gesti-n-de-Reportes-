package gestion_de_resportes.Factory;

import gestion_de_resportes.Format;
import gestion_de_resportes.models.CVS;


public class CvsFactory extends FormatFactory {
    @Override
    public Format createFormat() {
        return new CVS();
    }
}
