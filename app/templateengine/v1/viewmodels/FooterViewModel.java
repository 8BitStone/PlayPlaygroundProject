package templateengine.v1.viewmodels;

import models.ebean.Address;

import javax.annotation.Nullable;
import java.util.Optional;

public class FooterViewModel implements IViewModel {
    public final String primeAddressName;

    public FooterViewModel(String primeAddressName) {
        this.primeAddressName = primeAddressName;
    }
}
