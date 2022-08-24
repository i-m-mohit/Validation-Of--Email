package searchEmail;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchEmail {

    public static void main(String[] args) {
        int line = 0;
        int flag = 0;
        ArrayList<String> emailID = new ArrayList<String>();
        emailID.add("kr.mohit@gmail.com");
        emailID.add("singh.rj@gmail.com");
        emailID.add("shrama.rohit12@gmail.com");
        emailID.add("raman.negi007@gmail.com");
        emailID.add("reshma.k22@gmail.com");
        emailID.add("ananya143@gmail.com");

        System.out.println("Enter Email ID to search");
        Scanner string = new Scanner(System.in);
        String searcElement = string.nextLine();


        System.out.println("The list of Email is as follows:");
        for (int i = 0; i < emailID.size(); i++) {
            System.out.println(emailID.get(i));

            if (searcElement.equals(emailID.get(i))) {
                flag = 1;
                line = i;
                break;
            }
        }

            if (flag == 1) {
                System.out.println("\nEmail ID " + searcElement + " found at line " + (line + 1));
            } else {
                System.out.println("\nEmail ID is not found");

            }

        }
    }
