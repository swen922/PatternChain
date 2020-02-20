package component;

import java.util.ArrayList;
import java.util.List;

public abstract class Container extends Component {

    protected List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        component.setContainer(this);
        components.add(component);
    }
}
