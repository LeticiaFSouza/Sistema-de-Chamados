/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import entidade.Pessoa;
import junit.framework.Assert;
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
public class PessoaTest {
    
    private static final long serialVersionUID = 1L;
    private String nome;
    private long telefone;

    public PessoaTest(String nome, long telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    /**
     * Test of getNome method, of class Pessoa.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Pessoa pes = new Pessoa(nome, telefone);
        String expResult = "";
        String result = pes.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Pessoa.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nnome = "";
        Pessoa pes = new Pessoa(nome, telefone);
        pes.setNome(nnome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class Pessoa.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Pessoa pes = new Pessoa(nome, telefone);
        long expResult = 0L;
        long result = pes.getTelefone();
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class Pessoa.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        long Novotelefone = 0L;
        Pessoa pes = new Pessoa(nome, telefone);
        pes.setTelefone(Novotelefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
