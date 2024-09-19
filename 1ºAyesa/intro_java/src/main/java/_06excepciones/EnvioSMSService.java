package _06excepciones;

public class EnvioSMSService {
    public static void enviarSMS(Sms sms) {
        int numProbabilidad = (int) (Math.random() * 9) + 1;
        if (numProbabilidad <= 2) {
            System.out.println("Se ha agotado el tiempo de espera");
        } else {
            System.out.println("El SMS se ha enviado a traves de la plataforma de SMS");
        }

    }
}
