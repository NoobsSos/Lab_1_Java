package Task5;

import java.util.UUID;

public class Shipment {


    private final UUID shipmentId = UUID.randomUUID();
    private final DeparturePoint fromPoint;
    private final Point toPoint;
    private final ShipmentMethods method;
    private final Item item;

    // endregion

    // region Getters and setters

    public UUID getShipmentId() {
        return this.shipmentId;
    }

    // endregion

    // region Constructors

    public Shipment(final DeparturePoint fromPoint, final Point toPoint, final ShipmentMethods method,
                    final Item item) {
        switch (method) {
            case BY_BICYCLE -> {
                final double byBicycleMaxWeight = 10d;
                final double byBicycleMaxVolume = 10d;

                if (item.weight() > byBicycleMaxWeight || item.volume() > byBicycleMaxVolume) {
                    throw new IllegalArgumentException("The item is too heavy or too big.");
                }
            }
            case BY_BUS -> {
                final double byBusMaxWeight = 30d;
                final double byBusMaxVolume = 50d;

                if (item.weight() > byBusMaxWeight || item.volume() > byBusMaxVolume) {
                    throw new IllegalArgumentException("The item is too heavy or too big.");
                }
            }
            case BY_TRAIN -> {
                final double byTrainMaxWeight = 75d;
                final double byTrainMaxVolume = 110d;

                if (item.weight() > byTrainMaxWeight || item.volume() > byTrainMaxVolume) {
                    throw new IllegalArgumentException("The item is too heavy or too big.");
                }
            }
            case BY_TRUCK -> {
                final double byTruckMaxWeight = 63d;
                final double byTruckMaxVolume = 67d;

                if (item.weight() > byTruckMaxWeight || item.volume() > byTruckMaxVolume) {
                    throw new IllegalArgumentException("The item is too heavy or too big.");
                }
            }
        }

        this.fromPoint = fromPoint;
        this.toPoint = toPoint;
        this.item = item;
        this.method = method;
    }
    @Override
    public String toString() {
        return "This shipment with " +
                "shipmentId=" + shipmentId +
                ", fromPoint=" + fromPoint +
                ", toPoint=" + toPoint +
                ", method=" + method;
    }
}