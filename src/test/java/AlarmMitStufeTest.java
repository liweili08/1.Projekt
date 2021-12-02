import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmMitStufeTest {
    @Test
    void stufeTestFarbe() {
        assertFalse(AlarmMitStufe.comeIn("grun", 52));
    }
    @Test
    void stufeTestGruenTrue() {
        assertTrue(AlarmMitStufe.comeIn("grün", 52));
    }
    @Test
    void stufeTestGruenFalse() {
        assertFalse(AlarmMitStufe.comeIn("grün", 66));
    }
    @Test
    void stufeTestRot() {
        assertFalse(AlarmMitStufe.comeIn("rot", 56));
    }
    @Test
    void stufeTestGelbFalse() {
        assertFalse(AlarmMitStufe.comeIn("gelb", 56));
    }
    @Test
    void stufeTestGelbTrue() {
        assertTrue(AlarmMitStufe.comeIn("gelb", 20));
    }
    @Test
    void stufeTest60() {
        assertTrue(AlarmMitStufe.comeIn("grün", 60));
    }
    @Test
    void stufeTest30() {
        assertTrue(AlarmMitStufe.comeIn("gelb", 30));
    }


}