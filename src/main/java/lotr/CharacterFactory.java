package lotr;//package ua.edu.ucu;

import java.util.List;
import java.util.Random;
import java.lang.reflect.InvocationTargetException;

public class CharacterFactory{
    public Character createCharacter()
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<Class<? extends Character>> characterClasses = List.of(Elf.class, Hobbit.class, Knight.class, King.class);
        int randomIndex = new Random().nextInt(characterClasses.size());  // generate a random index
        Class<? extends Character> selectedCharacterClass = characterClasses.get(randomIndex);

        Character character = selectedCharacterClass.getConstructor().newInstance();

        return character;
    }
}
