
public class MainFlight {

    public static void main(String[] args) {

        PersonFlight[] people = new PersonFlight[] {
                new PersonFlight("Cleopatra", "Egypt", "69 BC", 1),
                new PersonFlight("Alexander the Great", "Macedon", "356 BC", 2),
                new PersonFlight("Julius Caesar", "Rome", "100 BC", 3),
                new PersonFlight("Hannibal", "Carthage", "247 BC", 4),
                new PersonFlight("Confucius", "China", "551 BC", 5),
                new PersonFlight("Pericles", "Greece", "429 BC", 6),
                new PersonFlight("Spartacus", "Thrace", "111 BC", 7),
                new PersonFlight("Marcus Aurelius", "Rome", "121 AD", 8),
                new PersonFlight("Leonidas", "Greece", "540 BC", 9),
                new PersonFlight("Sun Tzu", "China", "544 BC", 10),
                new PersonFlight("Hammurabi", "Babylon", "1750 BC", 11),
        };

        AirlineFlight airlineFlight = new AirlineFlight();

        for (int i = 0; i < people.length; i++) {
            airlineFlight.setPerson(people[i]);
        }


        System.out.println("********************** RESERVATIONS COMPLETE! **********************\n");
        System.out.println(airlineFlight);
    }

}