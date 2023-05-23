package templateengine.v1.viewmodelfactories;

import play.mvc.Http;
import templateengine.v1.viewmodels.IViewModel;

public interface IViewModelFactory<T extends IViewModel> {
    T buildViewModel(Http.Request request);
}
