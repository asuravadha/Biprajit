package oct05.implementingabstract;

public class toaccessabs  extends AbsMain implements interfaceclass{

    public static void main(String[] args){
        toaccessabs obj=new toaccessabs();
        obj.data("hai");
        obj.display();
        obj.idisplay();
    }
    @Override
    void data(String value) {
        this.data=value;
    }

    @Override
    public void idisplay() {
        System.out.println(idata);
    }
}
