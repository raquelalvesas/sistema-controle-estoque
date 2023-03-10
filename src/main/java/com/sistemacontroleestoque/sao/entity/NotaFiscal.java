package com.sistemacontroleestoque.sao.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Entity
@NoArgsConstructor
@Data
public class NotaFiscal {

    private Caixa caixa;

    private Cliente cliente;

    private Funcionario funcionario;

    private Calendar calendar = Calendar.getInstance();

    /*public String mostrarNotaFiscal(){

        return "===================== Mercado Orientado a Compras ====================\n" + "Funcionário: " +
                funcionario.getNome() + "\nCliente: " + cliente.getNome()+ "\nData e hora da compra: " + dia +
                "/" + mes + "/" + ano + "   |   " + hora + ":" + minuto + ":" + segundo +
                "\n\n-------------------------------------------- Lista de Compras --------------------------------------------\n" +
                caixa.mostrarProdutos() +"\nValor total da compra: " + caixa.somarValorProdutos() + "\nvalor pago: " +
                cliente.getValorPago() + "\nTroco: " + caixa.mostrarTroco(cliente);
    }*/

}
