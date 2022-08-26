public class Sms extends Email {

    private String numero;

    public Sms(){}

    public Sms(String titulo, String mensagem, Formato tipo, String numero) {
        super(titulo, mensagem, tipo);
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
