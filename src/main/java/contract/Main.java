package contract;

import contract.impl.PhoneInternetContract;
import contract.impl.PhoneOnlyContract;

public class Main {
    public static void main(String[] args) {
        Contract phoneOnlyContract = new PhoneOnlyContract();
        phoneOnlyContract.unlimitedCalls();
        phoneOnlyContract.threeWayCall();
        phoneOnlyContract.conferenceCall();

        Contract phoneInternetContract = new PhoneInternetContract();
        phoneInternetContract.internetAccess();
        phoneInternetContract.downloadLimit();
        phoneInternetContract.uploadLimit();

    }
}