package _06excepciones;

public class Prueba {
    public static void main(String[] args) {
        Sms[] sms = new Sms[8];
        sms[0] = new Sms("Hola", "123456789");
        sms[1] = new Sms("Adios", "987654321");
        sms[2] = new Sms("Buenos dias", "123456789");
        sms[3] = new Sms("Buenas noches", "987654321");
        sms[4] = new Sms("Hasta luego", "123456789");
        sms[5] = new Sms("Hasta mañana", "987654321");
        sms[6] = new Sms("Hasta pronto", "123456789");
        sms[7] = new Sms("Hasta siempre", "987654321");
        for (int i = 0; i < sms.length; i++) {
            try {
                EnvioSMSService.enviarSMS(sms[i]);
            } catch (SMSTimeoutException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
}
