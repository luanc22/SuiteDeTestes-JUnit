/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
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
public class GerenciaConcessionariaTeste {
    
    private GerenciaConcessionaria gerenciaTesteConcessionaria;
    
    @BeforeEach
    public void setUp() throws Exception {
        GerenciaConcessionaria gerenciaConcessionaria = new GerenciaConcessionaria();
        
        Carro carro = new Carro("EUA-2313", "206", "Peugeot", "Prata", "2008", 26000, true);
        gerenciaConcessionaria.AdicionarCarroNoInventario(carro);
        
        Carro carro2 = new Carro("AFG-2113", "KA", "Ford", "Vermelho", "2005", 12000, true);
        gerenciaConcessionaria.AdicionarCarroNoInventario(carro2);
        
        Carro carro3 = new Carro("OPQ-6314", "Celta", "Chevrolet", "Preto", "2002", 15000, true);
        gerenciaConcessionaria.AdicionarCarroNoInventario(carro3);       
        
        this.gerenciaTesteConcessionaria = gerenciaConcessionaria;
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        this.gerenciaTesteConcessionaria.LimparListas();
    }
    
    @Test
    public void testInsereCarroNovo() {
        Carro novoCarro = new Carro("PAS-2813", "Gol", "Volkswagen", "Branco", "2004", 12000, true);

        this.gerenciaTesteConcessionaria.AdicionarCarroNoInventario(novoCarro);

        Carro carroPesquisado = gerenciaTesteConcessionaria.PuxarDadosCarro("PAS-2813");
        
        assertEquals("Gol", carroPesquisado.getModelo());
    }

    @Test
    public void testRemoveCarro() {
        
        gerenciaTesteConcessionaria.RemoverCarroDoInventario("AFG-2113");
        
        Carro carroPesquisado = gerenciaTesteConcessionaria.PuxarDadosCarro("AFG-2113");
        
        assertNull(carroPesquisado);
    }
    
    @Test
    public void testPuxarDadosCarro() {
          
        Carro carroPesquisado = gerenciaTesteConcessionaria.PuxarDadosCarro("OPQ-6314");
        
        assertEquals("Celta", carroPesquisado.getModelo());
    }
    
}
