import java.io.File;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;

public class LogBot {

    private static final String logBookName = "logBook";
    private static final String greeting = "Welcome LogBot is online!\n Ready to log your message!";
    private static final String TIMEFORMAT = "yyyy-MM-dd-HH-mm-ss";


    public static void process
    public static void logMessage(String message){

        // Get current time as string
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TIMEFORMAT);
        String filename = currentTime.format(formatter);

//        String dateString = currentTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
//        dateString = dateString.replace(":", "_");
//        String filename = truncateString(dateString, ".") + ".txt";
//        System.out.println(filename);

        // Creates new file and write to the file
        try{
            FileWriter writer = new FileWriter(filename);
            writer.write(message);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static String truncateString(String inString, String delimiter){
        int delimiterIndex = inString.lastIndexOf(delimiter);
        return inString.substring(0,delimiterIndex);
    }
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
