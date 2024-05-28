package com.nkolosnjaji;

import java.nio.file.Path;

public class Main {


    public static void main(String[] args) {
        System.out.println("Test app started");
        Path libSharpYuv = OsUtils.getPathLibSharpYuv();
        System.load(libSharpYuv.toFile().getAbsolutePath());

        Path libWebP = OsUtils.getPathLibWebP();
        System.load(libWebP.toFile().getAbsolutePath());
        System.out.println("Native libraries loaded");
    }
}
