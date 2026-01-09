import java.util.Random;

import home.*;
import people.*;
import items.eat.enums.*;
import items.*;
import items.eat.*;

public class Main {
    public static void main(String[] args) { 
        Giant hagrid = new Giant("Хагрид", Mood.HAPPY, 120, 100);
        Person harry = new Person("Гарри", Mood.HAPPY, 35, 85);
        Person veron = new Person("Верон", Mood.SCARED, 100, 90);
        Person dudley = new Person("Дадли", Mood.SCARED, 65, 90);
        Person petunia = new Person("Петунья", Mood.SCARED, 75, 90);

        Person[] persons = {hagrid, harry, veron, dudley, petunia};

        Home home = new Home(Atmosphere.STRESSFUL, 23.0);

        Sofa sofa = new Sofa(1, "Диван", false, false, 300, 0.3, 0, 0);

        Gun gun = new Gun(1, "Ружье", false, false, true);

        veron.getItem(gun);
        veron.inHands = gun;
        hagrid.getItem(gun);
        hagrid.inHands = gun;
        veron.inHands = null;

        hagrid.tieInKnot();
        
        Cake cake = new Cake(1, "Торт", false, false, true, Glaze.GREEN, Filling.CHOCOLATE);
        hagrid.inHands = cake;
        hagrid.speak("""
            В общем, так, Гарри, первым делом с днём рождения. Я тут кой-чего припас по случаю. 
            Только, кажись, я на него присел малешко, но вкус-то должен быть ничего. """);
        harry.setMood(Mood.HAPPY);
        
        harry.getItem(cake);
        harry.inHands = cake;
        hagrid.inHands = null;

        harry.speak("Кто вы такой?");
        harry.setMood(Mood.SURPRISE);
        harry.inHands = null;
        hagrid.chuckle();
        hagrid.speak("Ах ты, верно, я ещё не представился. Рубеус Хагрид, главный ключник и садовник Хогвартса");

        hagrid.handshake(harry);

        hagrid.speak("Так как там чаёк-то продвигается? Ежели у вас есть чего покрепше, то и от того не откажусь, ясно дело.");

        hagrid.chuckle();

        Fireplace fireplace = new Fireplace(1, "Камин", false, false,false);

        Magic magic = new Magic();
        magic.makeFire(fireplace, home);
        harry.setMood(Mood.HAPPY);

        hagrid.sitDown(sofa);

        for (Item item : hagrid.magicItems) {
            hagrid.inHands = item;
        }

        Mead mead = new Mead(1, "Янтарно-желтая жидкость", false, false);
        hagrid.inHands = mead;

        hagrid.drink(mead);

        Tea tea = hagrid.cookTea(1);
        Random rand = new Random();
        int countSausages = rand.nextInt(3) + 3;
        Sausages sausages = hagrid.cookSausages(countSausages);
        sausages.burnt = true;

        home.updateAtmosphere(Atmosphere.THE_SMELL_OF_FOOD);
        for (Person person: persons) {
            person.setMood(Mood.HUNGRY);
        }

        dudley.bustle(dudley);
        veron.speak("Дадли, не смей ничего у него брать!");
        hagrid.chuckle();
        hagrid.speak("Не боись, Дурсли, в энтом твоём холодце жиру и так хватает");
        dudley.setMood(Mood.SCARED);

        harry.inHands = sausages;
        harry.eat(sausages);
        hagrid.eat(sausages);
        harry.setMood(Mood.SURPRISE);
        harry.speak("Извините, пожалуйста, но я всё-таки так и не понял, кто вы такой");

        hagrid.drink(tea);
    }
}
