/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import entidade.Chamado;
import entidade.RegistroChamado;
import entidade.Tecnico;
import java.text.DateFormat;
import java.util.Calendar;
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
public class RegistroChamadoTest {



    private static final long serialVersionUID = 1L;
    private Integer codigo;
    private String hora;
    private String data;
    private String assunto;
    private Tecnico tecnico;
    private Chamado chamado;

    public RegistroChamadoTest(String assunto, Chamado chamado, Tecnico tecnico) {
        Calendar c = Calendar.getInstance();
        this.hora = DateFormat.getTimeInstance().format(c.getTime());
        this.data = DateFormat.getDateInstance().format(c.getTime());
        this.assunto = assunto;
        this.tecnico = tecnico;
        this.chamado = chamado;
    }    
    
    
    /**
     * Test of getCodigo method, of class RegistroChamado.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        Integer expResult = null;        
        assertEquals(expResult, RegC.getCodigo());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class RegistroChamado.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        this.codigo = null;
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        RegC.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChamado method, of class RegistroChamado.
     */
    @Test
    public void testSetChamado() {
        System.out.println("setChamado");
        this.chamado = null;
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        RegC.setChamado(chamado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChamado method, of class RegistroChamado.
     */
    @Test
    public void testGetChamado() {
        System.out.println("getChamado");
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        Chamado expResult = null;        
        assertEquals(expResult, RegC.getChamado());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class RegistroChamado.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        String expResult = "";        
        assertEquals(expResult, RegC.getHora());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class RegistroChamado.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        RegC.setHora(hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class RegistroChamado.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        String expResult = "";        
        assertEquals(expResult, RegC.getData());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class RegistroChamado.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        RegC.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssunto method, of class RegistroChamado.
     */
    @Test
    public void testGetAssunto() {
        System.out.println("getAssunto");
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        String expResult = "";
        assertEquals(expResult, RegC.getAssunto());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAssunto method, of class RegistroChamado.
     */
    @Test
    public void testSetAssunto() {
        System.out.println("setAssunto");
        String assunto = "";
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        RegC.setAssunto(assunto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTecnico method, of class RegistroChamado.
     */
    @Test
    public void testGetTecnico() {
        System.out.println("getTecnico");
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        Tecnico expResult = null;
        Tecnico result = RegC.getTecnico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTecnico method, of class RegistroChamado.
     */
    @Test
    public void testSetTecnico() {
        System.out.println("setTecnico");
        Tecnico tecnico = null;
        RegistroChamado RegC = new RegistroChamado(assunto, chamado, tecnico);
        RegC.setTecnico(tecnico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
