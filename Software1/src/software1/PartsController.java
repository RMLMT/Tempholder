
package software1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Ryan
 */
public class PartsController implements Initializable {

    @FXML
    private TextField filterField;
    @FXML
    private TableView<Part> partTable;
    @FXML
    private TableColumn<Part, String> PartNameColumn;
    @FXML
    private TableColumn<Part, Integer> PartIDColumn;

    private ObservableList<Part> masterData = FXCollections.observableArrayList();

   
    public PartTableController() {
        masterData.add(new Part("Widget", 1));
        masterData.add(new Part("Woozle", 2));
    }
    @FXML
    
    public void initialize(URL location, ResourceBundle resources){
        PartNameColumn.setCellValueFactory(cellData -> cellData.getValue().partNameProperty());
        PartIDColumn.setCellValueFactory(new PropertyValueFactory<Part, Integer>("partIdProperty"));
        
        FilteredList<Part> filteredData = new FilteredList<>(masterData, p -> true);
        
        filterField.textProperty().addListener((Observable, oldValue, newValue) -> {filteredData.setPredicate(part ->{
            if (newValue == null || newValue.isEmpty()){
                return true;
            }
            String lowerCaseFilter = newValue.toLowerCase();
            
            if (part.getPartName().toLowerCase().contains(lowerCaseFilter)){
            return true;
        }
            else if (part.getPartID() == Integer.parseInt(newValue)){
            return true;
        }
                return false;
            
            
        });
    });
        SortedList<Part> sortedData = new SortedList<>(filteredData);
        
        sortedData.comparatorProperty().bind(partTable.comparatorProperty());
        
        partTable.setItems(sortedData);
        
        
    
}
}
