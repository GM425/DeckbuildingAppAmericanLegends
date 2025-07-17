CREATE DATABASE IF NOT EXISTS CARD_CHARACTER_DB;

USE CARD_CHARACTER_DB;

CREATE TABLE IF NOT EXISTS card_character_db (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) UNIQUE NOT NULL,
    brand VARCHAR(50) NOT NULL,
    image VARCHAR(50) NOT NULL,
    cost INT NOT NULL,
    draw INT NOT NULL,
    accuracy INT NOT NULL,
    combat INT NOT NULL,
    toughness INT NOT NULL,
    temperment VARCHAR(50) NOT NULL,
    alcoholism INT NOT NULL,
    deception INT NOT NULL,
    womenizing INT NOT NULL,
    recSubstances INT NOT NULL,
    skillType1 VARCHAR(50) NOT NULL,
    skillType1Rating VARCHAR(50) NOT NULL,
    skillType2 VARCHAR(50) NOT NULL,
    skillType2Rating VARCHAR(50) NOT NULL,
    skillType3 VARCHAR(50) NOT NULL,
    skillType3Rating VARCHAR(50) NOT NULL,
    skillType4 VARCHAR(50) NOT NULL,
    skillType4Rating VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
)