package com.gupao.study.pattern.factory.simplefactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        StudyPlan javaStudyPlan = (StudyPlan) SimpleFactory.createPlan(StudyPlan.class);
        javaStudyPlan.print();

        ExercisePlan exercisePlan = (ExercisePlan) SimpleFactory.createPlan(ExercisePlan.class);
        exercisePlan.print();
    }
}
