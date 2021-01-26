package com.qe.qa.util;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class TestUtil {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;

	public static void sendEmail(String m, String s) {
		// Mention the Recipient's email address
		// String to = "mozcan@gmail.com";
		//String to = "mozcan@amaxinsurance.com";
		// Mention the Sender's email address
		String from = "mdinc@amaxinsurance.com";
		// String from = "mdinc@amaxinsurance.com";
		// Mention the SMTP server address. Below Gmail's SMTP server is being used to
		// send email
		String host = "smtp.gmail.com";
		// Get system properties
		Properties properties = System.getProperties();
		// Setup mail server
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		// Get the Session object.// and pass username and password
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// return new PasswordAuthentication("dincmurad@gmail.com", "J@cob2017");
				return new PasswordAuthentication("mdinc@amaxinsurance.com", "Jacob2017");
			}
		});

		// Used to debug SMTP issues
		session.setDebug(true);
		try {
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);
			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));
			// Set To: header field of the header.
			// message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

//			message.addRecipient(Message.RecipientType.TO, new InternetAddress("dmcdonald@amaxinsurance.com"));
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress("afarooqui@amaxinsurance.com"));
//	        message.addRecipient(Message.RecipientType.TO, new InternetAddress("mozcan@amaxinsurance.com"));
////	        message.addRecipient(Message.RecipientType.TO, new InternetAddress("dincim@hotmail.com"));
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress("mdinc@amaxinsurance.com"));

			// Set Subject: header field
			//message.setSubject("Daily Automated Test Results!");
			message.setSubject(s);
			// Now set the actual message
			message.setText(m);
			System.out.println("sending...");
			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}

	}
}
