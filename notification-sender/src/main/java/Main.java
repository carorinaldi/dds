import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Main {
    public static void main(String[] args) throws EmailException {

        Gato merli = new Gato("merli","blanco");
        merli.getOcupaciones().add("ronronear");

 /*       System.out.println(merli.getName()+" "+merli.getColor()+" "+merli.getOcupaciones());*/

        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("carorinaldi10@gmail.com", "rpclpatskhtmqppv"));
        email.setSSLOnConnect(true);
        email.setFrom("carorinaldi10@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail con info de objeto"+merli.getName()+" "+merli.getColor()+" "+merli.getOcupaciones() +"... :-)");
        email.addTo("rinaldicarolina@hotmail.com");
        email.send();

    }
}
