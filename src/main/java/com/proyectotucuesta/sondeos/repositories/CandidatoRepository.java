package com.proyectotucuesta.sondeos.repositories;

import com.proyectotucuesta.sondeos.models.CandidatoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends MongoRepository<CandidatoModel,String> {
    
}
