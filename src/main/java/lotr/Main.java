package lotr;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        CharacterFactory factory = new CharacterFactory();
        Character character1 = factory.createCharacter();
        Character character2 = factory.createCharacter();

        while (character1.getClass().getSimpleName().equals(character2.getClass().getSimpleName())) {
            character2 = factory.createCharacter();
        }
        GameManager gameManager = new GameManager();
        gameManager.fight(character1, character2);
    }
}
