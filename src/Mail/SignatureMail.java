package Mail;

import java.security.Signature;

public class SignatureMail extends EmailDecorateur {

    private String signature;

    public SignatureMail(Message decoratedMessage, String signature) {
        super(decoratedMessage);
        this.signature = signature;
    }

    @Override
    public void envoyer(){
        decoratedMessage.envoyer();
        signature(signature);
    }

    public void signature(String signature){
        System.out.println(signature);
    }
}
