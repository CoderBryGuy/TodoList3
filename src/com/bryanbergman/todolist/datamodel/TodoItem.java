package com.bryanbergman.todolist.datamodel;

import java.time.LocalDate;

public class TodoItem {

    private String shortDescription;
    private String StringDetails;
    private LocalDate deadline;

    public TodoItem(String shortDescription, String stringDetails, LocalDate deadline) {
        this.shortDescription = shortDescription;
        StringDetails = stringDetails;
        this.deadline = deadline;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetails() {
        return StringDetails;
    }

    public void setStringDetails(String stringDetails) {
        StringDetails = stringDetails;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return this.shortDescription;
    }
}
