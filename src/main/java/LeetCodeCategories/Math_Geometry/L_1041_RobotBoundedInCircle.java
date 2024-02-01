package LeetCodeCategories.Math_Geometry;

public class L_1041_RobotBoundedInCircle {

    enum Directions {
        North,
        South,
        West,
        East
    }
    public static boolean isRobotBounded(String instructions) {
        Directions north = Directions.North;
        Directions south = Directions.South;
        Directions east = Directions.East;
        Directions west = Directions.West;
        Directions direction = north;
        int[] pos = new int[] {0,0};
        for (int j=0;j<5;j++) {
            for (int i=0;i<instructions.length();i++) {
                if(instructions.charAt(i) == 'G') {
                    if (direction == north) pos[0] +=1;
                    else if (direction == south)  pos[0] -=1;
                    else if (direction == east)  pos[1] +=1;
                    else pos[1] -=1;
                } else if(instructions.charAt(i) == 'L') {
                    if(direction == north) direction = west;
                    else if (direction == west) direction = south;
                    else if (direction == south) direction = east;
                    else direction = north;
                } else {
                    if(direction == north) direction = east;
                    else if (direction == east) direction = south;
                    else if (direction == south) direction = west;
                    else direction = north;
                }
            }
            if(pos[0] == 0 && pos[1] == 0) return true;
        }
        return false;
    }
}
