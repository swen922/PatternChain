import component.*;

public class GUI {

    private Dialog dialog;
    private Panel panel;
    private Button okButton;
    private Button cancelButton;

    public void fillGUI() {
        dialog = new Dialog();
        dialog.setDialogHelp("Dialog helps to get Truth");
        panel = new Panel();
        panel.setModalHelpText("Panel helps to show Truth to user");
        okButton = new Button();
        okButton.setToolTypeText("Button OK helps to do OK");
        cancelButton = new Button();
        cancelButton.setToolTypeText("Button Cancel helps to do Cancel");

        panel.addComponent(okButton);
        panel.addComponent(cancelButton);
        dialog.addComponent(panel);

    }

    public void showHelpOKButton() {
        okButton.showHelp();
    }


}
