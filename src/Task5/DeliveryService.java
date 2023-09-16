package Task5;

import java.util.Arrays;
import java.util.UUID;

public class DeliveryService {
    public Shipment[] getShipments() {
        return shipments;
    }

    private Shipment[] shipments = new Shipment[]{ };
    private static final DeparturePoint[] DEPARTURE_POINTS = {
            new DeparturePoint(1,"Lviv", "Horodotska", "90"),
            new DeparturePoint(2,"Lutsk", "Franka", "25"),
            new DeparturePoint(3,"Ternopil", "Yuriivska", "32")
    };

    void CreateShipment(final int departurePointNumber, final ReceivePoint receivePoint,
                        final ShipmentMethods method, final Item item) {
        final DeparturePoint departurePoint = DEPARTURE_POINTS[departurePointNumber - 1];
        if (departurePoint.hasTheSameAddress(receivePoint)) {
            System.out.println("Departure point and receive point are the same. Try to change something");
            return;
        }

        for (final DeparturePoint point : DEPARTURE_POINTS) {
            if (receivePoint.hasTheSameAddress(point)) {
                final Shipment shipment = new Shipment(departurePoint, point, method, item);
                this.addShipment(shipment);
                return;
            }
        }

        final Shipment shipment = new Shipment(departurePoint, receivePoint, ShipmentMethods.BY_BICYCLE, item);
        this.addShipment(shipment);
    }

    public void addShipment(final Shipment shipment) {
        final Shipment[] newShipments = new Shipment[this.shipments.length + 1];
        System.arraycopy(this.shipments, 0, newShipments, 0, this.shipments.length);
        newShipments[this.shipments.length] = shipment;
        this.shipments = newShipments;

        System.out.println("Shipment created.");
        for (final Shipment alreadyAddedShipment : this.shipments) {
            System.out.println(alreadyAddedShipment);
        }
    }

    public void cancelShipment(final UUID shipmentId) {
        for (int i = 0; i < this.shipments.length; i++) {
            if (this.shipments[i].getShipmentId().equals(shipmentId)) {
                final Shipment[] newShipments = new Shipment[this.shipments.length - 1];
                System.arraycopy(this.shipments, 0, newShipments, 0, i);
                System.arraycopy(this.shipments, i + 1, newShipments, i, this.shipments.length - i - 1);
                this.shipments = newShipments;

                System.out.println("Shipment canceled.");
                for (final Shipment alreadyAddedShipment : this.shipments) {
                    System.out.println(alreadyAddedShipment);
                }
                return;
            }
        }

        System.out.println("Shipment not found.");
    }

    public void displayShipments() {
        for (final Shipment alreadyAddedShipment : this.shipments) {
            System.out.println("There is already added shipment: ");
            System.out.println(alreadyAddedShipment);
        }
    }

    public void displayDeparturePoints() {
        System.out.println("Exists departure points: ");
        for (final DeparturePoint point : DEPARTURE_POINTS) {
            System.out.println(point);
        }
    }
}
