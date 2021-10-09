
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> liPlate;

    public VehicleRegistry() {
        this.liPlate = new HashMap<>();

    }

    public boolean add(LicensePlate liPlate, String owner) {
        for (LicensePlate e : this.liPlate.keySet()) {
            if (e.equals(liPlate)) {
                return false;

            }

        }
        this.liPlate.put(liPlate, owner);

        return true;

    }

    public String get(LicensePlate licensePlate) {
       return liPlate.getOrDefault(licensePlate, null);

    }

    public boolean remove(LicensePlate licensePlate) {
        if (!liPlate.containsKey(licensePlate)) {

            return false;
        }

        liPlate.remove(licensePlate);

        return true;

    }

    public void printLicensePlates() {
        for (LicensePlate e : liPlate.keySet()) {
            System.out.println(e);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<>();

        for (String e : liPlate.values()) {

            if (!ownerList.contains(e)) {

                ownerList.add(e);
            }

        }
        for (String e : ownerList) {
            System.out.println(e);
        }

    }

}
