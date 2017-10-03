package br.com.nuvemapp.springcloudfeign.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.nuvemapp.springcloudfeign.model.CepResponse;

@Repository
public interface CepRepository extends PagingAndSortingRepository<CepResponse, String> {
	
}
