package TaskOne.src;

import TaskOne.src.util.FileIO;
import TaskOne.src.util.TextUI;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    public List<Item> itemList;
    public String path;
    public FileIO io = new FileIO();
    public TextUI ui = new TextUI();


    public TodoList(String path) {
        itemList = new ArrayList<>();
        this.path = path;
        this.parseTodoListData();

    }


    // CSVfile framework
    public Item createTodoListFromString(String todoString){
        String[] todoParts = todoString.split(",");
        String description = todoParts[0];
        boolean isDone = todoParts[1].trim().equalsIgnoreCase("Done");

        return new Item(description, isDone);
    }


    // Parse data from program to CSVfile
    public void parseTodoListData(){
        ArrayList<String> itemsList = io.readData(path);
            for(String lineData : itemsList){
                Item item = createTodoListFromString(lineData);
                itemList.add(item);
            }
    }


    public void displayList(){
        int count = 1;
            for(Item item : itemList){
                System.out.println(count + ": " + item);
                count++;
            }
    }

    //Main program that branches out to different methods to start new dialogs, and display them for the user
    public void runDialog(){
        ArrayList<String> optionsList = new ArrayList<>();
        optionsList.add("tilføj til todo liste");
        optionsList.add("Fjern fra todo liste");
        optionsList.add("Vis min todo liste");
        optionsList.add("Luk programmet");
        ui.displayMsg("Todo liste");
        boolean proceed = true;

        while(proceed){         //Switch case will run until proceed = false, which only happens in case4
            int choice = ui.promptChoice(optionsList, "Hvad vil du?");

                switch(choice){
                    case 1:
                        ui.displayMsg("Tilføj til todo liste");
                        addToTodoDialog();
                        saveUserData();
                        break;
                    case 2:
                        ui.displayMsg("Fjern fra todo liste");
                        removeFromTodoDialog();
                        saveUserData();
                        break;
                    case 3:
                        ui.displayMsg("Vis min todo liste");
                        todoOptionDialog();
                        saveUserData();
                        break;
                    case 4:
                        ui.displayMsg("Luk programmet");
                        saveUserData();
                        proceed = false;
                        break;
            }
        }
    }

    // Method for adding the user choice to todoList
    public void addToTodoDialog(){
        String choice = ui.promptText("Hvad vil du gerne tilføje til listen?");
        this.itemList.add(new Item(choice, false));
        ui.displayMsg("Tilføjet til todo liste");
    }

    // Method for displaying the list and giving the user option to remove
    public void removeFromTodoDialog(){
        displayList();
        int choice = ui.promptNumeric("Hvad vil du have fjernet fra todo listen?", itemList.size());
        itemList.remove(choice - 1);
        ui.displayMsg(itemList.get(choice - 1).getDescription() + " er blevet fjernet fra todo listen!");
    }

    // Method for displaying todoList and gives the user choice to set as done or to remove if it is already set to done
    public void todoOptionDialog(){
        displayList();
        boolean choice = ui.promptBinary("Vil du have noget krydset af listen? Y/N", "Y", "N"); // Do something if accepted, else dont

        if(choice){
            int choiceYes = ui.promptNumeric("Hvad vil du have krydset af listen?", itemList.size());
            Item chosenItem = itemList.get(choiceYes - 1);

            // if item is already done remove it, else set it as done
            if (chosenItem.isDone()){
                itemList.remove(choiceYes - 1);
            } else{
                chosenItem.setDone(true);
            }
            ui.displayMsg(chosenItem.getDescription() + " er blevet krydset af listen");
        }
        // There is no code for the reject value, so it just returns to runDialog
    }

    // Save data method with three parameters, header must match CSVfile
    private void saveUserData(){
        io.saveData("Discription, Done", new ArrayList<>(itemList), path);
    }


}
