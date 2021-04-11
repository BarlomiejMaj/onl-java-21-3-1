package inheritance;

public class PolymorphismTester {

    public static void main(String[] args) {

        Airplane lot = new Airplane();
        lot.makeSound();
        lot.capacity();
        System.out.println("--------------");
        PublicTransport mpk = new PublicTransport() {

            @Override
            protected void ticket() {
                System.out.println("Ticket needed in public transport!");
            }

            @Override
            protected void driverLicense() {
                System.out.println("No driver license!");
            }
        };
        mpk.ticket();
        mpk.driverLicense();
        mpk.makeSound();
        mpk.ticket();
        System.out.println("--------------");

        Motorbike triumph = new Motorbike();
        triumph.capacity();
        triumph.travelTime();

        System.out.println("--------------");


        noise(triumph);
        noise(lot);
        noise(mpk);

        horn(mpk);
        }
        private static void noise(Transport cartage){
            cartage.makeSound();
        }
        private static void horn(PublicTransport cartage) {
            cartage.beep();
        }

    }



