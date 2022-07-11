/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package teste;

import com.mycompany.trabalhoiii_testes_esw.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Luan
 */
public class GerenciaFuncionarioTeste {
    
    private GerenciaFuncionario gerenciaTesteFuncionario;
    
    @BeforeEach
    public void setUp() throws Exception {
        GerenciaFuncionario gerenciaFuncionario = new GerenciaFuncionario();
        
        Funcionario funcionario = new Funcionario("Ricardo", "19823", 1000, false);
        gerenciaFuncionario.AdicionarFuncionarioNoSistema(funcionario);
        
        Funcionario funcionario2 = new Funcionario("Amaral", "123353", 3000, false);
        gerenciaFuncionario.AdicionarFuncionarioNoSistema(funcionario2);
        
        Funcionario funcionario3 = new Funcionario("Jose", "12222", 10000, true);
        gerenciaFuncionario.AdicionarFuncionarioNoSistema(funcionario3);       
        
        this.gerenciaTesteFuncionario = gerenciaFuncionario;
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        this.gerenciaTesteFuncionario.LimparListas();
    }
    
    @Test
    public void testInsereNovoFuncionario() {
        Funcionario funcionario = new Funcionario("Leandro", "154353", 3500, true);
        
        gerenciaTesteFuncionario.AdicionarFuncionarioNoSistema(funcionario);

        Funcionario funcionarioPesquisado = gerenciaTesteFuncionario.PuxarDadosFuncionario("154353");
        
        assertEquals("Leandro", funcionarioPesquisado.getNome());
    }

    @Test
    public void testRemoveFuncionario() {
        
        gerenciaTesteFuncionario.RemoverFuncionarioDoSistema("123353");
        
        Funcionario funcionarioPesquisado = gerenciaTesteFuncionario.PuxarDadosFuncionario("123353");
        
        assertNull(funcionarioPesquisado);
    }
    
    @Test
    public void testPuxarDadosFuncionario() {
          
        Funcionario funcionarioPesquisado = gerenciaTesteFuncionario.PuxarDadosFuncionario("12222");
        
        assertEquals("Jose", funcionarioPesquisado.getNome());
    }
    
}
