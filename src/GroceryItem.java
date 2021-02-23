public class GroceryItem {
        private String name;
        private double price;
        private String category;

        public GroceryItem(String name, double price, String category) {
            setName(name);
            setPrice(price);
            setCategory(category);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public String getCategory() {
            return category;
        }

}
