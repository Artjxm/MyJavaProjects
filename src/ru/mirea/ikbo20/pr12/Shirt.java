package ru.mirea.ikbo20.pr12;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public Shirt() {
    }

    private Shirt getShirtFromString(String str) {
        String[] shirtStr = str.split(",");
        return new Shirt(shirtStr[0], shirtStr[1], shirtStr[2], shirtStr[3]);
    }

    private Shirt[] getShirtsFromStrings(String[] arr) {
        Shirt[] shirts = new Shirt[arr.length];
        for (int i = 0; i < arr.length; i++) {
            shirts[i] = getShirtFromString(arr[i]);
        }
        return shirts;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] stringShirtArr = new String[11];
        stringShirtArr[0] = "S001,Black Polo Shirt,Black,XL";
        stringShirtArr[1] = "S002,Black Polo Shirt,Black,L";
        stringShirtArr[2] = "S003,Blue Polo Shirt,Blue,XL";
        stringShirtArr[3] = "S004,Blue Polo Shirt,Blue,M";
        stringShirtArr[4] = "S005,Tan Polo Shirt,Tan,XL";
        stringShirtArr[5] = "S006,Black T-Shirt,Black,XL";
        stringShirtArr[6] = "S007,Orange T-Shirt,Orange,S";
        stringShirtArr[7] = "S008,White T-Shirt,White,L";
        stringShirtArr[8] = "S009,Green T-Shirt,Green,S";
        stringShirtArr[9] = "S010,White T-Shirt,White,XL";
        stringShirtArr[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt shirt = new Shirt();
        Shirt[] shirts = shirt.getShirtsFromStrings(stringShirtArr);

        for (Shirt shirtOutput : shirts) {
            System.out.println(shirtOutput);
        }
    }
}
