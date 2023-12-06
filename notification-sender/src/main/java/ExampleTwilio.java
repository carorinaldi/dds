import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class ExampleTwilio {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACc49f7903c1b37d8b1d9bac8c159a6556";
    public static final String AUTH_TOKEN = "5d2173fadc66313c5a05a4e6b6721f3f";
    public static final List<String> telefonos = new ArrayList<>();

    public static void main(String[] args) {
        telefonos.add("+5491121754632");
        telefonos.add("+5491124856034");
        //telefonos.add("+5491131238314");

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new PhoneNumber("whatsapp:+5491121754632"),
                new PhoneNumber("whatsapp:+14155238886"),
                "Caro probando envio de whatsaspp con lenguaje Java + libreria Twilio")
                        .create();

        for(int i=0; i<telefonos.size();i++){
            message = Message.creator(
                            new PhoneNumber("whatsapp:"+telefonos.get(i)),
                            message.getFrom(),
                            message.getBody()).create();
            System.out.println("whatsapp:"+telefonos.get(i));
        }

        System.out.println(message.getSid());
    }
}
