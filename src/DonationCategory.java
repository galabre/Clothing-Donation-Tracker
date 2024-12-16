// class to represent a category of donation items (like shirts or pants)
public class DonationCategory {
    private String itemType; // type of item (e.g., shirt, pants, jacket)
    private int itemCount;   // counter for number of items donated in this category

    // constructor to initialize item type and count
    public DonationCategory(String itemType) {
        this.itemType = itemType;
        this.itemCount = 0;
    }

    // getter method for item count
    public int getItemCount() {
        return itemCount;
    }

    // setter method for item count
    public void setItemCount(int itemCount) {
        if (itemCount >= 0) { // ensure itemCount is not negative
            this.itemCount = itemCount;
        } else {
            throw new IllegalArgumentException("Item count cannot be negative.");
        }
    }

    // method to increase the item count
    public void donateItem() {
        itemCount++;
    }

    // method to get the item type
    public String getItemType() {
        return itemType;
    }
}


