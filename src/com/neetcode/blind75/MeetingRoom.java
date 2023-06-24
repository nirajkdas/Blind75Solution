package com.neetcode.blind75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingRoom {
    static class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();

        intervals.add(new Interval(0, 30));
        intervals.add(new Interval(5, 10));
        intervals.add(new Interval(15, 20));

        System.out.println(canAttendMeetings(intervals));
    }

    public static boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (o1, o2) -> {
            if (o1.start > o2.start)
                return 1;
            else
                return -1;
        });
        int endPointTime = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start < endPointTime) {
                return false;
            }
            if (intervals.get(i).end > endPointTime) {
                endPointTime = intervals.get(i).end;
            }
        }
        return true;
    }
}
