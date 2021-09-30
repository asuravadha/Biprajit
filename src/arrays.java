public class arrays {
    public  void data(String input,int r,int c){
        String[][] data=new String[3][3];
        if(input.equals("reset")){
            r=0;
            c=0;
           for(int i=0;i<3;i++){
               for(int j=0;j<3;j++){
                   data[i][j]="*";
               }
           }
           data[r][c]="^";
        }
        else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    data[i][j]="*";
                }
            }
            data[r][c]="^";

        }
            for(String[] i: data){
                for(String j: i){
                    System.out.print(j+"  ");
                }
                System.out.println();
            }
        }

}
