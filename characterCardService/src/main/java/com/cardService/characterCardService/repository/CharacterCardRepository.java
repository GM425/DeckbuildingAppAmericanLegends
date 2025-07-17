package com.cardService.characterCardService.repository;

import java.util.ArrayList;

import org.hibernate.query.criteria.JpaPredicate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardService.characterCardService.entity.CharacterCard;

@Repository
public interface CharacterCardRepository extends JpaRepository<CharacterCard, Long>{
    ArrayList<CharacterCard> findAll();
}
