package com.cardService.characterCardService.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardService.characterCardService.entity.CharacterCard;
import com.cardService.characterCardService.service.CharacterCardService;

@RestController
@RequestMapping("/charactercards")
public class CharacterCardController {
    
    private CharacterCardService characterCardService;

    public CharacterCardController(CharacterCardService characterCardService){
        this.characterCardService = characterCardService;
    }

    @PostMapping("/create")
    public String addCard(@RequestBody CharacterCard characterCard){
        characterCardService.createCard(characterCard);
        return "Created Card Successfully";
    }

    @GetMapping("/all")
    public ArrayList<CharacterCard> getAllCharacterCards(){
        Optional<ArrayList<CharacterCard>> characterCards = characterCardService.getAllCards();
        return characterCards.orElseThrow(() -> new RuntimeException("There are no appointments yet."));
    }

    @GetMapping("/check")
    public String checkHealth(){
        return "healthy";
    }
}
