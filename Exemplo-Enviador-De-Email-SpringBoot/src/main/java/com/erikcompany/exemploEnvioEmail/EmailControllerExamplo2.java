package com.erikcompany.exemploEnvioEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.mail.internet.MimeMessage;


@RestController
public class EmailControllerExamplo2 {
	 

    @Autowired private JavaMailSender mailSender;
     
     

    @RequestMapping(path = "/enviarEmailExemplo2", method = RequestMethod.GET)
    public String sendMail() {
    	 
    	System.out.println("Executando o metodo sendMail() \n");
    	
        try {
        	 
            MimeMessage mail = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper( mail );
            helper.setTo("erik.alves253@gmail.com");
            helper.setSubject( "Teste Envio de e-mail" );
            helper.setText("<p>Hello from Spring Boot Application</p> </br><b>Erik Test EmailControllerExamplo2</b>", true);
          
            mailSender.send(mail);

            return "OK";
             
         } catch (Exception e) {
        	 
             e.printStackTrace();
             
             return "Erro ao enviar e-mail";
         }
         
     }
 }