package task05_S_SmartPhoneTester;

public class Smartphone {
    public String[] arr1 = new String[10];
    public String[] arr2 = new String[10];
    public int count = 0;
    public String name;

    public Smartphone(String name) {
        this.name = name;
    }

    public Smartphone() {

    }

    public void updateName(String name) {
        this.name = name;
    }

    public void addFeature(String feature, String properties) {
        if (name == null) {
            System.out.println("Feature can not be added without phone name");
        } else
        {
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (arr1[i].equals(feature)) {
                    arr2[i] += ", " + properties;
                    exists = true;
                    break;
                }
            }

            if (!exists && count < 10) {
                arr1[count] = feature;
                arr2[count] = properties;
                count++;
            }
        }
    }

    public void printDetail() {
        if (name != null) {
            System.out.println("Name: " + name);
            for (int i = 0; i < count; i++) {
                System.out.println(arr1[i] + ": " + arr2[i]);
            }
        }
    }

}