package sos.siho.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import sos.siho.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
