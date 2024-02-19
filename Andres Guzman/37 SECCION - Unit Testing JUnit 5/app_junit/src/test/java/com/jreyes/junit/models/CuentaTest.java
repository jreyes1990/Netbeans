package com.jreyes.junit.models;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaTest {
  
  @Test
  public void testNombreCuenta(){
    Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
    // cuenta.setPersona("Andres");
    String esperado = "Andres";
    String real = cuenta.getPersona();
    assertEquals(esperado, real);
    assertTrue(real.equals("Andres"));
  }
}
