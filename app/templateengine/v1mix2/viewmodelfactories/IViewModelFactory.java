package templateengine.v1mix2.viewmodelfactories;

import play.mvc.Http;

public interface IViewModelFactory<T> {
    T buildViewModel(Http.Request request);
}
