import java.io.IOException;

public class BaseClass {

    public static void main(String[] args){
        Input input = new Input();

        // TODO: Initialize Machine Learning component.

        pauseForInput(input);
    }

    // Once the user presses enter, the application stops running.
    private static void pauseForInput(Input input){
        try {
            System.out.print("Press 'Enter' to exit application.");
            System.in.read();
            input.closeDevices();
            for (int i = 0; i < input.playedNotes.size(); i++){
                System.out.println(input.playedNotes.get(i));
            }
            System.out.println("Size of playedNotes: " + input.playedNotes.size());
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
