// Save this file as Parcel.java

public class Parcel {
    private String parcelID;
    private int length, width, height, weight, value;

    public Parcel(String parcelID, int length, int width, int height, int weight, int value) {
        this.parcelID = parcelID;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.value = value;
    }

    public String getParcelID() {
        return parcelID;
    }

    public int getVolume() {
        return length * width * height;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ParcelID: " + parcelID + ", Volume: " + getVolume() + ", Weight: " + weight + ", Value: $" + value;
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel("PKG001", 10, 5, 3, 2, 100);
        System.out.println(parcel);
    }
}
