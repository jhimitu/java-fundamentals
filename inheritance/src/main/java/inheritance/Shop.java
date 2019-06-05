package inheritance;

public class Shop {
    private String name;
    private String description;
    private int dollarSigns;

    public Shop() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDollarSigns() {
        return dollarSigns;
    }

    public void setDollarSigns(int dollarSigns) {
        this.dollarSigns = dollarSigns;
    }

    public String toString() {
        return String.format("shop name: %s\n" +
                "description: %s\n" +
                "# of dollar signs: %s\n", this.name, this.description, this.dollarSigns);
    }
}
