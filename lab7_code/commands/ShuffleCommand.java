package commands;

import collectionUsage.CollectionManipulator;
import data.Organization;
import java.util.Collections;
import java.util.Stack;

public class ShuffleCommand extends AbstractCommand {

    public ShuffleCommand(CollectionManipulator collectionManipulator) {
        super(collectionManipulator);
    }

    public String execute() {
        Stack<Organization> organizations = collectionManipulator.getOrganizations();
        Collections.shuffle(organizations);
        return "Collection has been shuffled successfully!";
    }

}