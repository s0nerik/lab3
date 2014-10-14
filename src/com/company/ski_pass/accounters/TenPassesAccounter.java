package com.company.ski_pass.accounters;

public class TenPassesAccounter extends PassesAccounter {
    @Override
    protected int getPasses() {
        return 10;
    }
}
