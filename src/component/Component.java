package component;

public abstract class Component implements ContextualHelp {

    private String toolTypeText;
    protected Container container;

    @Override
    public void showHelp() {
        if (toolTypeText != null && !toolTypeText.isEmpty()) {
            System.out.println(toolTypeText);
        }
        else {
            container.showHelp();
        }
    }

    @Override
    public void setToolTypeText(String text) {
        this.toolTypeText = text;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}
