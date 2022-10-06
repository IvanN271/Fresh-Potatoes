package personalwork;

import java.util.ArrayList;

public class maze {

    public static void main(String[] args) {
        ArrayList<ArrayList> mazePointsList = new ArrayList<ArrayList>();

        ArrayList<Integer> zeropath = new ArrayList<Integer>();
        ArrayList<Integer> onepath = new ArrayList<Integer>();
        ArrayList<Integer> twopath = new ArrayList<Integer>();
        ArrayList<Integer> threepath = new ArrayList<Integer>();
        ArrayList<Integer> fourpath = new ArrayList<Integer>();
        ArrayList<Integer> fivepath = new ArrayList<Integer>();
        ArrayList<Integer> sixpath = new ArrayList<Integer>();
        ArrayList<Integer> sevenpath = new ArrayList<Integer>();
        ArrayList<Integer> eightpath = new ArrayList<Integer>();
        ArrayList<Integer> ninepath = new ArrayList<Integer>();
        ArrayList<Integer> tenpath = new ArrayList<Integer>();
        ArrayList<Integer> elevenpath = new ArrayList<Integer>();
        ArrayList<Integer> twelvepath = new ArrayList<Integer>();
        ArrayList<Integer> thirteenpath = new ArrayList<Integer>();
        ArrayList<Integer> fourteenpath = new ArrayList<Integer>();
        ArrayList<Integer> fifteenpath = new ArrayList<Integer>();
        ArrayList<Integer> sixteenpath = new ArrayList<Integer>();
        ArrayList<Integer> seventeenpath = new ArrayList<Integer>();
        ArrayList<Integer> eighteenpath = new ArrayList<Integer>();
        ArrayList<Integer> nineteenpath = new ArrayList<Integer>();
        ArrayList<Integer> twentypath = new ArrayList<Integer>();
        ArrayList<Integer> twentyonepath = new ArrayList<Integer>();
        ArrayList<Integer> twentytwopath = new ArrayList<Integer>();
        ArrayList<Integer> twentythreepath = new ArrayList<Integer>();
        ArrayList<Integer> twentyfourpath = new ArrayList<Integer>();

        zeropath.add(1);

        onepath.add(2);

        twopath.add(3);
        twopath.add(7);

        sixpath.add(5);

        sevenpath.add(6);
        sevenpath.add(12);

        eightpath.add(9);
        eightpath.add(13);

        ninepath.add(14);

        elevenpath.add(10);

        twelvepath.add(11);

        fourteenpath.add(19);

        fifteenpath.add(16);

        sixteenpath.add(17);

        seventeenpath.add(18);

        eighteenpath.add(13);
        
        nineteenpath.add(24);

        twentyfourpath.add(23);


        mazePointsList.add(zeropath);
        mazePointsList.add(onepath);
        mazePointsList.add(twopath);
        mazePointsList.add(threepath);
        mazePointsList.add(fourpath);
        mazePointsList.add(fivepath);
        mazePointsList.add(sixpath);
        mazePointsList.add(sevenpath);
        mazePointsList.add(eightpath);
        mazePointsList.add(ninepath);
        mazePointsList.add(tenpath);
        mazePointsList.add(elevenpath);
        mazePointsList.add(twelvepath);
        mazePointsList.add(thirteenpath);
        mazePointsList.add(fourteenpath);
        mazePointsList.add(fifteenpath);
        mazePointsList.add(sixteenpath);
        mazePointsList.add(seventeenpath);
        mazePointsList.add(eighteenpath);
        mazePointsList.add(nineteenpath);
        mazePointsList.add(twentypath);
        mazePointsList.add(twentyonepath);
        mazePointsList.add(twentytwopath);
        mazePointsList.add(twentythreepath);
        mazePointsList.add(twentyfourpath);

        ArrayList<Integer> visited = new ArrayList<Integer>();
        ArrayList<Integer> solution_path = new ArrayList<Integer>();

        mazeSolved(mazePointsList, 0, 23, visited, solution_path);
    }

    public static boolean mazeSolved(ArrayList<ArrayList> mazePointList, int start, int finish,
                                     ArrayList<Integer> visited, ArrayList<Integer> solution_path) {
        if (start == finish) { // A path was found
            solution_path.add(0, start);
            System.out.println("The solution path is ");
            System.out.print(solution_path);
            return true;
        }

        visited.add(start);

        for (int i = 0; i < mazePointList.get(start).size(); i++) {
            int nextPoint = (int) mazePointList.get(start).get(i);
            if (!visited.contains(nextPoint)) {
                if (mazeSolved(mazePointList, nextPoint, finish, visited, solution_path)) {
                    solution_path.add(0, start);
                    System.out.println("The next step in the path is " + start);
                    System.out.println("The solution path is ");
                    System.out.print(solution_path);
                    return true;
                }
            }
        }
        return false;


    }
}
