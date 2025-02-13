package org.com.tokio.controllers;

import org.com.tokio.models.request.TransferRequest;
import org.com.tokio.models.response.Response;
import org.com.tokio.services.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/transferencia")
@CrossOrigin(origins = "*")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @PostMapping
    public ResponseEntity<?> post(@RequestBody @Validated TransferRequest transferRequest) {
        try{
            transferService.save(transferRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(new Response(true,"Agendamento concluído com sucesso"));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new Response(false, "ERRO: " + e.getMessage()));
        }
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(transferService.findAll());
    }
}
