package br.com.nuvemapp.springcloudfeign.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CepResponse {

    @Id
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;

}