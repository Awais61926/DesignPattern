/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package templatepattern;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class TemplatepatternMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Network[] networks = { new Facebook("", ""), new Twitter("", ""), new LinkedIn("", "") };
            System.out.print("Input user name: ");
            String userName = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();

            while (true) {
                System.out.print("Input message description: ");
                String description = reader.readLine();
                System.out.print("Input message type (ERROR, WARNING, INFO): ");
                String type = reader.readLine().toUpperCase();
                System.out.print("Input network type (FACEBOOK, TWITTER, LINKEDIN, or none): ");
                String networkType = reader.readLine().toUpperCase();

                Message message = new Message(description, MessageType.valueOf(type), NetworkType.valueOf(networkType));

                for (Network network : networks) {
                    if (message.getNetworkType() == null || message.getNetworkType() == NetworkType.valueOf(networkType)) {
                        network.post(message);
                    }
                }

                System.out.print("Do you want to continue posting messages? (yes/no): ");
                String choice = reader.readLine();
                if (choice.equals("no")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please provide valid inputs.");
        }
    
    }
    
}
