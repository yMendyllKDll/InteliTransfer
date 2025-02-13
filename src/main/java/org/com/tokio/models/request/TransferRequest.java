package org.com.tokio.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransferRequest {

    @JsonProperty("contaOrigem")
    private String contaOrigem;

    @JsonProperty("contaDestino")
    private String contaDestino;

    @JsonProperty("valor")
    private Double valor;

    @JsonProperty("dataAgendamento")
    private String dataAgendamento;
}
