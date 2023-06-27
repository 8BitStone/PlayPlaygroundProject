package templateengine.v1mix2.viewmodelfactories;

import models.ebean.Address;
import play.mvc.Http;
import templateengine.v1mix2.viewmodelfactories.IViewModelFactory;
import templateengine.v1mix2.viewmodels.FooterViewModel;

public class FooterViewModelFactory implements IViewModelFactory<FooterViewModel> {
    @Override
    public FooterViewModel buildViewModel(Http.Request request) {
        final String adrName = Address.findFirstAddress()
                .map(a -> a.a1Name)
                .orElse("-");

        return new FooterViewModel(adrName);
    }
}
