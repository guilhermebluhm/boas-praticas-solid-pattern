public class AcaoFabrica {

    public static Email getInstance(Formato formato){


        if(formato.equals(Formato.EMAIL)){
            return new Email("","",Formato.EMAIL);
        }

        else if(formato.equals(Formato.SMS)){
            new Sms("","",Formato.SMS,"");
        }

        return null;

    }

}
