package Visuel;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.util.Set;

public class ControllerAccueil {

    @FXML
    private ListView<Book> listView;

    private Set<String> stringSet;

    private ObservableList books = FXCollections.observableArrayList();

    @FXML
    private void initialize(){
        Book book1 = new Book(1L, "J01", "Java IO Tutorial");
        Book book2 = new Book(2L, "J02", "Java Enums Tutorial");
        Book book3 = new Book(2L, "C01", "C# Tutorial for Beginners");

        // To Creating a Observable List

        books.add(book1);
        books.add(book2);
        books.add(book3);

        listView.setItems(books);


    }

    /*public void  ListViewController()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Acceuil.fxml"));
        fxmlLoader.setController(this);
        try
        {
            Parent parent = (Parent)fxmlLoader.load();
            Scene scene = new Scene(parent, 400.0 ,500.0);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }*/

    /*public void setListView ()throws Exception
    {
        Stage stage;
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        stage = (Stage) listView.getScene().getWindow();
        Book book1 = new Book(1L, "J01", "Java IO Tutorial");
        Book book2 = new Book(2L, "J02", "Java Enums Tutorial");
        Book book3 = new Book(2L, "C01", "C# Tutorial for Beginners");

        // To Creating a Observable List
        ObservableList<Book> books = FXCollections.observableArrayList(book1, book2, book3);

        // Create a ListView
        ListView<Book> listView = new ListView<Book>(books);

        // To set multiple selection model
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        // Select item at index = 1,2
        listView.getSelectionModel().selectIndices(1, 2);

        // Focus
        listView.getFocusModel().focus(1);

        root.getChildren().add(listView);
    }*/
}
