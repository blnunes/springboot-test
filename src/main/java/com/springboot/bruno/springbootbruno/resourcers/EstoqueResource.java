package com.springboot.bruno.springbootbruno.resourcers;

import com.springboot.bruno.springbootbruno.dto.EstoqueDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EstoqueResource {

    @RequestMapping("/estoque")
    public List<EstoqueDTO> consultaEstoque() {

        return Arrays.asList(
                new EstoqueDTO.Builder()
                        .valor(new BigDecimal("20.00"))
                        .nomeProduto("Controle PlayStation5")
                        .descricaoProduto("Controle  mais Foda")
                        .quantidade(5).build(),
                new EstoqueDTO.Builder()
                        .valor(new BigDecimal("20.00"))
                        .nomeProduto("XboxOne")
                        .descricaoProduto("Video Game mais Foda")
                        .quantidade(5).build(),
                new EstoqueDTO.Builder()
                        .valor(new BigDecimal("20.00"))
                        .nomeProduto("PlayStation5")
                        .descricaoProduto("Video Game mais Foda")
                        .quantidade(5).build());
    }
}
