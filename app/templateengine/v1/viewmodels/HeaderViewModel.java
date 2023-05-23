package templateengine.v1.viewmodels;

import play.mvc.Call;

import java.util.List;

public class HeaderViewModel{

    public final List<NavPointViewModel> navPoints;

    public HeaderViewModel(List<NavPointViewModel> navPoints) {
        this.navPoints = navPoints;
    }

    public static class NavPointViewModel{
        public final String name;
        public final Call call;
        public final boolean isActive;

        public NavPointViewModel(String name, Call call, boolean isActive) {
            this.name = name;
            this.call = call;
            this.isActive = isActive;
        }
    }
}
