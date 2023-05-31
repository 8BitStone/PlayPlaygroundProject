package templateengine.v2.viewmodels;

import java.util.List;

public class HeaderViewModel{

    public final List<NavPointViewModel> navPoints;

    public HeaderViewModel(List<NavPointViewModel> navPoints) {
        this.navPoints = navPoints;
    }

    public static class NavPointViewModel{
        public final String name;
        public final String path;
        public final boolean isActive;

        public NavPointViewModel(String name, String path, boolean isActive) {
            this.name = name;
            this.path = path;
            this.isActive = isActive;
        }
    }
}
