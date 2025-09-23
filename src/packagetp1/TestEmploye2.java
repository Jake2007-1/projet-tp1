package packagetp1;

import org.junit.*;
import static org.junit.Assert.*;

public class TestEmploye2
{
    private Employe unEmploye, deuxEmploye;

  // cette méthode sera appelée avant chaque méthode de test
    @Before
    public void setUp ()
    {
                                        //nom, numero, salaireHoraire, nbreHeures,ancienneté
        unEmploye = new Employe ( "Cloutier", "323",       12.60,           32,          4);
    }
}
