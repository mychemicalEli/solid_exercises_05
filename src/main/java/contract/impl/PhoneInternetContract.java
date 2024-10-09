package contract.impl;

import contract.InternetContract;
import contract.PhoneContract;

public class PhoneInternetContract implements InternetContract, PhoneContract {

    @Override
    public void unlimitedCalls() {
        System.out.println("Unlimited calls activated.");
    }

    @Override
    public void internetAccess() {
        System.out.println("Internet access activated.");
    }

    @Override
    public void downloadLimit() {
        System.out.println("Download limit set.");
    }

    @Override
    public void uploadLimit() {
        System.out.println("Upload limit set.");
    }

    @Override
    public void threeWayCall() {
        System.out.println("Three-way call activated.");
    }

    @Override
    public void conferenceCall() {
        System.out.println("Conference call activated.");
    }

}
