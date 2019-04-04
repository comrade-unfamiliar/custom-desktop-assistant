import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class computerizedAssistant {
     public static void main(String[] args) {
		
    	String input = "";
		Scanner kboard = new Scanner(System.in);
		input = kboard.nextLine();
		if (input.equals("chill")) {
			try {
				  Desktop desktop = java.awt.Desktop.getDesktop();
				  URI oURL = new URI("_____drop a link here!________");
				  desktop.browse(oURL);
				} catch (Exception e) {
				  e.printStackTrace();
				}
          }
		if (input.equals("work")) {
			try {
				Runtime runtime = Runtime.getRuntime();
				Process notepad = runtime.exec("notepad");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	   /*if (input.equals("_______your task here ___________")) { //put your task here!
		   try {
			   Runtime runtime = Runtime.getRuntime();
			   Process ahk = runtime.exec("______path to the file to execute to do the task____________"); // drop the path here
		   } catch (IOException e) {
			   e.printStackTrace();
		   }
	   }*/
     }
}
