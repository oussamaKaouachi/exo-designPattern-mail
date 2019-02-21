package Mail;

public class TestMain {
    public static void main (String[] args){

        //mail avec signature
        Message mail = new Email("Ceci est un mail");
        Message signMail = new SignatureMail(mail, "signature,");
        signMail.envoyer();
        System.out.println("\n");

        //mail avec bonjour
        Message bjrMail = new BjrMail(mail);
        bjrMail.envoyer();
        System.out.println("\n");

        //mail avec bonjour et signature
        Message bjrSignMail = new BjrMail(signMail);
        bjrSignMail.envoyer();
    }
}
