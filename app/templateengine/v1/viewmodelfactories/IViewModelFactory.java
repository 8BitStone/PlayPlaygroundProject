package templateengine.v1.viewmodelfactories;

import play.mvc.Http;

public interface IViewModelFactory<T> {
    T buildViewModel(Http.Request request);
}
