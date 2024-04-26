class Food extends MenuItem {
    private String spiceLevel;

    public Food(String name, double price, String spiceLevel) {
        super(name, price, spiceLevel);
        this.spiceLevel = spiceLevel;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Spice Level: " + spiceLevel);
    }
}