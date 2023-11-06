import java.util.LinkedList;
import java.util.Queue;

public class AutoInventory {
    private Queue<Automobile> inventoryQueue = new LinkedList<Automobile>();
    
    // Constructor methods for the auto inventory class
    public AutoInventory() {
        // Empty constructor
    }
    public AutoInventory(Automobile auto) {
        this.inventoryQueue.add(auto);
    }
    public AutoInventory(Automobile[] autoArray) {
        for(int i = 0; i < autoArray.length; i++) {
            this.inventoryQueue.add(autoArray[i]);
        }
    }
    public AutoInventory(Queue<Automobile> autoQueue) {
        this.inventoryQueue = autoQueue;
    }

    // Inventory operation methods
    public void AddAuto(Automobile auto) {
        this.inventoryQueue.add(auto);
    }
    public void AddAuto(Automobile[] autoArray) {
        for(int i = 0; i < autoArray.length; i++) {
            this.inventoryQueue.add(autoArray[i]);
        }
    }
    public void AddAuto(int year, String make, String model, String color, String vin, float mileage) {
        this.inventoryQueue.add(new Automobile(year, make, model, color, vin, mileage));
    }
    public void RemoveAuto() {
        this.inventoryQueue.remove();
    }
    public void RemoveAuto(Automobile auto) {
        this.inventoryQueue.remove(auto);
    }
    public void RemoveAuto(int index) {
        ((LinkedList<Automobile>) this.inventoryQueue).remove(index);
    }

    // Accessor methods for the auto inventory class
    public String toString() {
        String output = "";
        for(int i = 0; i < this.inventoryQueue.size(); i++) {
            output += ((LinkedList<Automobile>) this.inventoryQueue).get(i).toString() + "\n";
        }
        return output;
    }
    public Automobile GetAuto(int index) {
        return ((LinkedList<Automobile>) this.inventoryQueue).get(index);
    }
    public Automobile[] GetInventory() {
        return this.inventoryQueue.toArray(new Automobile[this.inventoryQueue.size()]);
    }
}
