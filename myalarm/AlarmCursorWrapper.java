package com.orm.myalarm;

import android.database.Cursor;
import android.database.CursorWrapper;

import java.util.UUID;



public class AlarmCursorWrapper extends CursorWrapper {

    public AlarmCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Alarm getAlarm() {
        String alarmId = getString(getColumnIndex(AlarmDbSchema.AlarmTable.Cols.ALARMID));
        int hour = getInt(getColumnIndex(AlarmDbSchema.AlarmTable.Cols.HOUR));
        int minute = getInt(getColumnIndex(AlarmDbSchema.AlarmTable.Cols.MINUTE));
        int repeat = getInt(getColumnIndex(AlarmDbSchema.AlarmTable.Cols.REPEAT));
        String days = getString(getColumnIndex(AlarmDbSchema.AlarmTable.Cols.DAYSOFTHEWEEK));
        int on = getInt(getColumnIndex(AlarmDbSchema.AlarmTable.Cols.ON));
        int difficulty = getInt(getColumnIndex(AlarmDbSchema.AlarmTable.Cols.DIFFICULTY));
        String tone = getString(getColumnIndex(AlarmDbSchema.AlarmTable.Cols.ALARMTONE));
        int snooze = getInt(getColumnIndex(AlarmDbSchema.AlarmTable.Cols.SNOOZE));
        int vibrate = getInt(getColumnIndex(AlarmDbSchema.AlarmTable.Cols.VIBRATE));

        Alarm alarm = new Alarm(UUID.fromString(alarmId));
        alarm.setHour(hour);
        alarm.setMinute(minute);
        alarm.setRepeat(repeat != 0);
        alarm.setRepeatDays(days);
        alarm.setIsOn(on != 0);
        alarm.setDifficulty(difficulty);
        alarm.setAlarmTone(tone);
        alarm.setSnooze(snooze);
        alarm.setVibrate(vibrate != 0);

        return alarm;
    }
}
