package br.com.nuvemapp.springcloudfeign.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import br.com.nuvemapp.springcloudfeign.exception.ResourceNotFoundException;
import br.com.nuvemapp.springcloudfeign.model.CepResponse;
import br.com.nuvemapp.springcloudfeign.repository.CepRepository;

import static java.util.Objects.isNull;

@Component
@AllArgsConstructor
public class CepServiceFallback implements CepService {

    private final CepRepository cepRepository;

    @Override
    public CepResponse getCep(String cep) {
        CepResponse cepResponse = cepRepository.findOne(cep);
        if(isNull(cepResponse)) {
            throw new ResourceNotFoundException();
        }
        return cepResponse;
    }
}
