package com.emu.apps.sample.jackson.restmodel;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.Serializable;
import java.text.ParseException;

public class DateJson implements Serializable {
    private final  DateTimeFormatter FMT = DateTimeFormat.forPattern("dd/MM/yyyy");

    private DateTime dateTime;

    public DateJson(String dateStr) throws ParseException {
        this.dateTime = FMT.parseDateTime(dateStr);
    }

    public DateJson(Long date) {
        this.dateTime = new DateTime(date);
    }

    public DateJson(DateTime date) {
        this.dateTime = date;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }
}