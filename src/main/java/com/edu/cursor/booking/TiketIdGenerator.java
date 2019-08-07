package com.edu.cursor.booking;

import java.util.concurrent.atomic.AtomicLong;

public class TiketIdGenerator implements SequenceGenerator{

    private AtomicLong id = new AtomicLong(1);

    @Override
    public long getNext() {
        return id.getAndIncrement();
    }
}
