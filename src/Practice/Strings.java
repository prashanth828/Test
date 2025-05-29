package Practice;
public class Strings {
    public static void main(String[] args) {


        int s[][] = {{100, 12}, {20, 30}, {40, 50}};

        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < s[i].length; j++) {

                System.out.println("Element at s["+i+"]["+j+"]="+s[i][j]);
                break;
            }
        }

    }
}
//Element at s[0][0] = 100