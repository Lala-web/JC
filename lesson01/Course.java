package ru.geekbrains.lesson01;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    void doIt(Team team) {
        Competitor[] competitors = team.getCompetitors();
        if (competitors.length == 0) {
            System.out.println("В команде нет участников");
            return;
        }
        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                team.setResult(o.doit(c));
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
    }
}