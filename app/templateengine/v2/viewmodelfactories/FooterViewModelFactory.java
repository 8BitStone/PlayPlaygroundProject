package templateengine.v2.viewmodelfactories;

import models.ebean.Address;
import play.mvc.Http;
import templateengine.v2.viewmodels.FooterViewModel;

public class FooterViewModelFactory implements IViewModelFactory<FooterViewModel> {
    @Override
    public FooterViewModel buildViewModel(Http.Request request) {
        final String adrName = Address.findFirstAddress()
                .map(a -> a.a1Name)
                .orElse("-");

        return new FooterViewModel(adrName);
    }
}
