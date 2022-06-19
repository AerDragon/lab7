package commands;

import collectionUsage.CollectionManipulator;
import data.Organization;
import java.util.Stack;

public class SumOfAnnualTurnoverCommand extends AbstractCommand {

    public SumOfAnnualTurnoverCommand(CollectionManipulator collectionManipulator) {
        super(collectionManipulator);
    }

    public String execute() {
        Stack<Organization> organizations = collectionManipulator.getOrganizations();
        double sum = 0;
        for (Organization organization : organizations) {
            sum += organization.getAnnualTurnover();
        }
        return sum + " is sum of all values of annual turnover.";
    }

}

