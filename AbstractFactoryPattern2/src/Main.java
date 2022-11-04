import abst.Button;
import abst.GuiFac;
import abst.TextArea;
import concrete.FactoryInstance;

public class Main {
    public static void main(String[] args) throws Exception {
        GuiFac fac = FactoryInstance.getGuiFac();
        Button button = fac.createButton();
        TextArea area = fac.createTextArea();

        button.click();
        System.out.println(area.getText());;
    }
}
