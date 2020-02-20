package component;

public class Panel extends Container {

    private String modalHelpText;

    @Override
    public void showHelp() {
        if (modalHelpText != null && !modalHelpText.isEmpty()) {
            System.out.println(modalHelpText);
        }
        else {
            super.showHelp();
        }
    }

    public String getModalHelpText() {
        return modalHelpText;
    }

    public void setModalHelpText(String modalHelpText) {
        this.modalHelpText = modalHelpText;
    }
}
