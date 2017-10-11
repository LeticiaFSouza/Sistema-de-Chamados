/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import entidade.Tecnico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41587634
 */
public class TecnicoTest {
    
    private static final long serialVersionUID = 1L;
    private String nome;
    private long telefone;
    
    public TecnicoTest(String nome, long telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    @Test
    public void testToString() {
        System.out.println("toString");
        Tecnico tec = new Tecnico(nome, telefone);
        String expResult = "";        
        assertEquals(expResult, tec.toString());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
