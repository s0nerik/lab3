package com.company.ski_pass.accounters;

import com.company.ski_pass.Accountable;

public abstract class PassesAccounter implements Accountable {
    private int passes;

    protected abstract int getPasses();

    protected PassesAccounter() {
        passes = getPasses();
    }

    @Override
    public int getRemaining() {
        return passes;
    }

    @Override
    public void count() {
        passes--;
    }
}
