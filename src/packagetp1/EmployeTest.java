package packagetp1;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeTest {

    private Employe unEmploye;

    @BeforeEach
    void setUp() {
        this.unEmploye = new Employe ( "Cloutier", "323", 12.60, 32, 4);
    }

    @Test
    void testSalaireBrut() {
        assertEquals(403.2, this.unEmploye.salaireBrut() );
    }

    @Test
    void testSalaireNetAvantImpot() {
        assertEquals(332.96128, this.unEmploye.salaireNetAvantImpot());
    }

    @Test
    void testImpotFederal() {
        assertEquals(63.2626432, this.unEmploye.impotFederal());
    }

    @Test
    void testImpotProvincial() {
        assertEquals(66.592256, this.unEmploye.impotProvincial());
    }

    @Test
    void testSalaireNetApresImpot() {
        assertEquals(203.10638079999995, this.unEmploye.salaireNetApresImpot());
    }

    @Test
    void testJoursVacances() {
        assertEquals(19, this.unEmploye.joursVacances());
    }

}