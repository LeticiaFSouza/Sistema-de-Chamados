/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import entidade.Empresa;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41587634
 */
public class EmpresaTest {
    
    private long numeroContrato;
    private String nomeEmpresa;
    
    
    
    public EmpresaTest(long numeroContrato, String nomeEmpresa) {
        this.numeroContrato = numeroContrato;
        this.nomeEmpresa = nomeEmpresa;
    }
    
    /**
     * Test of getNumeroContrato method, of class Empresa.
     */
    @Test
    public void testGetNumeroContrato() {
        System.out.println("getNumeroContrato");
        Empresa emp = new Empresa(10,nomeEmpresa);
        Assert.assertEquals(10, emp.getNumeroContrato());
       // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroContrato method, of class Empresa.
     */
    @Test
    public void testSetNumeroContrato() {
        System.out.println("setNumeroContrato");
        long  NovoNumeroContrato = 10;
        Empresa emp = new Empresa(numeroContrato,nomeEmpresa);
        emp.setNumeroContrato(NovoNumeroContrato);
        Assert.assertEquals(10, emp.getNumeroContrato());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeEmpresa method, of class Empresa.
     */
    @Test
    public void testGetNomeEmpresa() {
        System.out.println("getNomeEmpresa");
        Empresa emp = new Empresa(numeroContrato,nomeEmpresa);
        Assert.assertEquals(10, emp.getNumeroContrato());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeEmpresa method, of class Empresa.
     */
    @Test
    public void testSetNomeEmpresa() {
        System.out.println("setNomeEmpresa");        
        Empresa emp = new Empresa(numeroContrato,nomeEmpresa);
        emp.setNomeEmpresa(nomeEmpresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Empresa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Empresa emp = new Empresa(numeroContrato,nomeEmpresa);
        String expResult = "";        
        assertEquals(expResult, emp.toString());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}