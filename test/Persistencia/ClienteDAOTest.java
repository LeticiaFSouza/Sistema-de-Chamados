/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.ClienteEmpresa;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static sun.font.FontManagerNativeLibrary.load;

/**
 *
 * @author 41587634
 */
public class ClienteDAOTest {
    
    private HashMap<Long, ClienteEmpresa> cashClientes;
    private static final String nomeArquivo = "clientes.dat";
    
    public ClienteDAOTest() {
        this.cashClientes = new HashMap<>();
        load();        
    }

    @Test
    public void validarCPFTest() {
    
        System.out.println("ValidarCPF");
        long NewCPF = 115254691-25;
        
        ClienteDAO CDT = new ClienteDAO();
        if (CDT.validarCPF(NewCPF)){
            System.out.println("Validado com sucesso!!");
        }else{
            fail("Falha na validação do Teste!");
        }                
    }
    
    @Test
    public void putTest() {
        
        ClienteDAO CDT = new ClienteDAO();
        long NewCPF = 115254691-25;
        ClienteEmpresa NewCliente = CDT.cashClientes.get(NewCPF);
        
        NewCliente.setCodigo(CDT.gerarCodigo());
        Assert.assertEquals(null, CDT.cashClientes.put(NewCliente.getCpf(), NewCliente));
        CDT.persit();
        fail("Falha na validação do Teste!");       
    }   
}
