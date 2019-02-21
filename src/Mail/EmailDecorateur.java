package Mail;

public class EmailDecorateur implements Message {

    protected Message decoratedMessage;

    public EmailDecorateur(Message decoratedMessage) {
        this.decoratedMessage = decoratedMessage;
    }

    @Override
    public void envoyer() {

    }
}
