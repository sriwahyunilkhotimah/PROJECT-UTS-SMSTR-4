class Drink extends MenuItem {
    private String size;
    private Object temperature;

    public Drink(String name, double price, String size, String temperature) {
        super(name, price, size);
        this.size = size;
        this.temperature = temperature;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Size: " + size);
        System.out.println("Temperature: " + temperature);
    }
}
