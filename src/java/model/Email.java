package model;

import beans.User;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Avishka Perera
 */
public class Email {

    final String senderEmailID = "thelibrary.nsbm@gmail.com";
    final String senderPassword = "nsbmlibrary321";
    final String emailSMTPserver = "smtp.gmail.com";
    final String emailServerPort = "465";

    public void sendVerification(User user) {

        String to = user.getEmail();
        String subject = "Welcome to ComputerWorks™";
        String msg;

        //-------------------Message--------------------
        msg = "Hi " + user.getFname() + " " + user.getLname() + ",\nWelcome to ComputerWorks. Your registration is successful.\n";
        msg += "Please click on the below link to activate your account";
        msg += "\n\nhttp://localhost:8080/ComputerWorks/VerifyAccount?verify=true&user=" + user.getUsername() + "\n\n";
        msg += "After clicking on the above link you may login using your Username and Password.\n";
        msg += "Thank you,\nComputerWorks™";
        //-------------------Message--------------------

        Properties props = new Properties();
        props.put("mail.smtp.user", senderEmailID);
        props.put("mail.smtp.host", emailSMTPserver);
        props.put("mail.smtp.port", emailServerPort);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", emailServerPort);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        SecurityManager security = System.getSecurityManager();

        try {
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getDefaultInstance(props, auth);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmailID));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(msg);
            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendResetEmail(String email, String username) {
        String to = email;
        String subject = "Reset Password";
        String msg;

        msg = "Please click on the below link to reset your password\n\n";
        msg += "http://localhost:8080/ComputerWorks/new-password.jsp?email=" + email + "&username=" + username;
        msg += "\n\nPlease ignore this email if this was not requested by you";
        msg += "\nThank you,\nComputerWorks™";

        Properties props = new Properties();
        props.put("mail.smtp.user", senderEmailID);
        props.put("mail.smtp.host", emailSMTPserver);
        props.put("mail.smtp.port", emailServerPort);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", emailServerPort);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        SecurityManager security = System.getSecurityManager();

        try {
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getDefaultInstance(props, auth);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmailID));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(msg);
            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class SMTPAuthenticator extends javax.mail.Authenticator {

        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(senderEmailID, senderPassword);
        }
    }
}
