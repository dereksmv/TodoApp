package com.todoapp.todoapp.services;
import java.time.Instant;

import java.sql.Timestamp;

public class Services {
    public static Timestamp generateTimestamp() {
        Instant instant1 = Instant.now();
        Timestamp sqlTimestamp = Timestamp.from(instant1);
        return sqlTimestamp;
    }
}