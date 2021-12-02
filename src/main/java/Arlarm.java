public class Arlarm {

        public static void main(String[] args){
            int a =56;
        }

        public static boolean anzahl(int a){
            if (a>30){
                System.out.println("Zu viele Personen!");
                return false;
            } else {
                System.out.println("Maximale Personenanzahl nicht überschritten.");
                return true;
            }
        }
    }
