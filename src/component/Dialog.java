package component;

public class Dialog extends Container {

    private String dialogHelp;

    @Override
    public void showHelp() {
        if (dialogHelp != null && !dialogHelp.isEmpty()) {
            System.out.println(dialogHelp);
        }
        else {
            super.showHelp();
        }
    }

    public String getDialogHelp() {
        return dialogHelp;
    }

    public void setDialogHelp(String dialogHelp) {
        this.dialogHelp = dialogHelp;
    }
}
