import java.util.ArrayList;
import java.util.List;

// Define a Parcel class to hold parcel data
class Parcel {
    private String id;
    private int length;
    private int width;
    private int height;
    private int weight;
    private int distance;

    // Constructor to initialize parcel data
    public Parcel(String id, int length, int width, int height, int weight, int distance) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.distance = distance;
    }

    // Getters for parcel data
    public String getId() { return id; }
    public int getLength() { return length; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }
    public int getDistance() { return distance; }
}

class ParcelMap {
    private List<Parcel> parcels;

    public ParcelMap() {
        parcels = new ArrayList<>();
        loadParcels();
    }

    // Method to load parcel data
    private void loadParcels() {
        // Hardcoded parcel data
        String[][] parcelData = {
            {"X009", "9", "1", "9", "9", "7"},
            {"X020", "1", "1", "6", "4", "14"},
            {"X025", "7", "1", "4", "9", "9"},
            {"X036", "8", "4", "6", "9", "12"},
            {"X064", "8", "4", "1", "8", "15"},
            {"X086", "7", "4", "1", "7", "13"},
            {"X121", "3", "7", "2", "8", "10"}
        };

        // Create Parcel objects and add to the list
        for (String[] data : parcelData) {
            Parcel parcel = new Parcel(
                data[0],
                Integer.parseInt(data[1]),
                Integer.parseInt(data[2]),
                Integer.parseInt(data[3]),
                Integer.parseInt(data[4]),
                Integer.parseInt(data[5])
            );
            parcels.add(parcel);
        }
    }

    // Method to print parcel data
    public void printParcels() {
        System.out.println("Parcel Data:");
        System.out.println("ID\tLength\tWidth\tHeight\tWeight\tDistance");
        for (Parcel parcel : parcels) {
            System.out.println(parcel.getId() + "\t" +
                                 parcel.getLength() + "\t" +
                                 parcel.getWidth() + "\t" +
                                 parcel.getHeight() + "\t" +
                                 parcel.getWeight() + "\t" +
                                 parcel.getDistance());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ParcelMap parcelMap = new ParcelMap();
        parcelMap.printParcels();
    }
}
