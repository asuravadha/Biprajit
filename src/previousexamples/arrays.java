package previousexamples;

public class arrays {
    static boolean flag;
    public  boolean data(String input,int r,int c) {
        String[][] data = new String[3][3];

        if (input.equals("reset")) {
            r = 0;
            c = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(r==i && c==j){
                        data[r][c] = "^";
                    }
                    else{
                        data[i][j] = "*";
                    }
                    System.out.print(data[i][j]+" ");
                }
                System.out.println();
            }

        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    data[i][j] = "*";
                }
            }
            if ((r >= 0 && r < 3) && (c >= 0 && c < 3)) {
                data[r][c] = "^";
                for (String[] i : data) {
                    for (String j : i) {
                        System.out.print(j + "  ");
                    }
                    System.out.println();
                }
                flag=true;
            } else{
                flag=false;
            }


        }

        return flag;
    }

}
