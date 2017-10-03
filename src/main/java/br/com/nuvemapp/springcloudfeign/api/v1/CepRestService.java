package br.com.nuvemapp.springcloudfeign.api.v1;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.com.nuvemapp.springcloudfeign.model.CepResponse;
import br.com.nuvemapp.springcloudfeign.repository.CepRepository;
import br.com.nuvemapp.springcloudfeign.service.CepService;

@RestController
@AllArgsConstructor
@RequestMapping("v1/ceps")
public class CepRestService {

    private final CepService cepService;
    private final CepRepository cepRepository;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{cep}", method = RequestMethod.GET)
    public CepResponse getCep(@PathVariable String cep) {
        return cepRepository.save(cepService.getCep(cep));
    }
}