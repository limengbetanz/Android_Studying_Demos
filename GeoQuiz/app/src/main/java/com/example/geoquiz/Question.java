package com.example.geoquiz;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int testResId, boolean answerTrue) {
        mTextResId = testResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
