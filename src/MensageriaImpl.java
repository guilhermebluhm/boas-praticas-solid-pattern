public class MensageriaImpl implements AcaoEmail, AcaoSms{

    @Override
    public void gerarEmail(Email email) {
        System.out.println("Titulo: " + email.getTitulo() + "Mensagem: " + email.getMensagem());
    }

    @Override
    public void gerarSms(Sms sms) {
        System.out.println("Mensagem: " + sms.getMensagem() + "Numero: " + sms.getNumero());
    }
}
