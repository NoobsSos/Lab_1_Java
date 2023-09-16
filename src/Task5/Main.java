package Task5;

public class Main {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        final ReceivePoint point1 = new ReceivePoint("Ternopil", "Yuriivska", "32");
        final ReceivePoint point2 = new ReceivePoint("Stryi", "Andriivska", "137");
        final ReceivePoint point3 = new ReceivePoint("Ternopil", "Yuriivska", "32");

        service.displayDeparturePoints();
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        service.CreateShipment(2, point2, ShipmentMethods.BY_BICYCLE, new Item(4d, 7d));
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        service.CreateShipment(1, point1, ShipmentMethods.BY_BUS, new Item(4d, 7d));
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        service.cancelShipment(service.getShipments()[0].getShipmentId());
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        service.displayShipments();
        System.out.println();
        System.out.println("------------------");
        System.out.println();
        
        service.CreateShipment(3, point3, ShipmentMethods.BY_TRUCK, new Item(4d, 7d));
    }
}
