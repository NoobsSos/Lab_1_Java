package Task5;

public class Item {
        private double weight;
        private double volume;
        public Item(final double weight, final double volume) {
            this.weight = weight;
            this.volume = volume;
        }
        public double weight() {
            return this.weight;
        }
        public double volume() {
            return this.volume;
        }
}
