/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SendEmail;

import Business.Person.Person;
import Business.Person.VitalSigns;
import java.util.Properties;
import java.util.Random;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author palakagrawal
 */
public class SendMail {

    public static void sendMailOnAccountCreation(String userName, String pwd, String emailID) {
        final String username = "tejesh.rathi071191@gmail.com";
        final String password = "Mumb@i0711";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tejesh.rathi071191@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailID));
            message.setSubject("Account Created: Welcome to BeingHuman!!");
            message.setContent("Hi, \nGreeting for the day. \n\nPlease find you credentials below,\nUsername:  " + userName + "\nPassword:  " + pwd + "\n\n Thanks,\nBeing Human System", "text/html; charset=utf-8");
            Transport.send(message);

            System.out.println("Email sent");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendMailWithAttachment(String emailID) {
        final String username = "tejesh.rathi071191@gmail.com";
        final String password = "Mumb@i0711";
        Person person = new Person();

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tejesh.rathi071191@gmail.com"));
            System.out.println(emailID);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailID));
            message.setSubject("Food Collected");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hi, \nGreetings for the day.\nThank you for the help..!!\nWe collected the food..!! We appreciate your help.  \n Thanks,\nBeing Human System");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();
            String filename = "///Users/palakagrawal/Desktop/dunkin1";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

//            message.setContent("Hi, \nGreetings for the day.\nThank you for the help..!!\nWe collected the food..!! We appreciate your help. Any good cause don't go waste, you will receive your rewards shortly. \n Thanks,\nBeing Human System", "text/html; charset=utf-8");
            Transport.send(message);

            System.out.println("Email sent");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendInvoice(String emailID) {
        final String username = "tejesh.rathi071191@gmail.com";
        final String password = "Mumb@i0711";
        Person person = new Person();

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tejesh.rathi071191@gmail.com"));
            System.out.println(emailID);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailID));
            message.setSubject("Food Collected");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hi, \nGreetings for the day.\nThank you for the help..!!\nWe collected the food..!! We appreciate your help.  \n Thanks,\nBeing Human System");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();
            String filename = "///Users/palakagrawal/Desktop/dunkin1";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

//            message.setContent("Hi, \nGreetings for the day.\nThank you for the help..!!\nWe collected the food..!! We appreciate your help. Any good cause don't go waste, you will receive your rewards shortly. \n Thanks,\nBeing Human System", "text/html; charset=utf-8");
            Transport.send(message);

            System.out.println("Email sent");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendMailOnCollection(String emailID) {

        final String username = "tejesh.rathi071191@gmail.com";
        final String password = "Mumb@i0711";
        Person person = new Person();

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tejesh.rathi071191@gmail.com"));
            System.out.println(emailID);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailID));
            message.setSubject("BEINGHUMAN - Foor Collection Acknowledgement..!!");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hi, \nGreetings for the day.\nThank you for the help..!!"
                    + "\nWe collected the food..!! We appreciate your help. "
                    + " \n Thanks,\nBeing Human System"
                    + "\n The small act of kindnessis worth more than the Grandest Intention..!!"
                    + "+ \"\\n We can't help everyone, but EVERYONE casn help someone..!!\"");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

//            message.setContent("Hi, \nGreetings for the day.\nThank you for the help..!!\nWe collected the food..!! We appreciate your help. Any good cause don't go waste, you will receive your rewards shortly. \n Thanks,\nBeing Human System", "text/html; charset=utf-8");
            Transport.send(message);

            System.out.println("Email sent");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

    public static void sendMailScheduledAppointment(String emailID) {
        final String username = "tejesh.rathi071191@gmail.com";
        final String password = "Mumb@i0711";
        Person person = new Person();

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tejesh.rathi071191@gmail.com"));
            System.out.println(emailID);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailID));
            message.setSubject("Apointment Scheduled - Blood Donation");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hi, \nGreetings for the day.\nYour appointment has been scheduled..!!\nYou can visit tomorrow for blood donation..!! We appreciate your help.  \n Thanks,\nBeing Human System");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

