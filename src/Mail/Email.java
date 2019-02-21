package Mail;

public class Email implements Message {

    private String texte;

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Email(String texte) {
        this.texte = texte;
    }

    @Override
    public void envoyer(){
        System.out.println(texte);
    }

//    @Override
//    public Email signature(String signature, Email m) {
//        String texte = m.getTextE()+"\n"+Signature;
//        m.setTexte(texte);
//        return m;
//    }
//
//    @Override
//    public Email bjr(Email m) {
//        String texte = "Bonjour madame, monsieur\n"+m.getTexte();
//        m.setTexte(texte);
//        return m;
//    }
//
//    @Override
//    public Email signBjr(String signature, Email m) {
//        m.bjr(m.signature(signature,m));
//        return m;
//    }
}
