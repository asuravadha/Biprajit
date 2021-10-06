package oct05.polymor;

class sampleobjpassing {
    public static void main(String[] args){
        objhandling d1=new objhandling("Eswar");
        objhandling d2=new objhandling("Anjali");
        objhandling d3=new objhandling("karan");
        objhandling d4=new objhandling("mahesh");
        d1.display(d2);
    }
}

class objhandling{
    String data="";

    public objhandling(String data) {
        this.data = data;
    }
    public void display(objhandling obj){
            System.out.println(obj.data);
    }

}
