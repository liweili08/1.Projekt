public class AlarmMitStufe {

    public static void main(String[] args) {
        String s = "grün";
        int a = 24;
        comeIn(s,a);
    }

    public static boolean comeIn(String s, int a) {
        if (s.equals("grün")) {
            if (a <= 60) {
                System.out.println("Noch " + (60 - a) + " Personen können reinkommen");
                return true;
            } else {
                System.out.println("Zu viele Personen! Kommen Sie bitte nicht mehr rein.");
                return false;
            }

        } else if (s.equals("gelb")) {
            if (a <= 30) {
                System.out.println("Noch " + (30 - a) + " Personen können reinkommen");
                return true;
            } else {
                System.out.println("Zu viele Personen! Kommen Sie bitte nicht mehr rein.");
                return false;
            }
        } else if (s.equals("rot")) {
            System.out.println("Zu viele Personen! Kommen Sie bitte nicht mehr rein.");
            return false;
        } else {
            System.out.println("Falsche Eingabe");
            return false;
        }
    }
}
