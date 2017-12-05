package com.example.android.habittrackerapp.data;

import android.provider.BaseColumns;

public final class HabitContract {
    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class HabitEntry implements BaseColumns {

        /** Name of database table for habit listing */
        public final static String TABLE_NAME = "Habits";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_HABIT_NAME ="Name";

        public final static String COLUMN_HABIT_TIMINGS = "timings";

        public final static String COLUMN_HABIT_SCHEDULE = "schedule";

        /**
         * Possible values for the gender of the pet.
         */
        public static final int WEEKDAYS = 0;
        public static final int WEEKENDS = 1;
        public static final int DAILY = 2;
    }
}
