package templateengine.v2.viewmodelfactories;

import play.mvc.Http;

public interface IViewModelFactory<T> {

    IViewModelFactory<T> collectData(Http.Request request);
    T buildViewModel();
}
