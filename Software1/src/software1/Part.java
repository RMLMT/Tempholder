
package software1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;

/**
 *
 * @author Ryan
 */
public class Part {
    private final StringProperty partName;
    private final IntegerProperty partID;
    
    public Part(String partName, int partID){
         this.partName = new SimpleStringProperty(partName);
         this.partID = new SimpleIntegerProperty(partID);
    }
    public String getPartName(){
        return partName.get();
    }
    public void setPartName(String partName){
        this.partName.set(partName);
    }
    public StringProperty partNameProperty(){
        return partName;
    }
    public int getPartID(){
        return partID.get();
    }
    public void setPartID(int partID){
        this.partID.set(partID);
    }
    public IntegerProperty partIDProperty(){
        return partID;
    }
}
