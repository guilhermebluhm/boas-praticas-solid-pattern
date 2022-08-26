public class Program {

    public static void main(String[] args) {
        Email instance = AcaoFabrica.getInstance(Formato.EMAIL);
        if(instance != null) {
            instance.setMensagem("mensagem modelo fabrica");
            instance.setTitulo("titulo modelo fabrica");
            AcaoEmail acao = new MensageriaImpl();
            acao.gerarEmail(instance);
            return;
        }
        System.out.println("instancia era nula");
    }

}
