package linux;

import abst.Button;
import abst.GuiFac;
import abst.TextArea;

public class LinuxGuiFac implements GuiFac{

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
    
}
