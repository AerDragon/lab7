package commands;

import collectionUsage.CollectionManipulator;
import collectionUsage.ValueReceiver;
import data.Organization;
import java.util.Stack;

public class AddCommand extends AbstractCommand{

    public AddCommand(CollectionManipulator collectionManipulator) {
        super(collectionManipulator);
    }

    public String execute() {
        if (collectionManipulator.getCurrentUser() == null) {
            return "You need to login before using this command.";
        }
        Stack<Organization> organizations = collectionManipulator.getOrganizations();
        organizations.add(new ValueReceiver(collectionManipulator).receiveOrganization());
        return "Element has been added successfully.";
    }

}