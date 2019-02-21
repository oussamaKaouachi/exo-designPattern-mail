package Mail;

public class BjrMail extends EmailDecorateur{

    public BjrMail(Message decoratedMessage) {
        super(decoratedMessage);

    }

    @Override
    public void envoyer(){
        bjr();
        decoratedMessage.envoyer();
    }

    public void bjr(){
        System.out.println("Bonjour madame, monsieur");
    }
}
