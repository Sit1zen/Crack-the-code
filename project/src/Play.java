import resources.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;


public class Play {

    public static List<Resource> getResources(String filename, int resources){
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // going through them to get to needed stuff
        int capital = scanner.nextInt();
        int res = scanner.nextInt();
        int turns = scanner.nextInt();

        scanner.nextLine();

        List<String[]> resourceList = new ArrayList<>();
        for(int i = 0; i < resources; i++){
            String[] line = scanner.nextLine().strip().split(" ");
            resourceList.add(line);
        }


        List<Resource> allResources = new ArrayList<>();
        for(String[] line : resourceList){
            Resource resource;

            switch(line[7]){
                case "A":
                    resource = new SmartMeter(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]), Integer.parseInt(line[6]), line[7], Integer.parseInt(line[8]));
                    allResources.add(resource);
                case "B":
                    resource = new DistributionFacility(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]), Integer.parseInt(line[6]), line[7], Integer.parseInt(line[8]));
                    allResources.add(resource);
                case "C":
                    resource = new MaintanancePlan(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]), Integer.parseInt(line[6]), line[7], Integer.parseInt(line[8]));
                    allResources.add(resource);
                case "D":
                    resource = new RenewablePlan(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]), Integer.parseInt(line[6]), line[7], Integer.parseInt(line[8]));
                    allResources.add(resource);
                case "E":
                    resource = new Accumulator(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]), Integer.parseInt(line[6]), line[7], Integer.parseInt(line[8]));
                    allResources.add(resource);
                case "X":
                    resource = new BaseResource(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]), Integer.parseInt(line[6]), line[7]);
                    allResources.add(resource);
            }

            
        }

        scanner.close();

        return allResources;
    }

    public static List<String[]> getTurns(String filename, int turns){

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // going through them to get to needed stuff
        int capital = scanner.nextInt();
        int resources = scanner.nextInt();
        int tr = scanner.nextInt();

        // going through unneeded resources
        for(int i = 0; i <= resources; i++){
            scanner.nextLine();
        }


        List<String[]> allTurns = new ArrayList<>();
        for(int i = 0; i < turns; i++){
            String[] line = scanner.nextLine().strip().split(" ");
            allTurns.add(line);
        }


        scanner.close();

        return allTurns;
    }



    public static void main(String[] args) throws Exception {
        String filename = "filename.txt";

        Scanner scanner = new Scanner(new File(filename));
        int capital = scanner.nextInt();
        int resources = scanner.nextInt();
        int turns = scanner.nextInt();

        List<Resource> allResources = getResources(filename, resources);
        List<String[]> allTurns = getTurns(filename, turns);

    }
}
