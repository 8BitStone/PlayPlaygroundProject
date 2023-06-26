package templateengine.v2.viewmodelfactories;

import play.mvc.Http;

public interface IViewModelFactory<T> {

    IViewModelFactory<T> gatherData(Http.Request request);
    T buildViewModel();
}
