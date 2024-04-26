class MenuItem {
    private String name;
    private double price;
    private String size;

    public MenuItem(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getsize() {
        return size;
    }

    public void display() {
        System.out.println(name + ": Rp" + price);
    }
}
