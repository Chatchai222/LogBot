import java.io.File;
import java.util.Scanner;
import java.time.*;

public class LogBot {

    private static final String logBookName = "logBook";
    private static final String greeting = "Welcome LogBot is online!\n Ready to log your message!";

//    public static void logMessage(String message){
//
//        // Get current time as string
//        LocalDateTime currentTime = LocalDateTime.now();
//        String fileName = currentTime.toString();
//
//        try{
//            File file = new File("fileName")
//        }
//
//
//    }
    public static String getMessageTerminal(){

        System.out.println("Please enter your message (to stop logging \"END\"):\n");

        String inputMessage = "";
        StringBuilder output = new StringBuilder();

        while (!inputMessage.contentEquals("END")){

            Scanner input = new Scanner(System.in);
            inputMessage = input.nextLine();

            if (inputMessage.contentEquals("END")){
                break;
            }

            output.append(inputMessage).append("\n");
        }

        return output.toString();
    }


}
