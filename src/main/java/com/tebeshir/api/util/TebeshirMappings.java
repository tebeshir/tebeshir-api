package com.tebeshir.api.util;

/**
 * Created by yeko on 31/12/15.
 */
public final class TebeshirMappings {

    public static final String BOARDS = "boards";
    public static final String USERS = "users";

    // discoverability

    public static final class Singular {

        public static final String BOARD = "board";
        public static final String USER = "user";

    }

    public static final String AUTHENTICATION = "authentication";

    private TebeshirMappings() {
        throw new AssertionError();
    }

    // API

}