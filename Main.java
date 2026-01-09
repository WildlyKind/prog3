import home.Atmosphere;
import people.Giant;
import people.Magic;
import people.Mood;
import people.Person;
import home.Home;
import items.eat.Cake;
import items.eat.enums.*;
import items.*;

public class Main {
    public static void main(String[] args) { 
        Giant hagrid = new Giant("Хагрид", Mood.HAPPY, 120, 100);
        Person harry = new Person("Гарри", Mood.HAPPY, 35, 85);
        Person veron = new Person("Верон", Mood.SCARED, 100, 90);
        Person dudley = new Person("Дадли", Mood.SCARED, 65, 90);
        Person petunia = new Person("Петунья", Mood.SCARED, 75, 90);

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
    }
}
