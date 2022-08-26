public class Email {

    private String titulo;
    private String mensagem;
    private Formato tipo;

    public Email(){}

    public Email(String titulo, String mensagem, Formato tipo) {
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
