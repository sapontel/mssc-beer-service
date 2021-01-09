package sos.siho.msscbeerservice.web.mappers;


import org.mapstruct.Mapper;
import sos.siho.msscbeerservice.domain.Beer;
import sos.siho.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
