package com.cardService.characterCardService.service;

import com.cardService.characterCardService.entity.CharacterCard;
import com.cardService.characterCardService.repository.CharacterCardRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class CharacterCardService {

    private CharacterCardRepository characterCardRepository;

    public CharacterCardService(CharacterCardRepository characterCardRepository){
        this.characterCardRepository = characterCardRepository;
    }

    public void createCard(CharacterCard charactercard){
        characterCardRepository.save(charactercard);
    }

    public Optional<ArrayList<CharacterCard>> getAllCards(){
        ArrayList<CharacterCard> characterCardsAll = characterCardRepository.findAll();
        return characterCardsAll.isEmpty() ? Optional.empty() : Optional.of(characterCardsAll);
    }
}
