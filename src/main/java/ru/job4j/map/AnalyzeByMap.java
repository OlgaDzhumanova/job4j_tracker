package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int rsl = 0;
        double average = 0D;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                average += subject.score();
                rsl++;
            }
        }
        return average / rsl;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        int rsl = 0;
        double avaragePupil = 0D;
        List<Label> listPupils = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                avaragePupil += subject.score();
                rsl++;
            }
            avaragePupil /= rsl;
            listPupils.add(new Label(pupil.name(), avaragePupil));
            avaragePupil = 0D;
            rsl = 0;
        }
        return listPupils;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        int rsl = 0;
        Map<String, Integer> mapSubject = new LinkedHashMap<>();
        List<Label> listSubject = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (!mapSubject.containsKey(subject.name())) {
                    mapSubject.put(subject.name(), subject.score());
                } else {
                    mapSubject.put(subject.name(), mapSubject.get(subject.name())
                            + subject.score());
                }
            }
            rsl++;
        }
        for (String key : mapSubject.keySet()) {
            listSubject.add(new Label(key, mapSubject.get(key) / rsl));
        }
        return listSubject;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        double avaragePupil = 0D;
        List<Label> listPupils = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                avaragePupil += subject.score();
            }
            listPupils.add(new Label(pupil.name(), avaragePupil));
            avaragePupil = 0D;
        }
        Collections.sort(listPupils, Comparator.naturalOrder());
        return listPupils.get(listPupils.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> mapSubject = new LinkedHashMap<>();
        List<Label> listSubject = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (!mapSubject.containsKey(subject.name())) {
                    mapSubject.put(subject.name(), subject.score());
                } else {
                    mapSubject.put(subject.name(), mapSubject.get(subject.name())
                            + subject.score());
                }
            }
        }
        for (String key : mapSubject.keySet()) {
            listSubject.add(new Label(key, mapSubject.get(key)));
        }
        Collections.sort(listSubject, Comparator.naturalOrder());
        return listSubject.get(listSubject.size() - 1);
    }
}