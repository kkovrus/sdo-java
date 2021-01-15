package com.example.myapplication;

public class Question {
    private int questionId;
    private boolean questionAnswer;

    public Question(int questionId, boolean questionAnswer) {
        this.questionId = questionId;
        this.questionAnswer = questionAnswer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public boolean isQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(boolean questionAnswer) {
        this.questionAnswer = questionAnswer;
    }
}
