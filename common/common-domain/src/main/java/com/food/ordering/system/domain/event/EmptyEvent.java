package com.food.ordering.system.domain.event;

public class EmptyEvent implements DomainEvent<Void>{
    public static final EmptyEvent INSTANCE = new EmptyEvent();

    public EmptyEvent() {
    }

    @Override
    public void fire() {

    }
}
