public class arrays {
        arrays(){
            String[][] data={{"a","b","c"},{"e","f","g"}};
            for(String[] i: data){
                for(String j: i){
                    System.out.print(j+"  ");
                }
                System.out.println();
            }
        }

}
