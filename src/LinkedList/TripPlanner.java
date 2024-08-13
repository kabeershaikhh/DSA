package LinkedList;

public class TripPlanner {
    static class TransportationStep {
        String transportType;
        String details;
        TransportationStep next;

        public TransportationStep(String transportType, String details) {
            this.transportType=transportType;
            this.details=details;
            this.next=null;
        }}
    static void displayTrip(TransportationStep head) {
        TransportationStep current=head;
        while (current!=null) {
            System.out.println(current.transportType + ": " + current.details);
            current=current.next;
        }}
    public static void main(String[] args) {
        // Create transportation steps
        TransportationStep busStep=new TransportationStep("Bus",
                "Board to the Point Of MUET before 7:15 from Ali Palace");
        TransportationStep pedestrianStep=new TransportationStep("Pedestrian Bridge",
                "After reaching outside MUET take the pedestrian bridge to cross the highway");
        TransportationStep rickshawStep=new TransportationStep("Rickshaw",
      "After crossing highway and reaching to MUET gate take Rickshaw for reaching to Department quickly");

        busStep.next=pedestrianStep;
        pedestrianStep.next=rickshawStep;
        displayTrip(busStep);
    }

}
