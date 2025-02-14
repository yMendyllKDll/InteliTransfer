package org.com.tokio.services;

import org.com.tokio.Entity.Transferencia;
import org.com.tokio.calculos.Taxas;
import org.com.tokio.models.request.TransferRequest;
import org.com.tokio.repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Service
public class TransferService {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Autowired
    private TransferRepository transferRepository;

    @Autowired
    private Taxas taxas;


    public void save(TransferRequest transferRequest){
        try{
            Transferencia transferencia = criarTransferencia(transferRequest);
            transferRepository.save(transferencia);
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    public Transferencia criarTransferencia(TransferRequest transfRequest) {
        LocalDateTime dataTransferencia = LocalDateTime.parse(transfRequest.getDataTransferencia(), FORMATTER);
        Double taxa = taxas.calcularTaxa(dataTransferencia);
        Double valorTaxa = taxas.calcularValorTaxa(taxa, transfRequest.getValor());

        return Transferencia.builder()
                .contaOrigem(transfRequest.getContaOrigem())
                .contaDestino(transfRequest.getContaDestino())
                .taxa(taxa)
                .valorTaxa(valorTaxa)
                .valor(transfRequest.getValor() + valorTaxa)
                .dtAgendamento(LocalDateTime.now())
                .dtTransferencia(dataTransferencia)
                .build();
    }

    public List<Transferencia> findAll() {
        try {
            return transferRepository.findAll();
        }catch (RuntimeException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }
}
