package com.erikcompany.exemploEnvioEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmailControllerExamplo1 {

	
    @Autowired private JavaMailSender mailSender;

    
    
    @RequestMapping(path = "/enviarEmailExemplo1", method = RequestMethod.GET)
    public String sendMail() {
    	
    	
    	System.out.println("Executando o metodo sendMail() \n");
    	
    	
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("erik.alves253@gmail.com");
        message.setFrom("erik.alves253@gmail.com");
        message.setSubject("Email Test");
        message.setText("Hello from Spring Boot Application. EmailControllerExamplo1");

        try {
        	
            mailSender.send(message);
            
            return "Email enviado com sucesso!";
            
            
        } catch (Exception e) {
        	
            e.printStackTrace();
            
            return "Erro ao enviar email.";
        }
    }
    
    
}