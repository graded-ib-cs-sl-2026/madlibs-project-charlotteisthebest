import java.util.Scanner;

public class App {

    /**
     * starts madlib game, tells the user to make a choice between between the 2
     * versions of the game or to exit the game
     */
    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a madlib A or B, or anything else to exit the game:");
        // I learned how to do toUpperCase while I was watching a youtube video:
        // https://www.youtube.com/watch?v=dwm_BR6K_po I got the insperation to do this
        // because I kept on putting lower case and reverting back to my invalid choice
        // so i swearched up in the internet what I could do to fiz that and they showed
        // me this code. I later looked at the code and implemented it into my work it
        // was super simple and not very time consumming to learn.
        String choice = input.nextLine().toUpperCase();
        // We already learned if statments in class i did a few practice rounds in cs
        // awesome to make sure that i knew how to use it and then i implemented it into
        // my code wich truthfully took alot of trial and error but was very worth it. I
        // didnt however know how to do the else if and i was at my friends house and i
        // was talking to her about my project and she told me that i could just put
        // else if to solve the problem i was having and it worked!!!
        if (choice.equals("A")) {
            doMadlibA();
        } else if (choice.equals("B")) {
            doMadlibB();
        } else {
            // I added this bit in case sombodey wanted to put another word to try and get
            // my game not to work so I implemented it in order to tell the user that the
            // game would not work unless they typed a or b. There is no video atached to
            // this because i already learned how to do this in csa awesome.
            System.out.println("Invalid choice. Shutting down the game.");
        }
    }

    /** this prints the instructures for the game user. */
    public void printInstructions() {
        System.out.println(
                "Hi, welcome to my MadLib project! You'll receive a set of instructions. Follow them and enjoy the game!");
        System.out.println("Note: You earn more points the longer the words you enter.");
    }

    /**
     * this executes madlib a. The user inputs various words in the madlib and the
     * game generates my madlib story based on the inputs of the user. The points
     * are also alculated based on the length of the words.
     */
    public void doMadlibA() {
        // in order to get a 6 or a 7 I wanted to do something creative and I come up
        // with the idea that the longer the words you where able to come up with where
        // the more points you got. In order to do that I had to do alot of research on
        // variables and how to track variables with words. Some cites and videos that
        // at first helped me with the basics where
        // https://www.w3schools.com/java/java_variables.asp and
        // https://www.youtube.com/watch?v=pGl-bGj1Zf4
        int points = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Pick a television host name: ");
        String name = input.nextLine();
        // This was generally where the bulk of my research was I had a really hard time
        // figuring out how the point would work (The line increases the users total
        // points by the number of charectors in the words they entered for name,
        // repeating the proccess for the other inputs in my madlib and acumulating the
        // points based on the word lengths. The videos that taught me how to do this
        // where https://www.youtube.com/watch?v=mm4nCGgxLio ,
        // https://www.youtube.com/watch?v=YAPj7CnU6d0
        points += name.length();
        // just to explain what the length does it basically counts and returns the
        // charectors in that string ( wich includes everything periods spaces and
        // letters).

        System.out.println("Pick a TV channel: ");
        String channel = input.nextLine();
        points += channel.length();

        System.out.println("Pick a noun: ");
        String noun = input.nextLine();
        points += noun.length();

        System.out.println("Pick a verb: ");
        String verb = input.nextLine();
        points += verb.length();

        System.out.println("Pick a verb ending in 'ing': ");
        String verb2 = input.nextLine();
        points += verb2.length();

        System.out.println("Political group: ");
        String group = input.nextLine();
        points += group.length();

        System.out.println("Pick a plural noun: ");
        String noun2 = input.nextLine();
        points += noun2.length();

        System.out.println("Pick a foreign country: ");
        String foreign = input.nextLine();
        points += foreign.length();

        System.out.println("Pick another plural noun: ");
        String noun3 = input.nextLine();
        points += noun3.length();

        System.out.println("Pick an adjective: ");
        String adjective = input.nextLine();
        points += adjective.length();

        System.out.println("Pick another noun: ");
        String noun4 = input.nextLine();
        points += noun4.length();

        System.out.println("Pick another noun: ");
        String noun5 = input.nextLine();
        points += noun5.length();

        System.out.println("Pick another verb ending in 'ing': ");
        String verb3 = input.nextLine();
        points += verb3.length();

        System.out.println("Pick another verb: ");
        String verb4 = input.nextLine();
        points += verb4.length();

        System.out.println("Pick a corporation: ");
        String corporation = input.nextLine();
        points += corporation.length();

        System.out.println("Pick another verb: ");
        String verb5 = input.nextLine();
        points += verb5.length();

        System.out.print("Good evening. I'm " + name + " and you're watching the Nightly News on " + channel
                + ". There's been a surge in new cases of " + noun + " flu. ");
        System.out.print("Some say that we should " + verb
                + " businesses, but is it really worth it just to prevent a few people from " + verb2 + "? ");
        System.out.print("Meanwhile, members of the " + group
                + " Party are proposing a bill that they say will prevent people from losing their " + noun2 + ". ");
        System.out.print("It may seem like something that's in your best interest, but it's exactly what " + foreign
                + " wants. ");
        System.out.print(
                "First, the " + noun3 + " take to social media and try to convince you that everyone, no matter how "
                        + adjective + " is entitled to a decent " + noun4 + ". ");
        System.out.print("Then they'll infiltrate social movements as part of a covert plot to overthrow the " + noun5
                + " and take over the country. ");
        System.out.print(
                "Before you know it, they're " + verb3 + " down your door to " + verb4 + " you and your family. ");
        System.out.print("More on that after this message from our sponsor, " + corporation + ". ");
        System.out.print("They make money the old fashioned way, they " + verb5 + " it " + noun5 + ". ");
        System.out.println("\nYou earned " + points + " points.");
        // I formated my coding in the + way because i thought it was neater and when I
        // was reasearching how to do other things it showed up this way and i thought
        // it would be neater for the viewer to see and for me to code and fix my
        // mistakes later
        // the plus signs are to combign all of the parts of the coding into a complete
        // message
        start();
    }

    /**
     * This executes madlib b, the user also inputs diferent words but to a
     * different story. The pointd are also calculated here with the length of each
     * word
     */
    public void doMadlibB() {
        int points = 0;
        Scanner input = new Scanner(System.in);
        // the scanner just basically ready the input
        System.out.println("Pick a name: ");
        String name = input.nextLine();
        points += name.length();

        System.out.println("Pick a silly word: ");
        String sillyWord = input.nextLine();
        points += sillyWord.length();

        System.out.println("Pick a number: ");
        String number = input.nextLine();
        points += number.length();

        System.out.println("Pick an adjective: ");
        String adjective = input.nextLine();
        points += adjective.length();

        System.out.println("Pick a noun: ");
        String noun = input.nextLine();
        points += noun.length();

        System.out.println("Pick a relative: ");
        String relative = input.nextLine();
        points += relative.length();

        System.out.println("Pick another adjective: ");
        String adjective2 = input.nextLine();
        points += adjective2.length();

        System.out.println("Pick a verb: ");
        String verb = input.nextLine();
        points += verb.length();

        System.out.println("Pick another adjective: ");
        String adjective3 = input.nextLine();
        points += adjective3.length();

        System.out.println("Pick another adjective: ");
        String adjective4 = input.nextLine();
        points += adjective4.length();

        System.out.print("Hello, my name is astronaut " + name + ". I am on my way to planet " + sillyWord + ". ");
        System.out.print("I will be gone for " + number + " days. I am very " + adjective
                + " about the trip but I will miss my " + noun + ". ");
        System.out.print("I have heard that the atmosphere there is " + adjective + ". Luckily my " + relative
                + " packed me a jacket to keep me " + adjective2 + ". ");
        System.out.print("When I land on the planet I will " + verb + " for joy. I am " + adjective3
                + " to walk on another planet. ");
        System.out.print("I could not be more " + adjective4 + " for this trip!");
        System.out.println();
        System.out.println("You earned " + points + " points.");

        start();
    }

    /**
     * the porpuse of this method is to basically get the username of the viewer and
     * to return the username to the user.
     */
    public String getUserName() {
        System.out.println("Enter your username: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;
    }

    // * the function of this code is to start the game by calling the start method
    // */
    // I aded this code to make my madlib seem more friendly and i thought it would
    // be cute if when the user put their name in there would be a cute personilazed
    // message for the user
    public void printGreeting(String userName) {
        System.out.println("Hi, " + userName + "!");
    }

    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
