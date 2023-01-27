class AirlineFlight {
    PersonFlight[] seats;

    public AirlineFlight() {
        this.seats = new PersonFlight[11];
    }


    public PersonFlight getPerson(int index) {
        return new PersonFlight(this.seats[index]);
    }

    public void setPerson(PersonFlight person) {
        this.seats[person.getSeatNumber() - 1] = new PersonFlight(person);
    }

    public void createReservation(PersonFlight personFlight) {
        while (seats[personFlight.getSeatNumber() - 1] != null) {
            System.out.println("\n" + personFlight.getName() + ", seat: " + personFlight.getSeatNumber() + " is already taken. Please choose another seat.\n");
            personFlight.chooseSeat();
        }
        int index = personFlight.getSeatNumber() - 1;
        seats[index] = new PersonFlight(personFlight);
        System.out.println("Thank you " + personFlight.getName() + " for flying with Java airlines. Your seat number is " + personFlight.getSeatNumber() + ".\n");
    }


    public String toString() {
        String temp = "";
        for (int i = 0; i < this.seats.length; i++) {
            if (seats[i] != null) {
                temp += seats[i].toString();
                temp += "\n\n";
            }
            else {
                temp += "Seat " + (i+1) + " is empty.";
                temp += "\n\n";
            }
        }
        return temp;
    }

}