//            message.setContent("Hi, \nGreetings for the day.\nThank you for the help..!!\nWe collected the food..!! We appreciate your help. Any good cause don't go waste, you will receive your rewards shortly. \n Thanks,\nBeing Human System", "text/html; charset=utf-8");
            Transport.send(message);

            System.out.println("Email sent");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendMailCancelledAppointment(String emailID) {
        final String username = "tejesh.rathi071191@gmail.com";
        final String password = "Mumb@i0711";
        Person person = new Person();

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tejesh.rathi071191@gmail.com"));
            System.out.println(emailID);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailID));
            message.setSubject("Request Cancelled - Blood Donation");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hi, \nGreetings for the day.\nYour request has been cancelled, as you are not eligible for it.\nPlease check with your physician, as we have detected critical vital signs in your blood!\nWe appreciate your help.  \n Thanks,\nBeing Human System");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

//            message.setContent("Hi, \nGreetings for the day.\nThank you for the help..!!\nWe collected the food..!! We appreciate your help. Any good cause don't go waste, you will receive your rewards shortly. \n Thanks,\nBeing Human System", "text/html; charset=utf-8");
            Transport.send(message);

            System.out.println("Email sent");
            
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
     public static void fcSendMail(String emailID, double quantity) {

        final String username = "tejesh.rathi071191@gmail.com";
        final String password = "Mumb@i0711";
        Person person = new Person();
        String filename;
        Random r = new Random();

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tejesh.rathi071191@gmail.com"));
            System.out.println(emailID);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailID));
            message.setSubject("BEINGHUMAN - Food Collection Acknowledgement..!!");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hi, \nGreetings of the day.\nThank you for the help..!!"
                    + "\nWe collected the food..!! We appreciate your help. "
                    + "\n The small act of kindnessis worth more than the Grandest Intention..!!"
                    +"\n So when the act is so good, the reward has to be sweeter."
                    + "\n PFA a small reward as a token of thanks from our side for BeingHuman."
                    + "\n Thanks,\\nBeingHuman System"
                    + "\n We can't help everyone, but EVERYONE can help someone..!!\"");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            
            
            messageBodyPart = new MimeBodyPart();
            if(quantity > 4 && quantity < 10){
                
                filename = "///Users/palakagrawal/Desktop/dunkin1.png";
            }
            else if(quantity > 10  && quantity < 25){
                filename = "///Users/palakagrawal/Desktop/dunkin1.png";;
            }
            else if(quantity > 25 && quantity < 50){
                filename = "///Users/palakagrawal/Desktop/Amazon-coupons.png";
            }else{
                filename = "///Users/palakagrawal/Desktop/Amazon-coupons.png";
            }                
                
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
            
            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Email sent");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void pcSendMail(String emailID, String location) {

        final String username = "tejesh.rathi071191@gmail.com";
        final String password = "Mumb@i0711";
        Person person = new Person();
        String filename;
        Random r = new Random();

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tejesh.rathi071191@gmail.com"));
            System.out.println(emailID);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailID));
            message.setSubject("BEINGHUMAN - Plastic Collection Acknowledgement..!!");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Hi, \nGreetings of the day.\nThank you for the help..!!"
                    + "\nWe collected the plastic..!! We appreciate your determination in avoiding plastic waste. "
                    + "\n Together we can make a difference..!!"
                    +"\n Thank you for being a part of Solution and not pollution."
                    + "\n PFA a small reward as a token of thanks from BeingHuman."
                    + "\n Thanks,\\nBeingHuman System"
                    + "\n Let's Reduce, Reuse, Recycle and Recover from all kind of wastes.");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            
            
            messageBodyPart = new MimeBodyPart();
            if(location == "House"){
                filename = "///Users/palakagrawal/Desktop/Amazon-coupons.png";
            }else{
                filename = "///Users/palakagrawal/Desktop/Amazon-coupons.png";
            }                
                
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
            
            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Email sent");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }


}
