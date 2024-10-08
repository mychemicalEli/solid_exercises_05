package contract.impl;

import contract.Contract;

public class PhoneInternetContract implements Contract {

    @Override
    public void unlimitedCalls() {
        System.out.println("Unlimited calls activated.");
    }

    @Override
    public void onDemandTv() {
        throw new UnsupportedOperationException("On demand TV is not available in this contract.");
    }

    @Override
    public void footballTv() {
        throw new UnsupportedOperationException("Football TV is not available in this contract.");
    }

    @Override
    public void moviesTv() {
        throw new UnsupportedOperationException("Movies TV is not available in this contract.");
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
