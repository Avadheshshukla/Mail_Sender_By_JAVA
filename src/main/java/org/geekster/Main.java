package org.geekster;

import com.sun.mail.util.logging.MailHandler;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Starting to Send Mail..... ");

        System.out.println("NOTE: Need to setup mail and password for sending mail.....   and it will also prpare mail body automatically !");



        MailHandlerBase mailHandler = new MailHandlerBase();
//        for(int i=0;i<25;i++){
            mailHandler.sendMail();
//        }

    }
}