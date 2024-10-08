package contract.impl;

import contract.Contract;

public class PhoneOnlyContract implements Contract {

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
        throw new UnsupportedOperationException("Internet is not available in this contract.");
    }

    @Override
    public void downloadLimit() {
        throw new UnsupportedOperationException("Download limit is not available in this contract.");
    }

    @Override
    public void uploadLimit() {
        throw new UnsupportedOperationException("Upload limit is not available in this contract.");
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
