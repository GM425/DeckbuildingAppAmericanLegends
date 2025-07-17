package com.cardService.characterCardService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="charactercard")
public class CharacterCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String brand;
        
    @Column
    private String image;
        
    @Column
    private int cost;
        
    @Column
    private int draw;
        
    @Column
    private int accuracy;
        
    @Column
    private int combat;
       
    @Column
    private int toughness;
        
    @Column
    private int temperment;
        
    @Column
    private int alcoholism;
    
    @Column
    private int deception;
    
    @Column
    private int womenizing;
    
    @Column
    private int recSubstances;
        
    @Column
    private String skillType1;
        
    @Column
    private String skillType1Rating;
        
    @Column
    private String skillType2;
        
    @Column
    private String skillType2Rating;

    @Column
    private String skillType3;

    @Column
    private String skillType3Rating;

    @Column
    private String skillType4;

    @Column
    private String skillType4Rating;

}
