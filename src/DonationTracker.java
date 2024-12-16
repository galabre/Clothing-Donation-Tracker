// donation tracker class to manage multiple donation categories
public class DonationTracker {
    private DonationCategory shirts;  // category for shirts
    private DonationCategory pants;   // category for pants
    private DonationCategory jackets;// category for jackets
    private DonationCategory skirts;//category for skirts
    private DonationCategory shoes;//category for shoes

    // constructor to initialize all categories
    public DonationTracker() {
        shirts = new DonationCategory("Shirt");
        pants = new DonationCategory("Pants");
        jackets = new DonationCategory("Jacket");
        skirts = new DonationCategory("Skirts");
        shoes = new DonationCategory("Shoes");
    }

    // method to donate an item based on its type
    public void addDonation(String item) {
        if (item.equalsIgnoreCase("shirt")) {
            shirts.donateItem();
            System.out.println("Shirt donated successfully!");
        } else if (item.equalsIgnoreCase("pants")) {
            pants.donateItem();
            System.out.println("Pants donated successfully!");
        } else if (item.equalsIgnoreCase("jacket")) {
            jackets.donateItem();
            System.out.println("Jacket donated successfully!");
        } else if (item.equalsIgnoreCase("skirt")) {
            skirts.donateItem();
            System.out.println("Skirt donated successfully!");

        }else if (item.equalsIgnoreCase("Shoes")){
            shoes.donateItem();
                System.out.println("Shoes donated successfully!");
        } else {
            throw new IllegalArgumentException(item + " is not a valid donation item.");
        }
    }


    // method to get total donations across all categories
    public int getTotalDonations() {
        return shirts.getItemCount() + pants.getItemCount() + jackets.getItemCount()+shoes.getItemCount();
    }

    // method to display donation summary
    public void displayDonations() {
        System.out.println("Donation Summary:");
        System.out.println("Shirts: " + shirts.getItemCount());
        System.out.println("Pants: " + pants.getItemCount());
        System.out.println("Jackets: " + jackets.getItemCount());
        System.out.println("Skirts: " + skirts.getItemCount());
        System.out.println("Shoes: " + shoes.getItemCount());
        System.out.println("Total Donations: " + getTotalDonations());
        System.out.println(" UMW Thanks you for your donation(s)!");
    }
}

